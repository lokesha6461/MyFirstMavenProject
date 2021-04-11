package com.visionit;

public class CWH_Recursion {

/*	static int sum(int x, int ...arg) 
	{
 		int result=x;
 		for (int a:arg)
 		{
 		result+=a;
 		}
 		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Sum of given number is: " +sum(3));
		
	}
*/
// using main method	
/*	
	public static void main(String[] args)
	{
		 int a=0;
		 int b=1;
		 
		 System.out.print(a +" "+b);		
		for(int i=2; i<=10; i++)
		{
			int c=0;
			c= a + b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
*/

	//Using Methods
	/*
	static int a=0;
	static int b=1;
	static void f(int n)
	{
	
	if(n>0)
	{
	 int c=0;
	 c= a + b;
	 a = b;
	 b = c;	
	 System.out.print (" " +c);
	 f(n-1);
	 }
	//f(n-2);
	}
	
	public static void main(String [] args)
	{
		int n=20;
		System.out.print(a+ " " +b);
		f(n-2);
	}
	*/
  static int fact(int n)
  {
	  if (n==0 || n==1)
	  {
		  return 1;
	  }
	  else
	  {
		 return n * fact(n-1);
	  }
	  
  }

public static void main(String[] args)
  {
	  int x=5;
	  System.out.println("factorial of " + x + " is " +fact(x));
  }

}

	
