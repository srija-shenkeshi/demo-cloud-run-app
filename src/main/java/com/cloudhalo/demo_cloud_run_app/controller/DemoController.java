package com.cloudhalo.demo_cloud_run_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static com.cloudhalo.demo_cloud_run_app.pubsub.PublisherExample.publisherExample;
import static com.cloudhalo.demo_cloud_run_app.pubsub.SubscribeAsyncExample.subscribeAsyncExample;

@RestController
public class DemoController {

    @GetMapping("/")
    public void testTopic() throws IOException, ExecutionException, InterruptedException {
        publisherExample("srija-my-project", "my-topic");
        //subscribeAsyncExample("srija-my-project", "my-sub");
    }


    @GetMapping("/welcome")
    public String welcomeMsg(){
        return "Hi this is Srija's App";
    }

    @GetMapping("/getApp")
    public String getAppName(){
        return "App Name: demo-cloud-run-app";
    }

    @GetMapping("/{name}")
    public String getName(@PathVariable String name){
        return "Hi " + name + "!!";
    }
}