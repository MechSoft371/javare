package array;

import java.util.Arrays;

public class array7 {
	//Print all elements of an array

	//Find the length of an array

	//Copy elements from one array to another

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,23,45,56,77,88,9,10};
		int s=a.length;
		int b[]= new int[s];
		
		for(int i=0; i<a.length;i++) {
			
			b[i]=a[i];
			
		}
		
		Arrays.sort(b);
		
		System.out.println(Arrays.toString(b));
		

	}

}
