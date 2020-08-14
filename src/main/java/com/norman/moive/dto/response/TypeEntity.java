package com.norman.moive.dto.response;

import java.util.List;

public class TypeEntity {
    /**
     * title : 自定义
     * content : ["热播榜","新上线","好评榜"]
     */

    private String title;
    private int index;
    private List<String> content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
