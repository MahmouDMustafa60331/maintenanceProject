package users;

public class Student extends User{
	int id;

	public Student(String name, int id, String email, String phoneNumber) {
		super(name,email,phoneNumber);
		this.id = id;	
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public void update(String name) {
		// do some stuff
	}
	
}
