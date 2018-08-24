
public class Date {

	private String day ;
	private String month ;
	private int year ;
	public Date(String day, String month, int year) {
		this.day = day ;
		this.month=month ;
		this.year = year ;
	}
	public void display() {
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
	}
	public void modifying(String day, String month, int year) {
		this.day =day ;
		this.month= month ;
		this.year= year ;
		
	}
	
		

	

}
