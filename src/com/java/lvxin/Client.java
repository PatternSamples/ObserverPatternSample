package com.java.lvxin;

import com.java.lvxin.demo.NewsPaper;
import com.java.lvxin.demo.Reader;

/**
 * Created by lvxin on 1/27/16.
 */
public class Client {
    public static void main(String[] args) {

        // 创建一份报纸, 作为被观察者
        NewsPaper subject = new NewsPaper();

        // 创建阅读者, 即观察者
        Reader reader1 = new Reader();
        reader1.setName("Tony Allen");

        Reader reader2 = new Reader();
        reader2.setName("Tom Allen");

        // 注册阅读者
        subject.attach(reader1);
        subject.attach(reader2);

        subject.setContent("本期报纸内容===观察者模式===");
    }
}
