package com.hook.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wordnik.swagger.annotations.Api;

@RestController
@RequestMapping("/mock")
@Api(basePath = "/mock", value = "mock", description = "MockController", produces = "application/json")
public class MockController {
    
    //ignore spring security, depois deixa os usuários padrão
    @RequestMapping(method = RequestMethod.GET)
    public String post() {
        return "teste";
    }

}
