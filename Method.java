package com.visionit;

public class Method {
	/*
   static int logic(int x, int y)
	{   
		int z;
		
		if(x>y)
		  {
		    z=x+y;
		  }
		  else
		  {
		    z=(x+y)*5;
		  }
       return z;
	}
	public static void main(String[] args) 
	{
	  int a=5;
	  int b=7;
	  int c;
	  c=logic(a, b);
	  //Method m=new Method();
	  //c= m.logic(a, b);
	  
	  System.out.println(c);
	 
	  System.out.println("-----------------------------");
	 
	  int a1=6;
	  int b1=55;
	  int c1;
	  c1=logic(a1,b1);
	  //c1=m.logic(a1, b1);
	  
	  System.out.println(c1);
	*/
	
	static int mult(int x)
	{
		int A=1;
		for(int i=1; i<=10; i++)
		{
			A = x * i;
			System.out.println(A);
			
			//i++;
		}
	
		return A;
    }
	public static void main(String[] args)
	{
		int n=7;
		mult(n);
		
		
	}
}