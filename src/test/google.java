package test;

import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class google {

	
	@Test
	public void googletest() throws URISyntaxException, MalformedURLException{
		
		DesiredCapabilities caps= new DesiredCapabilities();
		//caps.setBrowserName("firefox");
		caps.setCapability(CapabilityType.BROWSER_NAME, "FIREFOX");
		//caps.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		//URI //URL
		
		URI gridUrl = new URI("http://192.168.1.6:4444");
		WebDriver driver = new RemoteWebDriver(gridUrl.toURL(), caps);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());


		
		
		
	}
}
