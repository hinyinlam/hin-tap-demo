package com.vmware.hin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class HomeController {
    Logger log = Logger.getLogger(this.getClass().getName());
    @GetMapping("/")
    public String getIndexPage(){
        log.info("Testing from Hin");
        return "<img src='/vmware-explore-sg.png'><br/><br/><a href='/v3/api-docs'>OpenAPI v3 for this app</a>";
    }

}
