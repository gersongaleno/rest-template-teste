package com.github.gersongaleno.resttemplateteste.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.gersongaleno.resttemplateteste.service.ApiService;

@Controller
public class ExemploRestController {

    @Autowired
    private ApiService apiService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String helloCliente() throws JsonProcessingException {

        return apiService.getConselho();
    }
}
