package com.cloudhalo.demo_cloud_run_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String welcomeMsg(){
        return "Hi this is Srija's App";
    }

    @GetMapping("/getApp")
    public String getAppName(){
        return "App Name: demo-cloud-run-app";
    }
}