package com.cloudhalo.demo_cloud_run_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String getProjectName(){
        return "Project Name: demo-cloud-run-app";
    }
}