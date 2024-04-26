package com.example.serious.ControllerJSP;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/api/v1/measurement")
public class MeasurementPage {
    @GetMapping
    public ModelAndView page(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("measurement.jsp");
        return mv;

    }
}
