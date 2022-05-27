package users;

public class TA extends User {
	String department;

	public TA(String name, String department, String email, String phoneNumber) {
		super(name,email,phoneNumber);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public void Update(String name) {
		// do some stuff
	}
}
