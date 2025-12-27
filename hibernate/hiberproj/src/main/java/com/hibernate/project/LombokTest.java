package com.hibernate.project;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class LombokTest {

    private String message;

    public static void test() {
        LombokTest t = new LombokTest();
        t.setMessage("Hello Lombok");
        log.info("Message: {}", t.getMessage());
        log.info("Somehting:{}", t.getMessage());
    }
}
