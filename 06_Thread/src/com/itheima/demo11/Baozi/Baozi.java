package com.itheima.demo11.Baozi;

public class Baozi {
    private String pi;
    private String xian;
    private boolean flag = false;

    public Baozi() {
    }

    public Baozi(String pi, String xian, boolean state) {
        this.pi = pi;
        this.xian = xian;
        this.flag = state;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getXian() {
        return xian;
    }

    public void setXian(String xian) {
        this.xian = xian;
    }

    public boolean isState() {
        return flag;
    }

    public void setState(boolean state) {
        this.flag = state;
    }
}
