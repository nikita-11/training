
public class TestDate {
	public static void main(String[] args) {
	Date d1 = new Date("Sunday","June" ,1880) ;
	Date d2 = new Date("Monday" ,"July" , 1990) ;
	d1.display();
	d1.modifying("Sunday", "Feb", 2018);
	d1.display();
	
	}
}
