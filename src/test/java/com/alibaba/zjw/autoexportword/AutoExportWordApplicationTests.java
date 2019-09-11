package com.alibaba.zjw.autoexportword;

import com.alibaba.zjw.autoexportword.controller.AutoController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AutoExportWordApplicationTests {

    @Autowired
    private AutoController controller;

    @Test
    public void contextLoads() {
        controller.start();
    }

}
