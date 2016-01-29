package com.java.lvxin;

import com.java.lvxin.javaapi.NewsPaperSubject;
import com.java.lvxin.javaapi.ReaderObserver;

/**
 * Created by lvxin on 1/29/16.
 */
public class ClientWithJavaModel {
    public static void main(String[] args) {

        // 创建一份报纸, 作为被观察者
        NewsPaperSubject subject = new NewsPaperSubject();

        // 创建阅读者, 即观察者
        ReaderObserver reader1 = new ReaderObserver();
        reader1.setName("Tony Allen");

        ReaderObserver reader2 = new ReaderObserver();
        reader2.setName("Tom Allen");

        // 注册阅读者
        subject.addObserver(reader1);
        subject.addObserver(reader2);

        subject.setContent("本期报纸内容===观察者模式===");
    }
}
