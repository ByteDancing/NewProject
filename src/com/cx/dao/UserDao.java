package com.cx.dao;

import com.cx.model.Tb_emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * Created by Administrator on 2017/4/20 0020.
 */
public interface UserDao {
    @Insert("insert into tb_emp values(eid_seq.nextval,#{ename},#{dept_id},#{age},#{gender},#{wordDate})")
    void addEmploy(Tb_emp emp);

    @Delete("delete * from tb_emp where eid=#{eid}")
    void deleteEmploy(int eid);

    @Select("select * from tb_emp e,tb_dept d where e.dept_id=d.did order by e.eid desc")
    List<Tb_emp> queryEmp();

    @Update("update tb_emp set ename=#{ename},dept_id=#{dept_id},age=#{age},gender=#{gender},wordDate=#{wordDate} where eid=#{eid}")
    void updateEmploy(Tb_emp emp);

    @Select("select * from tb_emp where eid=#{eid}")
    Tb_emp queryEmpByEid(int eid);
}
