package com.first.note.data.controller;

import com.first.note.common.ResultMap;
import com.first.note.data.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/upload")
    public ResultMap upload(@RequestParam MultipartFile file) throws Exception {
        return fileService.upload(file);
    }

    @RequestMapping(value = "/getAll")
    public ResultMap getAll() {
        return fileService.getAll();
    }
}
