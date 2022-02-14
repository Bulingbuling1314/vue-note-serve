package com.first.note.data.service;

import com.first.note.common.ResultMap;
import com.first.note.data.dao.FileDo;
import com.first.note.data.entity.FileEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Service
public class FileService {
    ResultMap resultMap = new ResultMap();

    @Resource
    private FileDo fileDo;

    public ResultMap upload(MultipartFile file) throws Exception {
        FileEntity fileRes = new FileEntity();
        String path = "/Users/apple/Desktop/demo/node-vue-label/note-server/file";
        File targetFile = new File(path);
        if(!targetFile.exists()) {
            targetFile.mkdirs();
        }

        String fileName = file.getOriginalFilename();
        File fileResultPath = new File(path + "/" + fileName);
        if(fileResultPath.exists()) {
            return resultMap.ok(500, "图片已存在");
        }
        file.transferTo(fileResultPath);
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
        fileRes.setFileName(fileName);
        fileRes.setFilePath(fileResultPath.getPath());
        fileRes.setUploadDate(dateFormat.format(date));
        fileDo.save(fileRes);

        return resultMap.ok("ok");
    }

    public ResultMap getAll() {
        List<FileEntity> fileList = fileDo.findAll();
        return resultMap.ok(fileList);
    }
}
