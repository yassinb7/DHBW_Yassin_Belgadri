
public class Companyxml {

	private String name;
	private String headquarter_city;

	public Companyxml() {

	}

	public Companyxml(String name, String headquarter_city) {

		this.name = name;
		this.headquarter_city = headquarter_city;
	}

	// Getter und Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadquarter_city() {
		return headquarter_city;
	}

	public void setHeadquarter_city(String headquarter_city) {
		this.headquarter_city = headquarter_city;
	}

	// String toString ausgabe
	@Override
	public String toString() {
		String separator = config.getSeparator();
		return "Companyxml{" + separator + name + separator + headquarter_city + '}';

	}
}
