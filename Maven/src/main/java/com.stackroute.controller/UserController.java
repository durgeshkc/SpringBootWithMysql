package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller
//@RequestMapping(value = "/register")
public class UserController {
    //private User user = new User();
//        @RequestMapping(value = "/", method = RequestMethod.GET)
//        public String viewRegistration(ModelMap model) {
////            model.addAttribute(commandName);
////            userForm = new User();
//            model.put("userForm", user);
//            System.out.println("username: " + user.getName());
//         //   System.out.println("password: " + user.getPassword());
//            return "index";
//        }
//
//        @RequestMapping(value = "/afterLogin", method = RequestMethod.POST)
//        public String processRegistration(@ModelAttribute("userForm") User user, ModelMap modelMap, String commandName){
//            modelMap.addAttribute("username", user.getName());
//            //User user = new User();
//            modelMap.addAttribute(commandName);
//            System.out.println("username: " + user.getName());
//            System.out.println("password: " + user.getPassword());
//
//            return "afterLogin";
//        }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showLoginPage()
    {
        return "index";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ModelAndView greeting1(@RequestParam("username")String userName, @RequestParam("password") String userPassword){
        User user = new User();
        ModelAndView mv= new ModelAndView();
        mv.setViewName("afterLogin");
        user.setName(userName);
        user.setPassword(userPassword);
        mv.addObject("username",user);
        return mv;
    }

}
