
public class Employee {
	private int empId ;
	private double salary ;
	private String empName ;
	private String companyName; 
	
	public Employee() {
		empId= 10 ;
		salary =0 ;
		empName ="Nikita" ;
		companyName = "Citi" ;
		
	}
	public Employee(int empId, String empName, double salary) {
		this();
		this.empId=empId; 
		this.empName=empName ;
		this.salary= salary ;
		
	}
	public void display() {
		System.out.println(empName +"\t"+empId+"\t"+companyName);
	}
	public static void main(String [] args) {
		Employee emp = new Employee(1200,"empName1",1200d);
		emp.display();
	}
}
