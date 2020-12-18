package zadacha1;

public class TestPersons {

	public static void main(String[] args) {

		Person person = new Person (
				"Simon",
				"zhk. Banishora",
				"008938539485", 
				"simon.sim@gmail.com");
		
		Student student = new Student(
				"Linda",
				"zhk. Manastirski Livadi",
				"089574394855",
				"Linda_linda@gmail.com",
				Student.JUNIOR);
		
		Employee employee = new Employee (
				"Sasho",
				"zhk. Banishora",
				"008937909485", 
				"sasho@gmail.com",
				"NAP",
				1200.0);
		
		Staff staff = new Staff(
				"Sashko",
				"zhk. Drujba",
				"0083349485", 
				"sashkoto@gmail.com",
				"BAN",
				1800.0,
				"direktor");
		
		Faculty faculty = new Faculty (
				"Jerry",
				"zhk. Lulin",
				"09645873489", 
				"jerry@gmail.com",
				"SMG",
				1500.0,
				"08:30 - 17:00",
				"Bachelor");	
		
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		System.out.println(faculty.toString()+ "\n");
		
	}
}
