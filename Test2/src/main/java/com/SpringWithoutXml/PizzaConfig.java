package com.SpringWithoutXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PizzaConfig {
	
	public Pepsi getPepsi() {
		Pepsi c=new Pepsi();
		return c;
	}
	
	@Bean(name= {"a","b","c"})
	public Pizza getPizza()
	{
		Pizza p=new Pizza(null);
		return p;
		
	}

}
