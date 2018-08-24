//import com.pojo.Employee;

public class TestEmployee {
public static void main(String[] args) {
//	Employee emp = new Employee(123, 200000d, 32, "citi123") ;
//	//emp.display() ;
//	System.out.println(emp);
		com.pojo.Person p1 = new com.pojo.Person(12,"ABC") ;
		com.pojo.Person p2 = new com.pojo.Person(12,"ABC") ;
		if (p1.equals(p2)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("NOT EQUAL");
		}
	
}
}
