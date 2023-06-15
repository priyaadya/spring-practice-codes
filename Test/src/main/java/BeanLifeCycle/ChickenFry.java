package BeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ChickenFry {
	private double cost;

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
		System.out.println("setting the Cost for fried chicken");
	}

	public ChickenFry() {
		
	}

	@Override
	public String toString() {
		return "ChickenFry [cost=" + cost + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("started preparing");
	}
	@PreDestroy
	public void stop() {
		System.out.println("ended");
	}

	

}
