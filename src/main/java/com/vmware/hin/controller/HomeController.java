package com.vmware.hin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String getIndexPage(){
        return "<img src='/vmware-explore-sg.png'><br/><img src='/nyan-cat.gif'/>";
    }

}
