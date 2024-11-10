import java.util.Arrays;
import java.util.List;

public class person {

	private String firstname;
	private String lastname;
	private int age;
	private Address address;
	private String hobbies[];
	private Company company;
	private boolean isFromKarlsruhe;

	// public constructor person
	public person(String firstname, String lastname, int age, Address address, String[] hobbies, Company company,
			boolean isFromKarlsruhe) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.address = address;
		this.hobbies = hobbies;
		this.company = company;
		this.isFromKarlsruhe = isFromKarlsruhe;
	}

	// empty public constructor person
	public person() {

	}

	// getter and setter methods
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public boolean isFromKarlsruhe() {
		return isFromKarlsruhe;
	}

	public void setFromKarlsruhe(boolean isFromKarlsruhe) {
		this.isFromKarlsruhe = isFromKarlsruhe;
	}

	@Override
	public String toString() {
		return "person [" + "\n" + "firstname= " + firstname + "\n" + "lastname= " + lastname + "\n" + "age= " + age
				+ "\n" + "\n" + "address=" + address + "\n" + "\n" + "hobbies=" + Arrays.toString(hobbies) + "\n" + "\n"
				+ "company= " + company + "\n" + "isFromKarlsruhe= " + isFromKarlsruhe + "\n" + "]";
	}

}