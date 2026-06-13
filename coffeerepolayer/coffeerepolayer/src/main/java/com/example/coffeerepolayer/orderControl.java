package com.example.coffeerepolayer;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coffee")
public class orderControl {
private final orderRepository or=new orderRepository();
@GetMapping
    public List<orderModel> getOrder()
{
    return or.getOrder();
}
@PostMapping
    public orderModel placeOrder(@RequestBody orderModel ord)
{
    or.placeOrder(ord);
    return ord;
}
}
