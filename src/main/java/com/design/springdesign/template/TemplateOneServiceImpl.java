package com.design.springdesign.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lobster
 */
@Slf4j
@Service
public class TemplateOneServiceImpl extends AbstractTemplate {
    @Override
    void stepOne(String str) {
        log.info("---执行模板一 stepOne---");
    }

    @Override
    void stepTwo(String str) {
        log.info("---执行模板一 stepTwo---");
    }

    @Override
    void stepThree(String str) {
        log.info("---执行模板一 stepThree---");
    }

    @Override
    void stepFour(String str) {
        log.info("---执行模板一 stepFour---");
    }
}
