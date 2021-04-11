package com.visionit;
import java.util.*;


public class CWH_If_else_switchCase {

	public static void main(String[] args)
  {
/*	
  System.out.println("enter the number");	
  Scanner sc=new Scanner(System.in);
  int b=sc.nextInt();
 if (b>300)
  {
	  System.out.println("Number is greater then 300");
  }
  else if(b==300)
  {
	  System.out.println("Number is equal to 300");
  }
  else
  {
	  System.out.println("Number is less than 300");
  }
 
*/
// add tax on basic bill amount
		
 System.out.println("Please Enter Bill amount");
 Scanner sc2=new Scanner(System.in);
 int b1=sc2.nextInt();
 
 if(b1<=300)
 {
	 int tax=50;
     int totalbill=b1+tax;
     System.out.println("Total bill amount including tax is "+totalbill);
 }
 else if(b1<=500)
 {
	int tax=20;
    int total=b1+tax;
    System.out.println("Total bill including tax "+total);
 }
 else if(b1<=1000)
 {
	 int taxx=10;
	 int tot=b1+taxx;
	 System.out.println("Total bill including tax "+tot);
 }
 
 else
 {
	 int taxxx=0;
	 int total=b1+0;
	 System.out.println("Total bill amount includig tax is" +total);
 }
 

 
 	
		
//Write a program to check the day number in a week.
		// Ex. if number is 1 then output should be Monday, 5 then Friday.
//Switch case
/*		
System.out.println("Enter number");		
Scanner sc = new Scanner(System.in);
int a=sc.nextInt();
switch(a)
{
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesday");
	break;
case 4:
	System.out.println("Thusday");
	break;
case 5:
	System.out.println("Friday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
	System.out.println("njoy weekday");
break;
}
*/	
}
}

