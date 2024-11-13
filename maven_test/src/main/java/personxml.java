import java.util.Arrays;
import java.util.List;
import jakarta.xml.bind.annotation.*;

// 
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class personxml {

	// private variabel
	private String firstname;
	private String lastname;
	private int age;
	private Addressxml addressxml;
	private String hobbies[];
	private Companyxml company;
	private boolean isFromKarlsruhe;

	// public constructor person
	public personxml(String firstname, String lastname, int age, Addressxml addressxml, String[] hobbies,
			Companyxml company, boolean isFromKarlsruhe) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.addressxml = addressxml;
		this.hobbies = hobbies;
		this.company = company;
		this.isFromKarlsruhe = isFromKarlsruhe;
	}

	// empty public constructor person
	public personxml() {

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

	public Addressxml getAddressxml() {
		return addressxml;
	}

	public void setAddressxml(Addressxml addressxml) {
		this.addressxml = addressxml;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public Companyxml getCompanyxml() {
		return company;
	}

	public void setCompanyxml(Companyxml companyxml) {
		this.company = companyxml;
	}

	public boolean isFromKarlsruhe() {
		return isFromKarlsruhe;
	}

	public void setFromKarlsruhe(boolean isFromKarlsruhe) {
		this.isFromKarlsruhe = isFromKarlsruhe;
	}

	// String toString ausgabe
	@Override
	public String toString() {
		String separator = config.getSeparator();

		return separator + firstname + separator + lastname + separator + age + separator + addressxml + separator
				+ Arrays.toString(hobbies) + separator + company + separator + isFromKarlsruhe;
	}

}