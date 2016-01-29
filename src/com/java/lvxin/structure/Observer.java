package com.java.lvxin.structure;

/**
 * 观察者接口, 定义一个更新的接口, 当目标状态发生变化时被通知的对象
 * <p>
 * Created by lvxin on 1/27/16.
 */
public interface Observer {
    /**
     * 更新接口
     *
     * @param subject 传入目标对象, 方便获取相应的目标对象的状态
     */
    void update(Subject subject);
}
