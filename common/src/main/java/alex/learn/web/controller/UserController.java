package alex.learn.web.controller;

import alex.learn.web.service.interfaces.UserService;
import alex.learn.web.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.core.io.Resource;


/**
 * author  : zhiguang
 * date    : 2018/7/9
 * 一套rest controller
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    Resource resource;

    //获取全部
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String getAll() {
        return  userService.getAll_();
    }

    //单个新增
    @RequestMapping(value = "/user", method = RequestMethod.POST)
    @ResponseBody
    public String add(@RequestBody User u) {
        System.out.println(u);
        User su = userService.saveuser(u);
        return su.toString();
    }

    //多个新增
    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @ResponseBody
    public String addall(@RequestBody User[] users) {
        userService.saveuser(users);
        return "success";
    }

    //单个删除
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable  int id) {
        userService.deleteuser(id);
        return "success";
    }

    //多个删除
    @RequestMapping(value = "/ids", method = RequestMethod.DELETE)
    @ResponseBody
    public String deletetest1(@RequestBody int[] ids) {
        userService.deleteuser(ids);
        return "success";
    }

    //单个修改
    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody  User u) {
        System.out.println(u);
        User su = userService.updateuser(u);
        return su.toString();
    }
}
