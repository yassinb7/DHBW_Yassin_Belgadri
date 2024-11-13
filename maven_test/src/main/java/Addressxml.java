
public class Addressxml {

	// private variabel
	private String street;
	private int no;
	private String city;
	private int zip;

	public Addressxml() {

	}

	public Addressxml(String street, int no, String city, int zip) {
		this.street = street;
		this.no = no;
		this.city = city;
		this.zip = zip;
	}

	// Getter und Setter
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	// String toString ausgabe
	@Override
	public String toString() {
		String separator = config.getSeparator();
		return "Addressxml{" + separator + street + " " + no + separator + city + separator + zip + '}';

	}
}
