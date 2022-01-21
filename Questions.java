package fristt;

import java.util.Arrays;

/*
 *  WAP to print all the values of an array
	WAP to print elements of array in reverse order
	WAP to print duplicate values in an array
	WAP to sort the array
	WAP to reverse a 6 digit number (123456)---à(654321)
 */
public class Questions {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
		//WAP to print all the values of an array
		System.out.print(Arrays.toString(a));
		
		System.out.println("\n"+"--------------------------");
		//WAP to print elements of array in reverse order
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]);
		}
		System.out.println("\n"+"--------------------------");
		//WAP to print duplicate values in an array
		int a1[]= {1,2,3,4,4,6,2,8,5,3,9,5,6,7,8};
		for(int i=0;i<a1.length;i++) {
			for(int j=i+1;j<a1.length;j++) {
				if(a1[i]==a1[j]) 
					System.out.print(a1[i]);
			}
			
		}
		System.out.println("\n"+"--------------------------");
		//WAP to sort the array
		for (int j = 0; j <a1.length - 1; j++) {

            if (a1[j] > a1[j + 1]) {

                int temp = a1[j];
                a1[j] = a1[j + 1];
                a1[j + 1] = temp;
                j = -1;
            }
        }
		System.out.print(Arrays.toString(a1));
		
		System.out.println("\n"+"--------------------------");
		//WAP to reverse a 6 digit number (123456)---à(654321)
		
		int no=123456;
		int rev=0;
		int temp=no;
		while(temp!=0) {
			int rem =temp%10;
			temp=temp/10;
			rev=rev*10+rem;
		}
		System.out.print(no+"\t"+rev);
		
		
	}
	
}
