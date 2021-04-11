package com.visionit;


class abc
{
	int X;
	String S;
	public void printdetails()
	{
		System.out.println("Id of employee is : "+X);
	//	System.out.println("Name of employee is :" +S);

	}
}
public class CustomClass {
	public static void main(String[] args) {
		System.out.println("this is our custom class");
		abc a= new abc();
		a.X=12;
		a.S="saurabh";	
		a.printdetails();
	//	System.out.println(a.X);
	//	System.out.println(a.S);
	}
}
