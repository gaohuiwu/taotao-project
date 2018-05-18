package com.taotao.common.pojo;

/**
 * FileName:EasyUITreeNode
 * Author:  ghw06
 * Date:    2018/5/18 17:07
 * Description: 添加商品类目查询的异步tree
 */
public class EasyUITreeNode {

    private long id;
    private String text;
    private String state;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

}
