package com.sample.basics;

import java.util.Objects;

/*
 * we are using employee details
 */
public class EqualsAndHashCode {

	public String name;
	public int id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof EqualsAndHashCode)){
			return false;
		}
		EqualsAndHashCode info =(EqualsAndHashCode)obj;
		
		return Objects.equals(name,info.name) && Objects.equals(id, info.id);
		
	}
	
	@Override
	public int hashCode() {
	
		return this.id;
	}
	
	
	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		
		EqualsAndHashCode equalshash = new EqualsAndHashCode();
		equalshash.setName("Venki");
		equalshash.setId(12268);
		
		EqualsAndHashCode equalshash_impl = new EqualsAndHashCode();
		equalshash_impl.setName("Venki");
		equalshash_impl.setId(122689);
		
		if (equalshash.hashCode() == equalshash_impl.hashCode()) {
			
			if (equalshash.equals(equalshash_impl)) {
				System.out.println("Both objects are equal");
				
			}
			else System.out.println("Both Objects are not equal.");
			
		}
		else
			System.out.println("Both Objects are not equal. ");
		
	}
}
