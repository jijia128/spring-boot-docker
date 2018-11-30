package com.neo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DockerController {
    @RequestMapping("/")
    public String index() {
        Logger logger = LoggerFactory.getLogger(DockerController.class);
        logger.info("▄︻┻┳═一 - - - - ->Hello Docker!"+System.currentTimeMillis());
        return "▄︻┻┳═一 - - - - ->Hello Docker!";
    }
}