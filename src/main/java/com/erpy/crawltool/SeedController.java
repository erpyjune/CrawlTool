package com.erpy.crawltool;

import com.seed.Seed;
import com.seed.SeedDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by baeonejune on 15. 4. 30..
 */
@Controller
public class SeedController {

    @Autowired
    private SeedDAOService seedDAOService;

    @RequestMapping(value = "/seed", method = RequestMethod.GET)
    public ModelAndView getSeedListAll(ModelAndView model) {
        List<Seed> seedList = seedDAOService.getAllSeedData();
        model.addObject("message", "Hello world!");
        model.addObject("seedList", seedList);
        model.setViewName("seed");
        return model;
    }
}
