package com.javatech.vardhu.model;

import java.util.List;

public class RequestDto<T>{
    T data;
    List<T>listData;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<T> getListData() {
        return listData;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }
}