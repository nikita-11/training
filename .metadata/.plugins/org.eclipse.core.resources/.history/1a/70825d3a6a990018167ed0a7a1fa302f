import com.pojo.Employee;
import java.util.Scanner ;

public class EmployeeIOImplementation implements EmployeeIO {

	@Override
	public Employee readEmployee() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in) ;
		System.out.println("Enter age :"); 
		int age = s.nextInt();
		System.out.println("Enter empID :"); 
		int empID = s.nextInt();
		System.out.println("Enter name :"); 
		String name = s.next();
		System.out.println("Enter salary :"); 
		int salary = s.nextInt();
		
		Employee e = new Employee(empID,salary,age,name) ;
		return e ;
	}
	
	@Override
	public void writeEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}
	public static void main(String [] args) {
		EmployeeIOImplementation e = new EmployeeIOImplementation() ;
		System.out.println(e.readEmployee()) ;
	}
	

}
