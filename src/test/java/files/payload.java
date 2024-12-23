package files;

public class payload {

	
	
	public static String Addplace() 
	
	{
		return "{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";

	}
		
	
	public static String CoursePrice()
		{
			return "{\"data\": [\r\n"
					+ "        {\r\n"
					+ "            \"id\": 1,\r\n"
					+ "            \"email\": \"george.bluth@reqres.in\",\r\n"
					+ "            \"first_name\": \"George\",\r\n"
					+ "            \"last_name\": \"Bluth\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/1-image.jpg\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"id\": 2,\r\n"
					+ "            \"email\": \"janet.weaver@reqres.in\",\r\n"
					+ "            \"first_name\": \"Janet\",\r\n"
					+ "            \"last_name\": \"Weaver\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"id\": 3,\r\n"
					+ "            \"email\": \"emma.wong@reqres.in\",\r\n"
					+ "            \"first_name\": \"Emma\",\r\n"
					+ "            \"last_name\": \"Wong\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/3-image.jpg\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"id\": 4,\r\n"
					+ "            \"email\": \"eve.holt@reqres.in\",\r\n"
					+ "            \"first_name\": \"Eve\",\r\n"
					+ "            \"last_name\": \"Holt\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/4-image.jpg\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"id\": 5,\r\n"
					+ "            \"email\": \"charles.morris@reqres.in\",\r\n"
					+ "            \"first_name\": \"Charles\",\r\n"
					+ "            \"last_name\": \"Morris\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/5-image.jpg\"\r\n"
					+ "        },\r\n"
					+ "        {\r\n"
					+ "            \"id\": 6,\r\n"
					+ "            \"email\": \"tracey.ramos@reqres.in\",\r\n"
					+ "            \"first_name\": \"Tracey\",\r\n"
					+ "            \"last_name\": \"Ramos\",\r\n"
					+ "            \"avatar\": \"https://reqres.in/img/faces/6-image.jpg\"\r\n"
					+ "        }\r\n"
					+ "    ],\r\n"
					+ "    \"support\": {\r\n"
					+ "        \"url\": \"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\r\n"
					+ "        \"text\": \"Tired of writing endless social media content? Let Content Caddy generate it for you.\"\r\n"
					+ "    }}";
		
		}	
		
	public static String addBook(String isbn, String aisle)
	{
	String payload = "{\r\n"
	                + "    \"name\": \"I Learn Appium Automation with Java\",\r\n"
	                + "    \"isbn\": \"" + isbn + "\",\r\n"
	                + "    \"aisle\": \"" + aisle + "\",\r\n"
	                + "    \"author\": \"John Foe\"\r\n"
	                + "}";
	return payload ;
	
	}


	
	
}
