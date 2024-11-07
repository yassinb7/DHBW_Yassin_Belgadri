import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class jsonTest2 {

	public static void main(String[] args) {

		Gson gsonBuilder = new GsonBuilder().setPrettyPrinting().create();

		Address a1 = new Address("Ellernbuschfeld", 21, "Hannover", 30539);
		Company c1 = new Company("DHL", "Hannpver");

		String[] hobbies = new String[2];
		hobbies[0] = "Fotografie";
		hobbies[1] = "Kochen";

		person p1 = new person("Yassin", "Belgadri", 21, a1, hobbies, c1, true);

		try (FileWriter writer = new FileWriter(System.getProperty("user.home") + "/Desktop/video.jason")) {
			gsonBuilder.toJson(p1, writer);

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try (FileReader reader = new FileReader(System.getProperty("user.home")
				+ "/dev/repo/DHBW_Yassin_Belgadri/maven_test/src/main/resources/person.json")) {
			person readInUser = gsonBuilder.fromJson(reader, person.class);

			System.out.println(readInUser.toString());

		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}
