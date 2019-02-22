package com.example.web_model.controller;





import com.example.web_model.pojo.UserPojo;
import com.example.web_model.resource.Resource;
import com.example.web_model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class CommonController {

    @Autowired
    private UserService userService;
    @Autowired
    private Resource resource;
    @RequestMapping("/index")
    @ResponseBody
    public String getIndex(){
        return "hello world!";
    }

    @RequestMapping("/index2")
    public String getIndex2(ModelMap map){
        System.out.println("aaaaaaaa");
        resource.setBirthday(new Date());
        resource.setPassword("<font color='red'>hello world</font>");
        ArrayList<Resource> list=new ArrayList<>();
        list.add(resource);
        list.add(resource);
        list.add(resource);
        list.add(resource);
        map.put("resource",resource);
        map.put("resources",list);

        return "thymeleaf/index";
    }

    @PostMapping("/addusert")
    public String addusert(Resource resource){
        System.out.println(resource.getName());
        return "redirect:/index2";
    }

    @RequestMapping("/geterror")
    public String geterror(){
        int a=1/0;
        return "/error";
    }

    @RequestMapping("/adduser")
    @ResponseBody
    public String adduser(){
        UserPojo userModel=new UserPojo();
        userModel.setUser_loginid("ddddddddd");
        userModel.setUser_id(7);
        userModel.setUser_name("你好");
        userService.addUser(userModel);
       return "seccess";
    }


    @RequestMapping("/getusers")
    @ResponseBody
    public String getusers(){
        UserPojo userModel=new UserPojo();
        userModel.setUser_loginid("dd");
        userModel.setUser_id(4);
        userModel.setUser_name("你好");
        List<UserPojo> userPojoList=userService.getUsers(userModel,1,3);
        for(UserPojo userPojo:userPojoList){
            System.out.println(userPojo.getUser_loginid());
        }
        return userPojoList.toString();
    }

    @RequestMapping("/gettrans")
    @ResponseBody
    public String transantronalTest(){
        UserPojo userModel=new UserPojo();
        userModel.setUser_loginid("dd");
        userModel.setUser_id(9);
        userModel.setUser_name("你好");
        userService.getTrans(userModel);
        return "success";
    }


}
