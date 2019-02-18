package tests;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Gmailtitletest 
{
	WebDriver driver;
	Properties p;
	Scenario s;
	@Before
	public void method1(Scenario s) throws Exception
	{
		this.s=s;
	    File f=new File("C:\\Users\\HOME\\eclipse-workspace\\com.gmail.bdd\\src\\test\\resources\\gmailresources\\gmailproperties.properties");
	    FileReader fr=new FileReader(f);
	    p=new Properties();
	    p.load(fr);
	}
	@Given("^launch site$")
	public void method2() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", p.getProperty("cdpath"));
		driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
	}
	@Then("^title should be \"(.*)\"$")
	public void method3(String et) throws Exception
	{
		String at=driver.getTitle();
		if (at.equals(et)) {
			s.write("Gmail title test passed");
		} else {
			s.write("Gmail title test failed");
			Assert.fail();
		}
		Thread.sleep(5000);
	}
	@When("^close site$")
	public void method4() throws Exception
	{
		driver.close();
	}
}
