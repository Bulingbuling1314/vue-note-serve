package com.first.note.feign.controller;

import com.first.note.common.ResultMap;
import com.first.note.data.controller.DataController;
import com.first.note.feign.client.FeignClients;
import com.first.note.feign.service.FeignService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/client")
public class FeignController {
    private final Logger log = LoggerFactory.getLogger(DataController.class);

    @Autowired
    FeignClients feignClients;

    @Autowired
    private FeignService feignService;

    @RequestMapping("/weather")
    public ResultMap getWether(@RequestParam String cityName){
        log.info(cityName);
        return feignService.getWether(cityName);
    }
}
