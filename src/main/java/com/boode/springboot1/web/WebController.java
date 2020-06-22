package com.boode.springboot1.web;

import com.boode.springboot1.entity.MyProperties;
import com.boode.springboot1.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
//@RestController
public class WebController {


    private static  final Logger logger = LoggerFactory.getLogger(WebController.class);


    @Value("${boode.wx_appid}")
    private String wxAppId;

    @Autowired
    private MyProperties myProperties;

    @RequestMapping("/hello")
   // @ResponseBody
    public String sayHello(){

        return "hello world";
    }

    @RequestMapping("/")
    public String toIndex(){

        return "index";
    }
    @RequestMapping("toHello")
    public  String toHello(){

        return  "hello";
    }

    @RequestMapping("toIndex")
    public String toIndex2(Model model){


        model.addAttribute("username","tom");

        List<User> users = new ArrayList<>();
        User user = new User(1001,"tom");
        User user1 = new User(1002,"jacck");
        User user2 = new User(1003,"jerry");

        users.add(user);
        users.add(user1);
        users.add(user2);

        model.addAttribute("users",users);

        logger.info("运行WebController toIndex 传参...");
        return  "index";
    }

    @RequestMapping("/testProperties")
    @ResponseBody
    public String testProperties(){

    return wxAppId + "::::" + myProperties;
    }
}
