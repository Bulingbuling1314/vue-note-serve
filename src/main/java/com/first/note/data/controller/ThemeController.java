package com.first.note.data.controller;

import com.first.note.common.ResultMap;
import com.first.note.data.service.ThemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/theme")
@CrossOrigin
public class ThemeController {

    @Autowired
    private ThemeService themeService;

    @RequestMapping(value = "/findByFlag")
    @CrossOrigin
    public ResultMap create() {
        return themeService.findByFlag(1);
    }

    @RequestMapping(value = "/update")
    public ResultMap create(@RequestParam int id) {
        return themeService.update(id);
    }
}
