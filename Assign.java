package fristt;

public class Assign {

	public static void main(String[] args) {
		
	    //Prime number
	    int prime=0;
	    int number =13;
	    for(int i=2;i<number/2;i++) {
	    	if(number%i==0)
	    		prime=1;
	    }
	    if(prime==0) {
	    	System.out.println("prime number");
	    }
	    else {
	    	System.out.println("Not prime");
	    }
		
	    
	    
	    //Sum of First 10 numbers
	    int sum=0;
	    for(int i=0;i<10;i++) {
	    	sum=sum+i+1;
	    }
	    System.out.println(sum);
	  
	    
	    
	    
	    //Switch Statement
	    int month=8;
	    switch(month) {
	    case 1:
	    	System.out.println("January");
	    	break;
	    case 2:
	    	System.out.println("February");
	    	break;
	    case 3:
	    	System.out.println("March");
	    	break;
	    case 4:
	    	System.out.println("April");
	    	break;
	    case 5:
	    	System.out.println("May");
	    	break;
	    case 6:
	    	System.out.println("June");
	    	break;
	    case 7:
	    	System.out.println("July");
	    	break;
	    case 8:
	    	System.out.println("August");
	    	break;
	    case 9:
	    	System.out.println("September");
	    	break;
	    case 10:
	    	System.out.println("October");
	    	break;
	    case 11:
	    	System.out.println("November");
	    	break;
	    case 12:
	    	System.out.println("December");
	    	break;
	    default:
	    	System.out.println("out of bounds");
	    }
	    
	    
	    
	 // Leap year 
	 		int year = 1800;
	 	    int leap = 0;
	 	    if (year % 4 == 0) {
	 	      if (year % 100 == 0) {//century years
	 	        if (year % 400 == 0)
	 	          leap = 1;
	 	        else
	 	          leap = 0;
	 	      }
	 	      else
	 	        leap = 1;
	 	    }
	 	    else
	 	      leap = 0;

	 	    if (leap==1)
	 	      System.out.println("leap year");
	 	    else
	 	      System.out.println("not a leap year");   
	 	    
	 	    
	 	    
	    //Operators
	    //Logical operators //Relational Operator //unary operator
	    int a=3;
	    int b=5;
	    int c=5;
	    if(a>b && a>c) {
			System.out.println(a);
		
	    }
	    else if(b>a || b==c) {
			System.out.println(b);
	    }
	    int f=10;
	    f=-f;
	    System.out.println(f);
	    //
	}

}
