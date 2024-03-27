package com.design.springdesign.template;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lobster
 */
@Slf4j
@RestController
@RequestMapping("template")
public class TemplateController {

    @Resource
    private TemplateOneServiceImpl templateOneService;
    @Resource
    private TemplateTwoServiceImpl templateTwoService;

    @GetMapping(value = "demo", name = "模板方法入口")
    public void templateDemo(String str) {
        //执行模板一的方法
        templateOneService.execute(str);
        log.info("-------------------------------------------------");
        //执行模板二的方法
        templateTwoService.execute(str);
    }
}
