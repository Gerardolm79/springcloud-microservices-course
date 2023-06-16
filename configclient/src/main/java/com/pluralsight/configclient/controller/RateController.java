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

    @Value("${connstring}")
    String connectionstring;

    @RequestMapping("/rate")
    public String getRate(Model model){
        
        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", lanecount);
        model.addAttribute("connstring", connectionstring);

        return "rateview";
    }


}
