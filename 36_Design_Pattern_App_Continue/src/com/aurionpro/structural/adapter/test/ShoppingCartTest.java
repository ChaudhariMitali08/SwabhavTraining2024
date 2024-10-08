package com.aurionpro.structural.adapter.test;

import java.util.Arrays;

import com.aurionpro.structural.adapter.model.Biscuit;
import com.aurionpro.structural.adapter.model.Hat;
import com.aurionpro.structural.adapter.model.HatAdapter;
import com.aurionpro.structural.adapter.model.IItems;
import com.aurionpro.structural.adapter.model.ShoppingCart;

public class ShoppingCartTest {
public static void main(String[] args) {
	IItems biscuit = new Biscuit("Parle G", 10);
	Hat hat = new Hat("Hat", "Jakes Hat", 200, 25);
	HatAdapter hatAdapter = new HatAdapter(hat);
	
	ShoppingCart cart = new ShoppingCart(Arrays.asList(biscuit,hatAdapter));
	
	System.out.println(cart.getCartPrice());
}
}
