package com.baizhi.cmfz.entity;

/**
 * @Author 韩雨
 * @Time in 20:38 2018/7/9
 * @Despriction
 */
public class AreaMain {
    private String name;
    private String value;

    public AreaMain(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "AreaMain{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public AreaMain() {
        super();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
