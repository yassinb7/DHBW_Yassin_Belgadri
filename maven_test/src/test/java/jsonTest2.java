import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonTest2 {

	public static void main(String[] args) {

		Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();
		//
		Address a1 = new Address("Ellernbuschfeld", 21, "Hannover", 30539);
		Company c1 = new Company("DHL", "Hannpver");

		String[] hobbies = new String[2];
		hobbies[0] = "Fotografie";
		hobbies[1] = "Kochen";

		person p1 = new person("Yassin", "Belgadri", 21, a1, hobbies, c1, true);

		try (FileWriter writer = new FileWriter(System.getProperty("user.home")
				+ "/dev/repo/DHBW_Yassin_Belgadri/maven_test/src/main/resources/generatedjson")) {
			gsonBuilder.toJson(p1, writer);
			System.out.println("Ausgabe von generatedjson");
			System.out.println(p1);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try (FileReader reader = new FileReader(System.getProperty("user.home")
				+ "/dev/repo/DHBW_Yassin_Belgadri/maven_test/src/main/resources/person.json")) {
			person readInUser = gsonBuilder.fromJson(reader, person.class);

			System.out.println(readInUser.toString());
			// json datei wird überprüft
			assertThat(readInUser.getFirstname()).isEqualTo("Yassin");
			assertThat(readInUser.getLastname()).isEqualTo("Belgadri");
			assertThat(readInUser.getAge()).isEqualTo(21);
			assertThat(readInUser.getAddress().getStreet()).isEqualTo("Ellernbuschfeld");
			assertThat(readInUser.getAddress().getNo()).isEqualTo(21);
			assertThat(readInUser.getAddress().getCity()).isEqualTo("Hannover");
			assertThat(readInUser.getAddress().getZip()).isEqualTo(30539);
			assertThat(readInUser.getCompany().getName()).isEqualTo("DHL");
			assertThat(readInUser.getCompany().getHeadquarter_city()).isEqualTo("Hannover");
			assertThat(readInUser.getHobbies()).contains("photography", "cooking", "baking", "playing the piano",
					"languages");
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
