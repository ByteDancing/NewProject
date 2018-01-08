package com.cx.service;

import com.cx.model.Tb_dept;
import com.cx.model.Tb_emp;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public interface UserService {

    void addEmploy(Tb_emp emp);

    void deleteEmploy(int eid);

    List<Tb_emp> queryEmp();

    void updateEmploy(Tb_emp emp);

    Tb_emp queryEmpByEid(int eid);

    Tb_dept queryDeptBydid(int did);
}
