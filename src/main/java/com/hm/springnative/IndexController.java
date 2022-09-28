package com.hm.springnative;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {
    @GetMapping("/")
    public String index(@RequestHeader("Host") String host){
        return host;
    }
}
