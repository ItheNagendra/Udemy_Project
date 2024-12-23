package api_Udemy;

import files.payload;
import io.restassured.path.json.JsonPath;

public class ComplexJsonParse {

	public static void main(String[] args) {
	
	JsonPath js = new JsonPath(payload.CoursePrice());
	
	// Print no of data in API 
	
	int count = js.getInt("data.size()");
	 System.out.println(count);
	 
	 // print email of 2nd index from data
	 String mailId = js.getString("data[1].email");
	 System.out.println(mailId);
	 
	 //print the first name of 3rd data
	 String firstName= js.getString("data[2].first_name");
	 System.out.println( firstName);
	 
	 // Print all firstname 
	 
	 for(int i=0; i<count;i++)
	 {
		 String first_name= js.getString("data[" + i + "].first_name");
		 int id = js.getInt("data[" + i + "].id");
		 System.out.println("first_name:"+" "+ first_name);
		 System.out.println("id:"+" "+ id);
		
	 }
	 
	 // print last name if first name matches with Charles
	 
	 System.out.println("Print last name");
	 
	 for(int i=0; i<count;i++)
	 {
		 String first_Name =js.getString("data[" + i +"].first_name");
		   if(first_Name.equalsIgnoreCase("Charles"))
		      {
			     String last_Name=js.getString("data[" + i + "].last_name");
			        System.out.println("last_name:"+" "+ last_Name);
			        break;
		      }
		 
	 }
	 
	 
	 
	 
}
}