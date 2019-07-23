package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class sel1 {
	WebDriver driver;
	@Given ("open the browser")
	public void open_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_C2a.05.05\\Desktop\\selenium folder\\DRIVERS\\chromedriver.exe");
	   driver=new ChromeDriver();
		driver.get("http://demoaut.com");
	}
	@And ("Enter the uname")
	public void Enter_the_name() {
		driver.findElement(By.xpath("//tr/td[2]/input[@name='userName']")).sendKeys("mercury");
		System.out.println("report");
	}
	@And("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
		
	}

	@Then("Submit the suite")
	public void submit_the_suite() {
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}
}
