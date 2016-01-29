package com.java.lvxin.structure;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标对象, 知道所有的观察者,并提供注册和删除观察者接口
 *
 * Created by lvxin on 1/27/16.
 */
public class Subject {

    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observers = new ArrayList<Observer>();

    /**
     * 注册观察者对象
     *
     * @param observer 观察者对象
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除观察者对象
     *
     * @param observer
     */
    public void detach(Observer observer) {
        if (null == observer) return;
        observers.remove(observer);
    }

    /**
     * 通知所有注册的观察者对象
     */
    protected void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
