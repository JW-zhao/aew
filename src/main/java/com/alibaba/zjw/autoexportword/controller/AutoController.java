package com.alibaba.zjw.autoexportword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutoController {
    /**
     * jar current  file
     */
    private static String PATH= System.getProperty("user.dir");

    @GetMapping("/start")
    public void start(){
        //load excel
        System.out.println("修改");
    }

}
