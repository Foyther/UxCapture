package ru.kpfu.itis.uxcapture.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.kpfu.itis.uxcapture.forms.ReviewForm;
import ru.kpfu.itis.uxcapture.models.User;
import ru.kpfu.itis.uxcapture.services.api.response.ApiResult;

import java.util.Set;

/**
 * Created by apple on 13.02.2018.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @RequestMapping(value = "", method = RequestMethod.POST)
    public ApiResult subscribe(@PathVariable("id") long id,
                               ReviewForm form) {
        ApiResult result = new ApiResult(0);
        return result;
    }

}
