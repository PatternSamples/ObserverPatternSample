package com.java.lvxin.javaapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by lvxin on 1/29/16.
 */
public class ReaderObserver implements Observer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object obj) {
        //采用推的方式, 如下调用
        // 对于要获取推的数据, 在目标实现里面调用的时候必须用推的方式, 就是带参数哪个, 否则这里会是null
        System.out.println(name + "收到报纸了. 目标推过来的内容是==========" + obj);

        // 下面采用拉的方式:
        // 对于要用拉的方式获取数据, 在目标实现里面怎么调用都行, 有参无参都行, Java默认会传递目标的实现对象本身.
        System.out.println(name + "收到报纸了. 主动到目标对象去拉的内容是========" + ((NewsPaperSubject) o).getContent());
    }
}
