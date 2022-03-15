package CreateEmployee;

import org.testng.annotations.Test;

public class ReadDatafromCommandtest {
	
	@Test
	public void readatatest() {
		String BROWSER = System.getProperty("browser");
		System.out.println(BROWSER);
		String URL = System.getProperty("url");
		System.out.println(URL);
		String USERNAME = System.getProperty("username");
		System.out.println(USERNAME);
	}
  
}
