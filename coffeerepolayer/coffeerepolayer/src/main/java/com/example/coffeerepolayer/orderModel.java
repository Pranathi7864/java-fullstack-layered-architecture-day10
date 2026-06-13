package com.example.coffeerepolayer;

public class orderModel {
    private String id;
    private String order;
    public orderModel(String id,String order)
    {
        this.id=id;
        this.order=order;
    }
    public String getId()
    {
        return id;
    }
    public String setOrder()
    {
        return order;

    }
}
