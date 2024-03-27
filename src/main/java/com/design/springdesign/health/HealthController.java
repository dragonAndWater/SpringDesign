package com.design.springdesign.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lobster
 */
@RestController
@RequestMapping("/health")
public class HealthController {


    @GetMapping(value = "/beat", name = "健康检查")
    public String healthBeat() {
        return "success";
    }
}
