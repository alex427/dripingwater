package alex.learn.webtrial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhiguang on 2018/6/18.
 */
@Controller
@RequestMapping("/home")
public class WebController {

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String getHome(){
        System.out.println("face  used .. ");

        return "user";
    }


}
