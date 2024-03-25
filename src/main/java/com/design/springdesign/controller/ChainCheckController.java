package com.design.springdesign.controller;

import com.design.springdesign.chainCheck.ChainCheckFactory;
import com.design.springdesign.chainCheck.ChainCheckService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author pc
 */
@RestController
@RequestMapping("/chain/check")
public class ChainCheckController {

    @Resource
    ChainCheckFactory chainCheckFactory;

    @PostMapping("/start")
    public void start(String request) {
        ChainCheckService initNode = chainCheckFactory.getInitNode();
        initNode.check(request);
    }
}
