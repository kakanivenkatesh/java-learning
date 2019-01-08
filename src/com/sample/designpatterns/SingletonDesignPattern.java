package com.sample.designpatterns;

import java.util.HashSet;
import java.util.Set;

public class SingletonDesignPattern {
	
	public static final SingletonDesignPattern INSTANCE = new SingletonDesignPattern();
	//private static SingletonDesignPattern INSTANCE;
	private Set<String> availableSeats;
		
	/*public static SingletonDesignPattern getInstance(){
		if(INSTANCE == null){
			INSTANCE = new SingletonDesignPattern();
		}
		return INSTANCE;
	}*/
	
	public SingletonDesignPattern() {
		availableSeats = new HashSet<String>();
		availableSeats.add("A1");
		availableSeats.add("A2");
	}
	
	public boolean bookSeats(String seat){
		System.out.println(availableSeats);
		return availableSeats.remove(seat);
	
	}
	
	public static void ticketAgentBooks(String seat){
		SingletonDesignPattern pattern = new SingletonDesignPattern();  //with this every time it will create a new object
		//SingletonDesignPattern pattern = getInstance();
		System.out.println(pattern.bookSeats(seat));
		
	}
	public static void main(String[] args) {
		ticketAgentBooks("A1");
		ticketAgentBooks("A2");
		
	}

}
