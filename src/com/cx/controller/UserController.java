package com.cx.controller;

import com.cx.model.Tb_emp;
import com.cx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
//查询
    @RequestMapping(value = "/queryEmploy",method = RequestMethod.GET)
    public String queryEmploy(HttpSession session){
        List<Tb_emp> empList =userService.queryEmp();
        session.setAttribute("empList",empList);
        return "index";
    }
    //新增员工信息
    @RequestMapping(value = "/addEmploy",method = RequestMethod.POST)
    public String addEmploy(Tb_emp emp,HttpSession session){
        userService.addEmploy(emp);
        List<Tb_emp> empList =userService.queryEmp();
        session.setAttribute("empList",empList);
        return "index";
    }
    //删除员工信息
    @RequestMapping(value = "/deleteEmploy",method = RequestMethod.GET)
    public String deleteEmploy(int eid,HttpSession session){
        userService.deleteEmploy(eid);
        List<Tb_emp> empList =userService.queryEmp();
        session.setAttribute("empList",empList);
        return "index";
    }
}
