
import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import jakarta.xml.bind.*;

public class TestXml {
	public static void main(String[] args) {

		JAXBContext jaxbContext = null;
		try {

			jaxbContext = org.eclipse.persistence.jaxb.JAXBContextFactory.createContext(new Class[] { personxml.class },
					null);

			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

			// Initialisieren von variabeln
			Companyxml c1 = new Companyxml("DHL", "Hannover");
			Addressxml a1 = new Addressxml("Ellernbuschfel", 21, "Hannover", 30539);
			String[] hobbies = new String[] { "photography", "cooking", "baking" };
			personxml p1 = new personxml("Yassin", "Belgadri", 21, a1, hobbies, c1, false);

			// output to a xml file
			jaxbMarshaller.marshal(p1, new File("src\\main\\resources\\JavaToXmlPerson.xml"));

			// Ausgabe in der Konsole
			System.out.println("Ausgabe der  eingelesenen und geschriebenen XML Datei: " + "\n");
			jaxbMarshaller.marshal(p1, System.out);

		} catch (JAXBException e) {
			e.printStackTrace();
		}

		// Selbst geschriebene XML Datei in Java Objekt einlesen / mit assertThat prüfen
		// / und in der Konsole ausgeben

		JAXBContext jaxbContext2 = null;
		try {

			jaxbContext2 = org.eclipse.persistence.jaxb.JAXBContextFactory
					.createContext(new Class[] { personxml.class }, null);

			File file = new File("src\\main\\resources\\person.xml");

			Unmarshaller jaxbUnmarshaller = jaxbContext2.createUnmarshaller();

			personxml un = (personxml) jaxbUnmarshaller.unmarshal(file);

			// Ausgabe
			System.out.println("\n\nAusabe der händisch formulierten XML Datei:\n");
			System.out.println(un);
			// Prüfung mit assertThat
			assertThat(un.getFirstname()).isEqualTo("Yassin");
			assertThat(un.getLastname()).isEqualTo("Belgadri");
			assertThat(un.getAge()).isEqualTo(21);
			assertThat(un.getAddressxml().getStreet()).isEqualTo("Ellernbuschfeld");
			assertThat(un.getAddressxml().getNo()).isEqualTo(21);
			assertThat(un.getAddressxml().getCity()).isEqualTo("Hannover");
			assertThat(un.getAddressxml().getZip()).isEqualTo(30539);
			assertThat(un.getCompanyxml().getName()).isEqualTo("DHL");
			assertThat(un.getCompanyxml().getHeadquarter_city()).isEqualTo("Hannover");
			assertThat(un.getHobbies()).contains("photography", "cooking", "baking");

		} catch (JAXBException e) {
			e.printStackTrace();

		}
	}
}
