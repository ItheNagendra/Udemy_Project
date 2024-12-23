package oAuth_Authentication;

import static io.restassured.RestAssured.*;

import java.util.List;

import io.restassured.path.json.JsonPath;
import pojo.api;
import pojo.getCourse;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// POST call for Authorisation Server to generate Token for Furthe Any use to retrieve data 
	 String response1 =given()
	    .formParam("client_id", "value - now we dont have this ")   // form parameter use for sending secreate data to auth.server & this all credential will be provided by developer 
	    .formParam("client_secret", "right now this value we dnt have")
		.formParam("grant_type", "right now this value we dnt have")
		.formParam("scope","right now this value we dnt have" ) // these all data will br provided by develpoer
		
		.when().log().all()
		.post("give here Autherisation server url").asString(); // will be provided by develpoer
		
		System.out.println(response1);
		JsonPath jsonpath = new JsonPath(response1);
		String accessToken=jsonpath.getString("access_Token");  // get this from response 
		
		
		// Here we using Deserialization as a getter methos ( json to java object from response ) 
		
		 getCourse gc =given()
		.queryParam("access_Token", accessToken)
		
		.when().log().all()
		 .get("give here get call url").as(getCourse.class);  // url which is provided by develpoer in contract, .as(getCourse.class)- this means it converting data into java object(Deserialization
		 
		
		System.out.println(gc);  // now we ll get all details in response 
		System.out.println(gc.getLinkedIn()); // get various data from response 
		System.out.println(gc.getCourses().getApi().get(1).getCourseTitle());// get data from response 
		
		List<api> apiCourses = gc.getCourses().getApi(); // Assuming 'gc' and 'Api' are properly defined.
		for (int i = 0; i < apiCourses.size(); i++) { // Corrected for loop syntax.
		   if (apiCourses.get(i).getCourseTitle().equalsIgnoreCase("value mention in given json data")) {
		        System.out.println(apiCourses.get(i).getPrice());
		    }
		}

		
	}

	
	// Here we using serialization as a setter method ( Java object to Jason as a request method ) 
	// make one pojo class for this same like we made deserialization 
	// then make object of that class to set value 
	// examle - getcourse p = new getcourse
	//      p.seturl("");
	//      p.setservices("");
	//      p.setexperties("");    like this to set value in pojo class 
	
	
}
