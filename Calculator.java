package com.visionit;
import java.util.*;

public class Calculator 
{   
	public static void main(String[] args)
	{
	    System.out.println("Enter the first number");
	    Scanner sc = new Scanner(System.in);
	    float a=sc.nextFloat();
	    
	    System.out.println("Select Operation");
	    System.out.println("01: Multiplication;          "
	    		+ "02: Addition;        "
	    		+ "03: Division; \n"
	    		+ "04: Modulus;                 "
	    		+ "05: Power;           "
	    		+ "06: Log e;\n"
	    		+ "07: Sin;                     "
	    		+ "08: Cos;             "
	    		+ "09: Tan; \n"
	    		+ "10: Square;                  "
	    		+ "11: Cube;            "
	    		+ "12: Squareroot; \n"
	    		+ "13: Cuberoot;                "
	    		+ "14: Factorial;       "
	    		+ "15: Lag10     ");
	    System.out.println("Selected operation is ");
	    Scanner sc0=new Scanner(System.in);
	    int z=sc0.nextInt();
	   
	   
	    switch(z)
	    {
	    case 1:
	    	System.out.println("Enter the Second number");
		    Scanner sc1 = new Scanner(System.in);
		    Float b=sc.nextFloat();
         
		    Float result = a * b;
            System.out.printf("multiplication of "+ a + " and "+ b + " is %.2f ",result );
        break;
          
	    case 2:
	    	System.out.println("Enter the Second number");
		    Scanner sc2 = new Scanner(System.in);
		    Float b2=sc2.nextFloat();
	        Float result2 = a + b2;
	        System.out.printf("addition of "+ a + " and "+ b2 + " is %.2f", result2 );
	    break;
	          
	    case 3:
	    	System.out.println("Enter the Second number");
		    Scanner sc3 = new Scanner(System.in);
		    float b3=sc3.nextFloat();
	        float result3 = a / b3;
	        System.out.printf("Dividion of "+ a + "and "+ b3 + " is %.2f", result3 );      
        break;
              
	    case 4:
	    	System.out.println("Enter the Second number");
		    Scanner sc4 = new Scanner(System.in);
		    float b4 =sc4.nextFloat();
	    	float result4 = a % b4;
	        System.out.printf("Reminder of "+ a + " and "+ b4 + " is %.2f", result4 );
	        break;
	          
	     case 5:
	    	 System.out.println("Enter the Second number");
	 	     Scanner sc5 = new Scanner(System.in);
	 	     float b5=sc5.nextFloat();
	    	 float result5 = (float) Math.pow(a, b5);
	    	 System.out.printf( a + " ^ " + b5 + " is %.2f", result5);
	     break;
	   
	     case 6:
	    	  double result6 =Math.log(a);
	    	  System.out.printf( "(natural) log of " +a+ " is %.4f", result6);
	     break; 	          
	     case 7:
	    	  double result7 =Math.sin(a);
	    	  System.out.printf("Sin of "+ a +" is %.2f " ,result7 );
	     break; 
	          
	     case 8:
	    	  double result8 =Math.cos(a);
	    	  System.out.printf("Cos of "+ a +" is %.2f " ,result8 );
	     break; 
	     
	     case 9:
	    	  double result9 =Math.tan(a);
	    	  System.out.printf("Tan of "+ a +" is %.2f" ,result9 );
	     break; 
	     
	     case 10:
    	 	 float result10 =a * a;
	    	 System.out.printf( "Square of " + a + " is %.2f", result10 );
	     break;
	     
	     case 11:
    	 	 float result11 = a *a *a;
	    	 System.out.printf( "Cube of " + a + " is %.2f" + result11 );
	     break;
	     
	     case 12:
    	 	 double result12 = Math.sqrt(a);
	    	 System.out.printf( "Square of " + a + " is %.2f", result12 );
	     break;
	    
	     case 13:
    	 	 double result13 = Math.cbrt(a);
	    	 System.out.printf( "Square of " + a + " is %.2f" , result13 );
	     break;
	     
	     case 14:
	    	 int i, fact=1;
	    	 for (i=1; i<=a; i++)
	    	 {
	    	   fact=fact*i;
	    	 }
	    	 System.out.printf( "factorial of " + a + " is %.2f", fact );
	     break;
	     
	     case 15:
	    	  double result15 =Math.log10(a);
	    	  System.out.printf( "(Common) log of " +a+ " is %.4f", result15 );
	     break; 
	     
	    }	
	}
}

  