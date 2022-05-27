package com.gxc;


public class text4 {
    public static void main(String[] args) {
        bug bug = new bug(18,"tom");
        bug bug2 = new bug(18,"tm");
        System.out.println(bug);
        System.out.println(bug.hashCode());
        System.out.println(bug.equals(bug));

    }
}
class bug{
    private int i;
    private String name;

    public bug(int i, String name) {
        this.i = i;
        this.name = name;
        System.out.println(getI());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof bug){
            bug b =(bug)o ;
            return this.getName().equals(b.name)&&this.getI()== b.i;
        }
        return false;
    }

    @Override
    public String toString() {
        return "姓名："+getName()+"   年龄："+getI();
    }

    @Override
    public int hashCode() {
        return getName().charAt(0)+getI();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private class MyResult {
        public MyResult(Object p0, Object p1) {
            System.out.println(p0);
        }
    }
}
