package Users;

public class Student extends User{
	int Id;

	public Student(String name, int id, String email, String phoneNumber) {
		super(name,email,phoneNumber);
		Id = id;	
	}
	@Override
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	@Override
	public void Update(String name) {
		// do some stuff
	}
	
}
