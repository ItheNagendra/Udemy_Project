package pojo;

public class getCourse {

	// Java Object to Json Format
	
	private String url ;
	private String services ;
	private String experties ;
	private courses Courses ;  //return type of this is not string , but it is class(courses)- means sub part of courses is there (having 3 things under this )and it coming from another  courses class
	private String LinkedIn;
		
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public String getExperties() {
		return experties;
	}
	public void setExperties(String experties) {
		this.experties = experties;
	}
	public courses getCourses() {
		return Courses;
	}
	public void setCourses(courses courses) {
		Courses = courses;
	}
	public String getLinkedIn() {
		return LinkedIn;
	}
	public void setLinkedIn(String linkedIn) {
		LinkedIn = linkedIn;
	}
	
}
