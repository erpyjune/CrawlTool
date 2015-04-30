package com.erpy.crawltool;

import com.search.SearchData;
import com.search.SearchDataDAOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by baeonejune on 15. 4. 29..
 */
@Controller
public class CrawlController {

    @Autowired
    private SearchDataDAOService searchDataDAOService;

    @RequestMapping(value = "/main", method = RequestMethod.GET)
    public ModelAndView getSearchListAll(ModelAndView model) {
        List<SearchData> searchDataList = searchDataDAOService.getAllSearchData();
        model.addObject("message", "Hello world!");
        model.addObject("searchList", searchDataList);
        model.setViewName("main");
        return model;
    }
}
