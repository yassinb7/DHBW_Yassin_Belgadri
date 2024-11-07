	import com.google.gson.Gson;
	import com.google.gson.JsonObject;
	import org.junit.jupiter.api.Test;
	import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class jsonTest {
	    @Test
	    public void testJsonToPersonObject() {
	        // JSON-Daten
	       
	    	String json = "{\n" +
	                "  \"person\": {\n" +
	                "    \"firstname\": \"Yassin\",\n" +
	                "    \"lastname\": \"Belgadri\",\n" +
	                "    \"address\": {\n" +
	                "      \"street\": \"Ellernbuschfeld\",\n" +
	                "      \"no\": 21,\n" +
	                "      \"zip\": 30539,\n" +
	                "      \"city\": \"Hannover\"\n" +
	                "    },\n" +
	                "    \"hobbies\": [\"photography\", \"cooking\", \"baking\", \"playing the piano\", \"languages\"],\n" +
	                "    \"company\": {\n" +
	                "      \"name\": \"DHL\",\n" +
	                "      \"headquarter_city\": \"Hannover\"\n" +
	                "    },\n" +
	                "    \"isFromKarlsruhe\": false\n" +
	                "  }\n" +
	                "}";

	        // Gson-Instanz erstellen
	        Gson gson = new Gson();

	        // Extrahiere das innere Objekt "person" aus dem JSON
	        JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
	        JsonObject personJson = jsonObject.getAsJsonObject("person");

	        // JSON in ein Person-Objekt konvertieren
	        person person1 = gson.fromJson(personJson, person.class);

	        // Ausgabe des Person-Objekts
	        System.out.println(person1);

	        // Verifikation der Umwandlung
	        assertEquals("Yassin", person1.getFirstname());
	        assertEquals("Belgadri", person1.getLastname());
	        assertEquals("Ellernbuschfeld", person1.getAddress().getStreet());
	        assertEquals(21, person1.getAddress().getNo());
	        assertEquals(30539, person1.getAddress().getZip());
	        assertEquals("Hannover", person1.getAddress().getCity());
	        assertFalse(person1.isFromKarlsruhe());
	        assertEquals("DHL", person1.getCompany().getName());

	        // Hobbies-Array prüfen
	        assertArrayEquals(new String[]{"photography", "cooking", "baking", "playing the piano", "languages"}, person1.getHobbies());
	    }

	
			
		}
	

	
