package array;

public class array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5,6};
		int evencount=0;
		int oddcount=0;
		for(int x: a) {
			if(x%2==0) {
				evencount++;
			}else {
				oddcount++;
			}
		}
		
		System.out.println("no of even number in given array: "+evencount);
		System.out.println("no of odd number in given array: "+oddcount);
	}

}
