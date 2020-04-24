public class Employee 
{
	// Attributes
	private String firstName, lastName, email, address;
	private String mobileNumber;
	private int eid;
	// Parameterized Constructor
	public Employee(int eid, String firstName2, String lastName2, String email2, String address2, String mobile) {
		// TODO Auto-generated constructor stub
		this.eid = eid;
		this.firstName = firstName2;
		this.lastName = lastName2;
		this.email = email2;
		this.address = address2;
		this.mobileNumber = mobile;
	}
	// Getters
	public int getEID() {
		return this.eid;
	}
	public String getFirstName() {
		return this.firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public String getEmail() {
		return this.email;
	}
	public String getAddress() {
		return this.address;
	}
	public String getNumber() {
		return this.mobileNumber;
	}
}
