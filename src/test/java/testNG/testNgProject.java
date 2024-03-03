package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNgProject {

	@Test
	public void login_Test() {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.xpath("//*[@id=\"topHeader\"]/div/nav[2]/a")).click();
		driver.findElement(By.name("user_login")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("user_pwd")).sendKeys("abc12345");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/input")).click();
	}
	
	@Test
	public void signup_Test() {
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.simplilearn.com/");
		driver.findElement(By.xpath("//*[@id=\"topHeader\"]/div/nav[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"form-wrapper\"]/div/div/div/div[7]/p/a")).click();		
	}	
}
