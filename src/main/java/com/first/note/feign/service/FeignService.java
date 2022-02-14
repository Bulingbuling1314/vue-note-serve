package com.first.note.feign.service;

import com.alibaba.fastjson.JSON;
import com.first.note.common.ResultMap;
import com.first.note.data.controller.DataController;
import com.first.note.feign.client.FeignClients;
import com.first.note.feign.dao.FeignDo;
import com.first.note.feign.entity.FeignEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FeignService {
    private final Logger log = LoggerFactory.getLogger(DataController.class);
    @Resource
    private FeignDo feignDo;

    @Autowired
    FeignClients feignClients;
    ResultMap resultMap;

    public ResultMap getWether(String cityName) {
        FeignEntity fe = feignDo.getByCityName(cityName);
        if(null == fe) {
            return resultMap.error(500, "没有找到你要查询的城市！");
        } else {
            return resultMap.ok(feignClients.getWether(fe.getCityId()).get("value"));
        }
    }
}
