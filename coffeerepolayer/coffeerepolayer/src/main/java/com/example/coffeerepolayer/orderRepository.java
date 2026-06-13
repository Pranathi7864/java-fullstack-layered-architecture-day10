package com.example.coffeerepolayer;


import java.util.*;

public class orderRepository {
    private List<orderModel> list=new ArrayList<>();
    public List<orderModel> getOrder()
    {
        return list;
    }
    public void placeOrder(orderModel ordermodel)
    {
        list.add(ordermodel);

    }
}
