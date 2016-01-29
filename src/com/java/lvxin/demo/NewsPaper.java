package com.java.lvxin.demo;

import com.java.lvxin.structure.Subject;

/**
 * 报纸对象, 具体的目标实现
 * <p>
 * Created by lvxin on 1/27/16.
 */
public class NewsPaper extends Subject {

    /**
     * 获取报纸的具体内容
     *
     * @return 报纸的具体内容
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //内容有了,说明又出报纸了, 可以通知所有的读者
        notifyObservers();
    }

    /**
     * 报纸的具体内容
     */
    private String content;
}
