package array;

public class array5 {

	//find how many time snumber is duplicated
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[3]=10;
		a[4]=20;
		int num=10;
		int count=0;
		for(int value:a) {
			if(num==value) {
				count++;
			}
		}
		System.out.println("number of time in array:"+count);

	}

}
