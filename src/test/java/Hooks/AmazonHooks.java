package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AmazonHooks {

	
	@Before(order=1)
	public void setup_browser(Scenario sc) {
		
		System.out.println("launch amazon application");
		
		System.out.println(sc.getName());
		
	}
	

//	/*@Before(order=2)
//	public void setup_url() {
//		
//		System.out.println("launch Url");
//	}*/
//	
	
	@After(order=1)
	
	public void tearDown_close(Scenario sc) {
		
		System.out.println("close the browser");
		
		System.out.println(sc.getName());
		
		
	}
	
	/*@After(order=2)

     public void tearDown_Logout() {
		
		System.out.println("logout the browser");
	}*/
}
