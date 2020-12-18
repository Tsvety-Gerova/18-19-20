package zadacha1;

public class Student extends Person {

	public static final int FRESHMAN = 9; 
	public static final int SOPHOMORE = 10; 
    public static final int JUNIOR = 11; 
    public static final int SENIOR = 12;  // klasove

    private int classStatus;

	public int getClassStatus() {
		return classStatus;
	}

	public void setClassStatus(int classStatus) {
		this.classStatus = classStatus;
	}
    
	public Student (String name, String address, String phoneNumber, String e_mail, int classStatus) {
		super(name, address, phoneNumber, e_mail); // podava na konstruktora na roditelq, za da gi setne kato stoinosti na poletata
		this.classStatus = classStatus;
	}
	
	public String toString() {
		return super.toString() + "\n" + "Class status: " + classStatus;
	}
	
}
