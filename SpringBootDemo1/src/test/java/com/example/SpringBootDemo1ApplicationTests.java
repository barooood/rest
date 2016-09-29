package com.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpmc.entity.LineItem;
import com.jpmc.entity.Order;
import com.jpmc.entity.Payment;
import com.jpmc.service.ShoppingService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo1ApplicationTests {
	
	@Autowired
	private ShoppingService shoppingService;
	@Test
	public void contextLoads() {
		Order order=new Order();
		order.setId(123);
		order.setAmount(12334);
		
		LineItem lineItem1=new LineItem();
		lineItem1.setId(1);
		lineItem1.setQuantity(5);
		
		LineItem lineItem2=new LineItem();
		lineItem2.setId(2);
		lineItem2.setQuantity(10);
		
		List<LineItem> lineItem=new ArrayList();
		lineItem.add(lineItem1);
		lineItem.add(lineItem2);
		order.setItems(lineItem);
		
		Payment payment=new Payment();
		payment.setId(111);
		payment.setMode("Credit");
		payment.setAmount(order.getAmount());
		order.setPayment(payment);
		
		shoppingService.placeOrder(order);
	}

}
