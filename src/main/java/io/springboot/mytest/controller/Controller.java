package io.springboot.mytest.controller;

import io.springboot.mytest.Bean.MyTestBean;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class Controller {

    @Value("${mytest.name}")
    private String myTestName;

    private  MyTestBean myTestBean;

    public  Controller (MyTestBean myTestBean) {

        this.myTestBean = myTestBean;
    }
    @GetMapping("/test")
    public String test() {

        log.info("Value of mytest.name: " + myTestName);
        myTestBean.testMethod();
        return "Value printed in log and test method called.";
    }

}
