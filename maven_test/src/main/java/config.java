
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.Properties;

public class config {

	private static final Properties properties = new Properties();
	static {
		try (FileInputStream input = new FileInputStream("application.properties")) {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getSeparator() {
		return properties.getProperty("separator", "#");
	}
}
