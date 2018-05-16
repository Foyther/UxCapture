package ru.kpfu.itis.uxcapture.controllers;

import ru.kpfu.itis.uxcapture.utils.Utils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by apple on 09.02.2018.
 */
@Controller
public class SecurityController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    @PreAuthorize("isAnonymous()")
    public String loginToSite(HttpServletRequest request, ModelMap modelMap) {

        modelMap.put("content", "login");

        if (Utils.isAjax(request)) {
            return "site/login";
        } else {
            return "site/index";
        }
    }

    @RequestMapping(value = "/admin/login", method = RequestMethod.GET)
    @PreAuthorize("isAnonymous()")
    public String loginToAdmin() {
        return "admin/login";
    }
}
