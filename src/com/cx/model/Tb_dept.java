package com.cx.model;

/**
 * Created by Administrator on 2017/4/21 0021.
 *部门分类表
 */
public class Tb_dept {
    private int did;
    private String dname;

    public Tb_dept() {
    }

    public Tb_dept(String dname) {
        this.dname = dname;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Tb_dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                '}';
    }
}
