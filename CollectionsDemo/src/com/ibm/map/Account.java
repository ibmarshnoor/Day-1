package com.ibm.map;

public class Account {
       private String name;
       private float balance;
	public String getName() {
		return name;
	}
	public Account setName(String name) {
		this.name = name;
		return null;
	}
	public float getBalance() {
		return balance;
	}
	public Account setBalance(float balance) {
		this.balance = balance;
		return null;
	}
	
	public String toString() {
		return "name="+this.name+" balance="+this.balance;
	}
}
