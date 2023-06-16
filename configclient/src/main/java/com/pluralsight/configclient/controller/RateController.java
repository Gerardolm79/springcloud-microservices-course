package com.pluralsight.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {
    
    @Value("${rate}")
    @Autowired
    String rate;

    @Value("${lanecount}")
    String lanecount;

    @RequestMapping("/rate")
    public String getRate(Model model){
        
        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", lanecount);
        

        return "rateview";
    }


}
