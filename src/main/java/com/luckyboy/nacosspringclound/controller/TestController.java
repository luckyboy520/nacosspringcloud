package com.luckyboy.nacosspringclound.controller;

import com.luckyboy.nacosspringclound.config.PropertiesValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description:
 * @author: LuckyBoy
 * @create: 2020-08-14 10:31
 **/
@RestController
@RefreshScope
public class TestController {
//    @Value(value = "${sys.thisUrl}")
    private String thisUrl;
    @Value(value = "${user.name}")
    private String userName;


    @GetMapping("/test")
    public String one () {
        System.out.println("1111111111111111111111111111888888888888888888888888888");
        return thisUrl + "------------------" + userName;
    }

}
