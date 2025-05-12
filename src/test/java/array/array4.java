package array;

public class array4 {

	//search an element in array
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int search_no=21;
		boolean d=false;
		
		for(int i=0; i<a.length; i++) {
			if(search_no==a[i]) {
				d=true;
				System.out.println("Element is found");
			}
		}
		if(d==false) {
			System.out.println("element is not found");
		}

	}

}
