package com.cx.service;

import com.cx.dao.DeptDao;
import com.cx.dao.UserDao;
import com.cx.model.Tb_dept;
import com.cx.model.Tb_emp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public class UserServiceImp implements UserService {
    @Autowired
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    private DeptDao deptDao;

    public void setDeptDao(DeptDao deptDao) {
        this.deptDao = deptDao;
    }

    @Override
    public void addEmploy(Tb_emp emp) {
        userDao.addEmploy(emp);
    }

    @Override
    public void deleteEmploy(int eid) {
userDao.deleteEmploy(eid);
    }

    @Override
    public List<Tb_emp> queryEmp() {
        return userDao.queryEmp();
    }

    @Override
    public void updateEmploy(Tb_emp emp) {
        userDao.updateEmploy(emp);
    }

    @Override
    public Tb_emp queryEmpByEid(int eid) {
        return userDao.queryEmpByEid(eid);
    }

    @Override
    public Tb_dept queryDeptBydid(int did) {
        return deptDao.queryDept(did);
    }
}
