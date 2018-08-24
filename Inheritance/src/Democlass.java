
import com.pojo.Employee ;
import com.myabstract.Shape ;

public class Democlass {
	public static void main(String[] args) {
		EmployeeIO empIO = new EmployeeIO() {
			public void writeEmployee(Employee employee) {
				employee.display();
			}
			public Employee readEmployee() {
				return new Employee() ;
			}
			
		};
		Employee emp = empIO.readEmployee();
		empIO.writeEmployee(emp);
		
				
	}

}