package com.design.springdesign.template;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author lobster
 */
@Slf4j
@Service
public class TemplateTwoServiceImpl extends AbstractTemplate {
    @Override
    void stepOne(String str) {
        log.info("---执行模板二 stepOne---");
    }

    @Override
    void stepTwo(String str) {
        log.info("---执行模板二 stepTwo---");
    }

    @Override
    void stepThree(String str) {
        log.info("---执行模板二 stepThree---");
    }

    @Override
    void stepFour(String str) {
        log.info("---执行模板二 stepFour---");
    }
}
