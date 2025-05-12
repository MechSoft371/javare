package array;

public class array8 {
	
	//Find the largest/smallest element in an array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {42, 7, 19, 3, 88, 15, 67, 29, 54, 1};

		int largest=a[0];
		int smallest=a[1];
		int temp;
		
		for (int i=0;i<a.length;i++) {
			if(largest<a[i]) {
		
				temp=a[i];
				largest=smallest;
				smallest=temp;
				;
			}
		}
		
		System.out.println("largest:"+largest+"smallest:"+smallest);
	}

}
