
public class DemoClass {
	public DemoClass() {
		System.out.println("constructor overload");
		
	}
	{
		System.out.println("non static block invoked");
	}
	static
	{
		System.out.println("static block invoked");
	}
	public void display() {
		System.out.println("display invoked invoked");
	}
	public static void show() {
		System.out.println("static show function icoked");
	}
	public static void main (String[] args) {
		//DemoClass.show() ;
		//DemoClass d = new DemoClass() ;
		
	}

}
