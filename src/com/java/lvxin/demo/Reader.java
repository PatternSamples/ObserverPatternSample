package com.java.lvxin.demo;

import com.java.lvxin.structure.Observer;
import com.java.lvxin.structure.Subject;

/**
 * 真正的读者, 可以描述读者的信息, 比如姓名
 * <p>
 * Created by lvxin on 1/27/16.
 */
public class Reader implements Observer {

    /**
     * 读者姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + " 收到报纸了. 报纸内容是:" + ((NewsPaper) subject).getContent());
    }
}
