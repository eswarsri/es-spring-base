package com.es.spring.controller;  

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@Controller
public class DefaultController {
    
   @RequestMapping(value = "/home", method = RequestMethod.GET)
   public String index(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       return "index";
   }
   @RequestMapping(value = "/", method = RequestMethod.GET)
   public ModelAndView landing(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       return new ModelAndView("forward:/index.html", map);
   }
   @RequestMapping(value = "/resources/index.html", method = RequestMethod.GET)
   public String secondLanding(ModelMap map) {
       map.put("msg", "Hello Spring 4 Web MVC!");
       return "landingPage2";
   }
    
}
