package org.x.xi.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "hello-svc.hello")
public interface FClient {

    @GetMapping("ping")
    String ping();
}
