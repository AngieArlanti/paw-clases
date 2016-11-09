package ar.edu.itba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by angie on 05/11/16.
 */


@Controller
public class HelloWorldController{
    @RequestMapping("/")
    public ModelAndView	helloWorld(){

        final ModelAndView mav = new ModelAndView("index");

        mav.addObject("greeting","PAW");

        return	mav;
    }
}

