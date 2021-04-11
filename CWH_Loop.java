package com.visionit;

public class CWH_Loop {

	public static void main(String[] args) {
  
// Print odd number in reverse order.		
/* int n=15;
  int a;
  int sum=0;
  for(int i=n; i>0; i--)
  {
	  a=(2*i-1);
	  System.out.print(a);
	  System.out.print(" ");
  }
 */
		
 // sum of 1st 15th even number
/*		
   int n=15;
   int sum=0;
   int sum1=0;
   for(int i=0; i<=n; i++)
   {
    sum = sum +(2*i);
    sum1= sum1+(2*i+1);
   }
   System.out.println("sum of 1st 15 even number are " +sum);
   System.out.println("sum of 1st 15 odd number are " +sum1);
   
   */
  //Count odd no within 0 to 20;
   int odd=0;
   int even=0;
   
   for (int i=0; i<=25; i++)
   {
	   if (i==0)
	   {
		   System.out.println("0 is not an even number nor odd number");
		   even=0;
		   odd=0;
		   
	   }
	   else if (i%2==0)
	   {
	       even = even+1;
	   }
	   else
	   {
		  odd=odd+1;
	   }
	  
   }
   System.out.println("count of Odd is " +odd+ " and Count of Even is "+even);
   }   
	  
}
