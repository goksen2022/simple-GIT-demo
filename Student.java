
public class Student {
	private String name;
	private Integer ID;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer ID) {
		this.ID = ID;
	}
	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.setName("Goksen");
		student1.setID(1);

		System.out.println("Student(after first setter): ");

		System.out.print("Name: " + student1.getName());
		System.out.print("\tID: " + student1.getID());
		
		student1.setName("Goksen Inel");
		student1.setID(41100144);
		
		System.out.println("\nStudent(after second setter): ");
		
		System.out.print("Name: " + student1.getName());
		System.out.print("\tID: " + student1.getID());
	}
}	
		
