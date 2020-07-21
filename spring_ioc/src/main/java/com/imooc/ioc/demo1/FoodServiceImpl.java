package com.imooc.ioc.demo1;

public class FoodServiceImpl implements FoodService{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    private String taste;

    private String kind;

    @Override
    public void eat() {
        System.out.println(this.toString());
    }

    @Override
    public String toString(){
        return name+"属于"+kind+",口味"+taste;
    }
}
