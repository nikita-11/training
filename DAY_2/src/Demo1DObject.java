
public class Demo1DObject {
	public static void main(String [] args) {
		Person [] persons ;
		persons = new Person[5] ;
		persons[0] = new Person();
		persons[1] = new Person(12,"A") ;
		persons[2] = new Person(14,"B") ;
		persons[3] = new Person(16,"C") ;
		persons[4] = new Person(18,"D") ;
		
		for(Person p : persons) {
			p.display() ;
		}
		
		
	}
  
}
