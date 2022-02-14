package com.first.note.feign.client;


import com.first.note.common.ResultMap;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="user-service", url="http://aider.meizu.com/app")
public interface FeignClients {
    @RequestMapping(value = "/weather/listWeather", method = RequestMethod.GET)
    ResultMap getWether(@RequestParam int cityIds);
}
