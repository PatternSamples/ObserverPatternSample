package com.java.lvxin.structure;

/**
 * Created by lvxin on 1/27/16.
 */
public class ConcreteObserver implements Observer {

    /**
     * 观察者状态
     */
    private String observerState;

    @Override
    public void update(Subject subject) {

        //具体的更新实现
        //这里可能需要更新观察者的状态, 使其与目标的状态保持一致
        observerState = ((ConcreteSubject) subject).getSubjectState();
    }
}
