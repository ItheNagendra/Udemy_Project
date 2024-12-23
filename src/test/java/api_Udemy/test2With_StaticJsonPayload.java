package api_Udemy;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class test2With_StaticJsonPayload {

    @Test(priority = 1)
    public void POST_reqst() throws IOException {
        // Rest Assured works on three principles: Given, When, Then
        // - Given: All Input details (Path/Query parameters + Headers)
        // - When: HTTP method and resource endpoint
        // - Then: Validate the response (status, headers, etc.)

        // Endpoint: https://petstore.swagger.io/v2/pet
        // Base URL: https://petstore.swagger.io
        // Resource: /v2/pet

        // 1) POST Request
    	
    	// Content ofn the file to String --> Content of file can convert into Byte-->Byte data to string
        RestAssured.baseURI = "https://petstore.swagger.io"; // Setting base URI here

        String response = given()
                .header("Content-Type", "application/json")
                .body(new String(Files.readAllBytes(Paths.get("C:\\Users\\hp\\Documents\\addPlace.json"))))  // first changes - content is coming from external file - file is save in documents in c drive rest are same like test1
                .when()
                .post("/v2/pet")
                .then()
                .log().all()
                .assertThat()
                .statusCode(200)
                .header("Transfer-Encoding", "chunked")
                .extract().response().asString(); // Extracting the full response as a string

        System.out.println("Full response is: " + response); // Print full response

        // Extracting ID from the response
        JsonPath js = new JsonPath(response); // Parsing JSON response
        String id = js.getString("id"); // Extracting the "id" field from the response

        System.out.println("Response ID is: " + id);

        // Storing the ID for later tests
        System.setProperty("petId", id); // Temporary storage for test lifecycle
    }
    /*
    @Test(priority = 2)
    public void updateRequest() {
        // Retrieving the ID from the previous test
        String id = System.getProperty("petId");
        if (id == null) {
            throw new IllegalStateException("Pet ID is not available. Ensure POST_reqst runs first.");
        }

        // 2) PUT Request - Update the pet
        RestAssured.baseURI = "https://petstore.swagger.io";
        String updateResponse = given()
            .header("Content-Type", "application/json")
            .body("{\"id\":" + id + ",\"category\":{\"id\":" + id + ",\"name\":\"raja\"},\"name\":\"raja\",\"photoUrls\":[\"string\"],\"tags\":[{\"id\":" + id + ",\"name\":\"raja\"}],\"status\":\"available\"}")
        .when()
            .put("/v2/pet")
        .then()
            .log().all()
            .assertThat()
            .statusCode(200)
            .extract().response().asString();

        System.out.println("Update response: " + updateResponse); // Print the update response if needed

        // You can validate the updated pet details in the response if necessary
        JsonPath js = new JsonPath(updateResponse); // Parse the response
        String updatedName = js.getString("name"); // Validate the name after update
        System.out.println("Updated name: " + updatedName);
        // Optionally assert the updated name, if expected
        assert updatedName.equals("raja");
    }

  
    
    @Test(priority = 3)
    public void GET_reqst() {
        // Retrieving the ID from the system property (set in POST_reqst)
        String id = System.getProperty("petId");
        if (id == null) {
            throw new IllegalStateException("Pet ID is not available. Ensure POST_reqst runs first.");
        }

        // 3) GET Request - Fetch the pet details using the ID
        RestAssured.baseURI = "https://petstore.swagger.io";
        
        // Sending GET request with the path parameter
        String getPlaceResponse = given()
            .pathParam("id", id)  // Replacing {id} in the URL with the actual ID
        .when()
            .get("/pet/{id}")  // Using path parameter to get pet by ID
        .then()
            .log().all()
            .assertThat()
            .statusCode(200)
            .extract().response().asString();
        
        // Parsing the GET response and extracting details
        JsonPath js1 = new JsonPath(getPlaceResponse);
        String petName = js1.getString("name"); // Correct JSON path for "name"
        System.out.println("Pet name from GET response: " + petName);

        // Optionally, you can assert the pet's name if it's expected to be updated
        assert petName.equals("raja"); // Check if the name is updated as expected
   
    }
*/
}


