package com.jpmc.service;

import com.jpmc.entity.Order;

public interface ShoppingService {
	
	public void placeOrder(Order order);
	public void cancelOrder(Order order);
	public Order fetchOrder(int orderId);
	
	
	
	
}
