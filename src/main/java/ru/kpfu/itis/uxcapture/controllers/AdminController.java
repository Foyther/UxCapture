package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.repositories.ApplicationRepository;
import ru.kpfu.itis.uxcapture.utils.Utils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by apple on 13.02.2018.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private ApplicationRepository applicationRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String index() {
        return "admin/index";
    }

    @RequestMapping(value = "/boards/apps", method = RequestMethod.GET)
    public String showApplications(HttpServletRequest request, ModelMap modelMap) {

        if(Utils.isAjax(request)) {

            List<Application> apps = applicationRepository.findAll();
            modelMap.put("apps", apps);

            return "admin/boards/apps/index";
        } else {
            return "admin/index";
        }
    }

    @RequestMapping(value = "/boards/apps/add", method = RequestMethod.GET)
    public String showAddApplication(HttpServletRequest request) {

        if(Utils.isAjax(request)) {
            return "admin/boards/apps/add";
        } else {
            return "admin/index";
        }
    }
}
