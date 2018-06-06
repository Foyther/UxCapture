package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.models.Application;
import ru.kpfu.itis.uxcapture.models.Criterion;
import ru.kpfu.itis.uxcapture.models.TimeUse;
import ru.kpfu.itis.uxcapture.repositories.ApplicationRepository;
import ru.kpfu.itis.uxcapture.repositories.CriterionRepository;
import ru.kpfu.itis.uxcapture.repositories.TimeUseRepository;
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

    @Autowired
    private CriterionRepository criterionRepository;

    @Autowired
    private TimeUseRepository timeUseRepository;

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

    @RequestMapping(value = "/boards/criterions", method = RequestMethod.GET)
    public String showCriterions(HttpServletRequest request, ModelMap modelMap) {

        if(Utils.isAjax(request)) {

            List<Criterion> criterions = criterionRepository.findAll();
            modelMap.put("criterions", criterions);

            return "admin/boards/criterions/index";
        } else {
            return "admin/index";
        }
    }

    @RequestMapping(value = "/boards/criterions/add", method = RequestMethod.GET)
    public String showAddCriterion(HttpServletRequest request, ModelMap modelMap) {

        if(Utils.isAjax(request)) {

            List<Application> apps = applicationRepository.findAll();
            modelMap.put("apps", apps);

            return "admin/boards/criterions/add";
        } else {
            return "admin/index";
        }
    }

    @RequestMapping(value = "/boards/results", method = RequestMethod.GET)
    public String showResults() {
        return "admin/index";
    }

    @RequestMapping(value = "/boards/results/timeuses", method = RequestMethod.GET)
    public String showTimeUses(HttpServletRequest request, ModelMap modelMap) {

        if(Utils.isAjax(request)) {

            List<TimeUse> timeUses = timeUseRepository.findAll();
            modelMap.put("timeUses", timeUses);

            return "admin/boards/results/timeuses/index";
        } else {
            return "admin/index";
        }
    }
}
