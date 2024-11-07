
import java.util.List;

public class person {
	 	
		private String firstname;
	    private String lastname;
	    private int age;
	    private Address address;
	    private List <String> hobbies;
	    private Company company;
	    private boolean isFromKarlsruhe;

	    // Getter und Setter
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

	    public List<String> getHobbies() {
	        return hobbies;
	    }

	    public void setHobbies(List<String> hobbies) {
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

	    public void setFromKarlsruhe(boolean fromKarlsruhe) {
	        isFromKarlsruhe = fromKarlsruhe;
	    }

	    @Override
	    public String toString() {
	        return "Person{" +
	                "firstname='" + firstname + '\'' +
	                ", lastname='" + lastname + '\'' +
	                ", age=" + age +
	                ", address=" + address +
	                ", hobbies=" + hobbies +
	                ", company=" + company +
	                ", isFromKarlsruhe=" + isFromKarlsruhe +
	                '}';
	    }

}
