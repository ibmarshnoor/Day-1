package com.ibm;

import com.A;

public class Application {
  public static void main(String[] args)
  {
	  A b=new B();
	  ((B)b).m2();
	  System.out.println(b.age);
	  b.m1();
  }
}
