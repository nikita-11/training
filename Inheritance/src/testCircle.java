import com.myabstract.Shape;
import com.myabstract.circle;

public class testCircle {
	public static void main(String[] args) {
		Shape s = new circle(4,"circle") ;
		double a = s.area();
		System.out.println("areas:-" + a);
		
	}

}