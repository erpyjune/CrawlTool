package com.erpy.crawltool;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by baeonejune on 15. 4. 29..
 */
@Controller
public class CrawlController {
    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView printWelcome(ModelAndView model) {
        model.addObject("message", "Hello world!");
        model.setViewName("hello");
        return model;
    }
}
