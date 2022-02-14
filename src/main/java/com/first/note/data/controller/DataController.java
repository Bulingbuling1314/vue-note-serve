package com.first.note.data.controller;

import com.first.note.common.ResultMap;
import com.first.note.data.entity.DataEntity;
import com.first.note.data.service.DataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/note")
public class DataController {
    private final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/save")
    public ResultMap create(@RequestBody DataEntity data) {
        return dataService.create(data);
    }
    @RequestMapping(value = "/getById")
    public ResultMap create(@RequestParam int id) {
        return dataService.find(id);
    }
    @RequestMapping(value = "/getAll")
    public ResultMap create() {
        return dataService.findAll();
    }
    @RequestMapping(value = "/remove")
    public ResultMap remove(@RequestParam int id) {
        return dataService.remove(id);
    }
}
