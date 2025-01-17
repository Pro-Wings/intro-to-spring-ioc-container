package com.prowings.core.circulardependency;

public class User {
	
	private Order order;

	public User() {
	}

	public User(Order order) {
		super();
		this.order = order;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "User [order=" + order + "]";
	}
}
