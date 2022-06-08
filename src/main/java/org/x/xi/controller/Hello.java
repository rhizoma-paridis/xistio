package org.x.xi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    private FClient fClient;


    @GetMapping("echo/1")
    public String echo1() {
        String ping = fClient.ping();
        return ping;
    }
}
