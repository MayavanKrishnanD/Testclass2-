package io.springboot.mytest.Bean;

import lombok.extern.java.Log;
import org.springframework.stereotype.Component;


@Component
@Log
public class MyTestBean {

    public void testMethod() {
        log.info("Executing testMethod in MyTestBean");
    }

    }
