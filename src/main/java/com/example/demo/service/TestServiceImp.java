package com.example.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestServiceImp implements TestService {
    public void test() {
        log.info("Test Imp 1");
    }
}
