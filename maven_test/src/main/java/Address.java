
public class Address {
	
	 private String street;
	    private int no;
	    private String city;
	    private int zip;

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

	    @Override
	    public String toString() {
	        return "Address{" +
	                "street='" + street + '\'' +
	                ", no=" + no +
	                ", city='" + city + '\'' +
	                ", zip=" + zip +
	                '}';

	    }
}

