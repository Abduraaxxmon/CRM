package com.example.serious.ControllerJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("v1/category")
public class CategoryPage {
    @GetMapping
    public ModelAndView  getAll(){

        ModelAndView mv=new ModelAndView();
        mv.setViewName("category");

        return mv;
    }
}
