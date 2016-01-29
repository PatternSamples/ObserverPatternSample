package com.java.lvxin.javaapi;

import java.util.Observable;

/**
 * 使用Java中的观察者模式
 * <p>
 * Created by lvxin on 1/29/16.
 */
public class NewsPaperSubject extends Observable {

    private String content;

    public String getContent() {
        return content;
    }

    /**
     * @param content 报纸的具体内容
     */
    public void setContent(String content) {
        this.content = content;
        // 内容有了, 说明又出新报纸了, 那就通知所有的读者
        // 注意用java中的Observer模式的时候, 必须调用setChanged()方法
        this.setChanged();
        // 然后主动通知, 这里用的是推的方式
        this.notifyObservers(this.content);

        //如果用拉的方式, 如下调用
//        this.notifyObservers();
    }
}
