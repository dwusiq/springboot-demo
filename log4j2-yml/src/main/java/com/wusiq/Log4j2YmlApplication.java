package com.wusiq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class Log4j2YmlApplication {

    public static void main(String[] args) {
        recordLog();
       // SpringApplication.run(Log4j2YmlApplication.class, args);
    }


    public static void recordLog() {
        log.debug("debug");
        log.info("info");
        log.warn("warn");
        log.error("error");
    }
}
