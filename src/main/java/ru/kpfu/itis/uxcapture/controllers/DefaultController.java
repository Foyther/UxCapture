package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.utils.Utils;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 08.02.2018.
 */

@Controller
public class DefaultController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(HttpServletRequest request, ModelMap modelMap) {

        modelMap.put("content", "main");

        if(Utils.isAjax(request)) {
            return "site/main";
        } else {
            return "site/index";
        }
    }

    @RequestMapping(value = "/contacts", method = RequestMethod.GET)
    public String contacts(HttpServletRequest request, ModelMap modelMap) {

        modelMap.put("content", "contacts");

        if(Utils.isAjax(request)) {
            return "site/contacts";
        } else {
            return "site/index";
        }
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profile(HttpServletRequest request, ModelMap modelMap) {

        modelMap.put("content", "profile");

        if(Utils.isAjax(request)) {
            return "site/profile";
        } else {
            return "site/index";
        }
    }

}
