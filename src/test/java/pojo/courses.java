package pojo;

import java.util.List;

public class courses {

	// Json inside Json - for this how to write pojo class - there are 3 things which come under courses in serialization class 
	
	private List<webAutomation> webAutomation;  // again under this it having  sub things , so for this we ll make one more class for this and ll call here by class name 
	private List<api> api;  // again under this it having  sub things , so for this we ll make one more class for this and ll call here by class name 
	private List<mobile> mobile;   //again under this it having  sub things , so for this we ll make one more class for this and ll call here by class name 
	
	
	public List<pojo.webAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<pojo.webAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}
	public List<pojo.api> getApi() {
		return api;
	}
	public void setApi(List<pojo.api> api) {
		this.api = api;
	}
	public List<pojo.mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<pojo.mobile> mobile) {
		this.mobile = mobile;
	}
	
	
}
