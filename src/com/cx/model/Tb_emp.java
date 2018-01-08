package com.cx.model;

/**
 * Created by Administrator on 2017/4/21 0021.
 */
public class Tb_emp {
private int eid;
    private String ename;
    private  int dept_id;
    private  int age;
    private String gender;
    private String wordDate;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWordDate() {
        return wordDate;
    }

    public void setWordDate(String wordDate) {
        this.wordDate = wordDate;
    }

    public Tb_emp() {
    }

    public Tb_emp(String ename, int dept_id, int age, String gender, String wordDate) {
        this.ename = ename;
        this.dept_id = dept_id;
        this.age = age;
        this.gender = gender;
        this.wordDate = wordDate;
    }

    @Override
    public String toString() {
        return "Tb_emp{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", dept_id=" + dept_id +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", wordDate='" + wordDate + '\'' +
                '}';
    }
}
