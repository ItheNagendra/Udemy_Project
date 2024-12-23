package api_Udemy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class dynamicJson {

	// Here we parameterizing the API Tests with multiple data sets
	
  @Test(dataProvider = "BooksData")  // this BookData will connect/will make connection with data provider for this step to provide data
  public void addBook(String isbn, String aisle) {  
    // Base URL
    RestAssured.baseURI = "http://216.10.245.166";

    // Send POST request with dynamic ISBN and aisle
    String response = given()
      .header("Content-Type", "application/json")
      .body(payload.addBook(isbn, aisle))  // Dynamic payload with parameters
      .when()
      .post("/Library/Addbook.php")
      .then()
      .extract().response().asString();  // Extract response as String

    // Print the response
    System.out.println(response);

    // Parse the response JSON
    JsonPath js = new JsonPath(response);  // Parsing JSON response
    String id = js.get("ID");  // Extracting "ID" field from response
    System.out.println("ID is: " + id);
  }

  
  
  
  @DataProvider (name="BooksData")   // this name is optional 
  public Object[][] getData() {
    // Providing multiple sets of test data for ISBN and Aisle
    return new Object[][] {
      { "12345", "789" },  // Test data 1
      { "67890", "456" },  // Test data 2
      { "11223", "101" }   // Test data 3
    };
  }
}
