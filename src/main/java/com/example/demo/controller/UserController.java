package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.service.UserService;
import org.apache.tomcat.util.net.AprEndpoint;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@RestController
@Controller
public class UserController {

    @Resource
    UserService userService;

    /**
     * 查询所有用户
     * @return
     */
    @RequestMapping("/user")
    @ResponseBody
    public List<User> getAllUser(){
        List<User> users = userService.getAllUser();
        return userService.getAllUser();
    }

    /**
     *查询用户名和密码
     * @param username
     * @param password
     * @return
     */
    @PostMapping("/getpassword")
//    @ResponseBody
    public String getPByU(@RequestParam(value = "username" ,required = false ,defaultValue = "null") String username,@RequestParam(value = "password",required = false,defaultValue = "null") String password){
        String upassword = userService.getPByU(username, password);
        if (upassword != null && upassword.equals(password)){
            return "redirect:home/index.html";
        }else{
            return "redirect:login/login.html";
        }
    }

    /**
     * 添加用户
     * @param username
     * @param password
     * @param name
     * @param response
     * @throws IOException
     */
    @PostMapping("/signUp")
    public void addUser(@RequestParam(value = "username",required = false,defaultValue = "null") String username,
                        @RequestParam(value = "password",required = false,defaultValue = "null") String password,
                        @RequestParam(value = "name",required = false,defaultValue = "null") String name,
                        HttpServletResponse response, HttpServletRequest request) throws IOException, ServletException {
        if (userService.reUser(username) == null){
            userService.addUser(username,password,name);
            response.sendRedirect("login/login.html");
        }else {
            response.sendRedirect("login/signUp.html");
        }
    }

    @GetMapping("/reuser")
    @ResponseBody
    public String reUser(@RequestParam(value = "username",required = false,defaultValue = "null") String username){
        if (userService.reUser(username) == null){
            return "redirect:login/signUp.html";
        }else {
            return "redirect:login/Angelong.html";
        }
    }

    @RequestMapping("/th")
    public String th(Model model){
       String name = "Angelong";
       model.addAttribute("name",name);
       return "/static/english/th.html";
    }
}
