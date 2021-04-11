package com.visionit;
import java.util.*;

public class Assignment2_Method_Constructor
{
/*
   static String Rev(String [] s)
  {
	 String ans = "";
	 for (int i = s.length - 1; i >= 0; i--) 
     {
         ans += s[i] + " ";
     }
     System.out.println("Reversed String:");
     System.out.println(ans.substring(0,ans.length() - 1));
     return ans;
 }
	public static void main(String[] args)
    {
        String a[] = "We are on the same boat of life".split(" ");
        Rev(a);
   }


//Question no 2:
	   public static void area(double a)
	   {
		
	    double area = Math.PI * (a * a);
	    System.out.println("The area of circle is: " + area);
				     
	    double circumference= Math.PI * 2*a;
	    System.out.println( "The circumference of the circle is:"+circumference) ;
		 
	   }
   
	   public static void main(String[] args) 
	   {
		  Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the radius: ");
	      double r = sc.nextDouble();
	      area(r);
	   }
	*/
	
//Question no-3   Calculate eligibility of he/her for voting
/*	
   public static void eligible(String a, int b)
   {
       if( b<=0)
       {
          System.out.println(" Wrong Input  ");
       }
       
	   else if (b==1 && b>=18)
	   {
		   System.out.println(a+" is eligible for voating  ");
	   }
	   else
	   {
		   System.out.println(a+" is not eligible for voting ");
	   }  
   }
	
	public static void main(String[] args)
	{
		System.out.print("Name of voter: ");
		Scanner sc=new Scanner(System.in);
        String b1=sc.next();
		
		System.out.print("age: ");
		Scanner sc1=new Scanner(System.in);
	    int b=sc1.nextInt();
	    eligible(b1, b);
	}
	
	*/	
	
	public static void marks(String b, int a)
	{
	 if(a<=40)
	 {
		 System.out.println("Grade given to " + b + " :-  Fail");
	 }
	 else if(a<=50)
	 {
		 System.out.print("Grade given to " + b + " :- DD");
	 }
	 else if(a<=60)
	 {
		 System.out.print("Grade given to " + b + " :- CD");
	 }
	 else if(a<=70)
	 {
		 System.out.print("Grade given to " + b + " :- BC");
	 }
	 else if(a<=80)
	 {
		 System.out.print("Grade given to " + b + " :- BB");
	 }
	 else if (a<=90)
	 {
		 System.out.println(" Congratulations Dear !!!!");
		 System.out.print(" Grade given to " + b + " :- AB");
	 }
	 else
	 {  
		 System.out.println(" Congratulations Dear !!!!");
		 System.out.print("Grade given to " + b + " :- AA");
	 }
	 }
	public static void main(String[] args)
	{
		System.out.print("Name of student:- ");
		Scanner sc=new Scanner(System.in);
		String b1=sc.next();
		
		System.out.print("Obtain Marks in exam (out of 100) :- ");
		Scanner sc1=new Scanner(System.in);
		int b=sc.nextInt();
        marks(b1, b);		
 }
}




