package Pack1;

import org.testng.annotations.Test;

public class ContactTest {

	
	@Test
	public void createContactTest()
	{
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String UN = System.getProperty("username");
		String PWD = System.getProperty("pwd");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(UN);
		System.out.println(PWD);
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void updateContactTest()
	{
		System.out.println("execute updateContactTest");
	}
}
