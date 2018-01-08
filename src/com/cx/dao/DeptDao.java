package com.cx.dao;

import com.cx.model.Tb_dept;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public interface DeptDao {
    @Select("select  * from tb_dept where did=#{did}")
    Tb_dept queryDept(int did);
}
