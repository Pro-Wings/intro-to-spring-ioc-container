package com.prowings.core.circulardependency;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Order  implements ApplicationContextAware, InitializingBean{
	
	private User user;
    private ApplicationContext context;

	public Order() {
	}

	public Order(User user) {
		super();
		this.user = user;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Order [user=" + user + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		user = context.getBean(User.class);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		context = applicationContext;
	}
}
