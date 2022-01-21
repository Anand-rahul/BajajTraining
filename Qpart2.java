package fristt;

public class Qpart2 {

	
	public static void main(String[] args) {
		/*
		 * 
		 * *
		 * * *
		 * * * *
		 * * * * *
		 */
		// TODO Auto-generated method stub
		for (int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		/*
		 *****
		 ****
		 ***
		 **
		 *
		 */
		for (int i=5;i>=1;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("-----------------");
		//WAP to count total number of characters in String
		
		String s="Abcdefghijkl mnop";
		char ch[]=s.toCharArray();
		 int i=0;
		 for(char c : ch)
			 i++;
		 System.out.println(i);
		 
		 System.out.println("-----------------");
		 
		 //WAP to implement Binary Search
		 
		 int as[]= {4,5,6,7,8,9,10};
		 
		 int target =6;
		 int low=0;
		 int high=as.length-1;
		 while(low<=high) {
			 int mid=(low+high)/2;
			 
			 if(as[mid]>target) {
				 high=mid-1;
			 }
			 if(as[mid]<target) {
				 
				 low=mid+1;
			 }
			 if(as[mid]==target) {
				 System.out.println("OBJ at "+mid);
				 break;
			 }
		 }
	}

}
