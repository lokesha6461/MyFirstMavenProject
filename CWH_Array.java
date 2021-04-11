package com.visionit;
import java.util.*;

public class CWH_Array {

	public static void main(String[] args) 
	{
		// problem no-1 -sum of given array
		
		//  float [] marks= {10.7f, 22.5f};
		 // float sum=0;// 10.7+22.5+12.5
		  //for(float element:marks)
		 // {
			//  sum=sum+element;
		 // }
		  //System.out.println("sum of array is "+sum);
			
		//Problem no-2 find number in array;
			
			int [] num= {10, 23, 25, 66, 433, 245, 456};
			 System.out.println("Enter number for search");
			Scanner sc =new Scanner(System.in);
	         int a= sc.nextInt();
			
		    // int a=4544;
	         boolean isInArray = false;      
	         for(int element:num)
	         {
	        	  if(a==element)
	        	  {
	        	    isInArray = true;
	        	     break;
	               }
	          }
	        	if(isInArray)
	        	{
	        		System.out.println("The value is present in array");
	        	}
	        	else
	        	{
	        		System.out.println("The value is not present in array");
	        	}       
	         
	   
	       
			//Problem no-3 Calculate average marks from array
		/*	
			float [] mar= {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
			float sum=0;
			for(float element:mar)
			{
				sum = sum + element;
			}
			System.out.println("Average of given marks is " + sum/mar.length );	
			
				
	// Reverse order array
			
	        int [] array= {11, 22, 23, 44, 5};
	        int l=array.length;
	        int n=Math.floorDiv(l, 2);
	        int temp;
	        
	        for(int i=0; i<n; i++)
	        {
	          temp=array[i];
	          array[i]=array[l-i-1];
	          array[l-i-1]=temp;
	        }          	
	        System.out.print("Array in reverse order is");
	        for(int elementss : array)
	         {
	             System.out.print(" " +elementss);
	         }
	 */
		
	//Count Prime number in array
  /*   int []arrays= {2,5,6,8,11,23,17,2,29};
     int count =0;
      for(int element:arrays)
      {
    	  if(element%2!=0)
    	  {
    		 count = count+1; 
    	  }
    	  else
    	  {
    		  if(element==2)
    		  count = count+1;    		 
    	  }
      }
      System.out.println("total prime numbers in given array is " +count);
      
	
//array in ascending order
		int [] arr1= {20,14,48,9,5,3,25,7};
	     
		 Arrays.sort(arr1);
		 System.out.printf("array in ascending order : %s",Arrays.toString(arr1));
*/
//Find total count of 'A' & 'a'
		 /*char [] arr2= {'a', 'A', 's', 't', 'q', 'A', 'z', 'I', 'A', 'a'};
		 int count =0;
		 for (char elee:arr2)
		 {
			 if(elee=='A' || elee=='a')
			 {
				 count= count+1;
			 }
			 else 
			 {
				 count= count+0;			 
			 }
		 }
	System.out.println(" total no of char 'A' & 'a' is present in array is "+count + " Time");
	*/
   }	
	}

	
     
   