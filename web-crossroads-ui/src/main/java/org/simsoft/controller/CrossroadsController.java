package org.simsoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CrossroadsController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCrossroads(Model model) {
        return "index";
    }

}