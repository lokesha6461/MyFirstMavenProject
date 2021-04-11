package com.visionit;

public class CWH_MethodOverloading {
	static void ax(int d, int u)
	{
		int c=d+u;
		System.out.println("after calculation " +c);
	
	}
	static void ax(int x)
	{
		int b= x*5;
		System.out.println("after calculation " +b);
	}
	
	public static void main(String[] args) 
	{
		ax(10,20);
		ax(10);
		
		
	}

}
