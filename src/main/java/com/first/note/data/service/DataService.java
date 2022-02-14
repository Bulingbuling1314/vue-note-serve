package com.first.note.data.service;

import com.first.note.common.ResultMap;
import com.first.note.data.dao.DataDo;
import com.first.note.data.entity.DataEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DataService {
    private final Logger log = LoggerFactory.getLogger(DataService.class);

    ResultMap resultMap = new ResultMap();
    @Resource
    private DataDo dataDo;
    public ResultMap create(DataEntity data) {
        dataDo.save(data);
        return resultMap.ok(dataDo.findById(data.getId()));
    }

    public ResultMap find(int id) {
        return resultMap.ok(dataDo.findById(id).get());
    }
    public ResultMap findAll() {
        return resultMap.ok(dataDo.findAll());
    }
    public ResultMap remove(int id) {
        dataDo.deleteById(id);
        return resultMap.ok("操作成功！");
    }
}
