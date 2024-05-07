package com.example.demo.controller;

import com.example.demo.scope.RequestScopeBean;
import com.example.demo.scope.SessionScopeBean;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Autowired
    private RequestScopeBean requestScopeBean;

    @Autowired
    private SessionScopeBean sessionScopeBean;

    @Autowired
    @Resource(name = "testServiceImp")
    private TestService service;


    @GetMapping("message")
    private String getMessage() {
        return requestScopeBean.getMessage();
    }

    @GetMapping("message/session")
    private String getSessionMessage() {
        return sessionScopeBean.getMessage();
    }

}
