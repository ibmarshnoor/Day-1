package com.ibm.map;

public class ArrayAssignment {
	public static void main(String[] args) {
		Account[] account=new Account[10];
		Account accountsName=new Account();
		Account accountsBal=new Account();
		for (int i = 0; i < account.length; i++) {
			account[i]=accountsName.setName("Ram");
			account[i]=accountsBal.setBalance(100.f+i);
		}
		
	}

}
