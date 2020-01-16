package com.web.controller;

import com.web.Config.myannotation.SystemControllerLog;
import com.web.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class indexController {
    @Autowired
    private IndexService indexService;

    @RequestMapping("/list")
    @SystemControllerLog
    public String getlist(){
        return "controller_getlist"+indexService.get();
    }
}
