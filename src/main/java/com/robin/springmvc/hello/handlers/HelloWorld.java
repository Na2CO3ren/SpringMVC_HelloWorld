package com.robin.springmvc.hello.handlers;

import com.robin.springmvc.hello.entities.User;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/robin")
@SessionAttributes("robin")
public class HelloWorld {

    public static final String SUCCESS = "success";
    @RequestMapping("/helloWorld")

    public String hello() {
        System.out.println("hello Robin");
        return SUCCESS;
    }

    @RequestMapping(value = "/testMethod",method = RequestMethod.POST)
    public String testMappingPost() {

        return SUCCESS;
    }

    @RequestMapping("/testPathVariable/{id}")
    public String testVariable(@PathVariable("id") Integer id) {
        System.out.println("variable is " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testREST", method = RequestMethod.POST)
    public String testREST() {
        System.out.println("testREST POST");
        return SUCCESS;
    }

    @RequestMapping(value = "/testREST/{id}", method = RequestMethod.GET)
    public String testREST(@PathVariable Integer id) {
        System.out.println("testREST GET " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testREST/{id}", method = RequestMethod.DELETE)
    public String testRESTDelete(@PathVariable Integer id) {
        System.out.println("testREST DELETE " + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testREST/{id}", method = RequestMethod.PUT)
    public String testRESTPut(@PathVariable Integer id) {
        System.out.println("testREST PUT " + id);
        return SUCCESS;
    }

    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(value = "user")String user,
                                   @RequestParam(value = "age",required = false,defaultValue = "0") Integer age) {
        System.out.println("testRequestParam  user: " + user + "  age: " + age);
        return SUCCESS;
    }

    @RequestMapping("/testPOJO")
    public String testPOJO(User user) {
        System.out.println(user);
        return SUCCESS;
    }

    @RequestMapping("/testMap")
    public String testMap(Map<String,Object> dataMap) {
        dataMap.put("robin", "robin_jinglan");
        return SUCCESS;
    }

    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView() {
        ModelAndView modelAndView = new ModelAndView(SUCCESS);
        modelAndView.addObject("time",new Date());
        return modelAndView;
    }

    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Map<String, Object> map) {

        map.put("robin","jinglan");
        return SUCCESS;
    }

    @ModelAttribute
    public void changeUser(@RequestParam(name = "id",required = false) Integer id, Map<String, Object> map) {
//        if (id != null) {
//            User user = new User("robin","1234",15,1);
//            System.out.println("从数据库中获取数据: " + user.toString());
//            map.put("user",user);
//        }

        User user = new User("robin","1234",15,1);
        System.out.println("从数据库中获取数据: " + user.toString());
        map.put("user",user);
    }

    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("jinglan") User user) {
        System.out.println("修改后： " + user.toString());
        return SUCCESS;
    }

    @RequestMapping("/testView")
    public String testView() {
        System.out.println("test View");
        return SUCCESS;
    }

    @RequestMapping("/testMyView")
    public String testMyView() {
        System.out.println("myView");
        return "myView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect() {
        System.out.println("testRedirect");
        return "redirect:/index.jsp";
    }
}
