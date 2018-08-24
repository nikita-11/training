

public class array {
	public static void main(String[] args) {
		int [] numbers ;
		numbers= new int [3] ;
		numbers[0] = 100 ;
		numbers[1] = 200 ;
		numbers[2] = 200 ;
		
		System.out.println("sum:-" + numbers[0]+ numbers[1]+numbers[2]);
		
		for(int i=0 ;i<3;i++) {
			System.out.println(numbers[i]);
		}
		for(int x : numbers) {
			System.out.println(x);
			
		}
	}

}
