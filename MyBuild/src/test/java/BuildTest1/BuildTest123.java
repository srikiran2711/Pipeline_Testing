package BuildTest1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class BuildTest123 {
	 WebDriver ffdriver=new FirefoxDriver();
  @Test
  public void f() {
	  ffdriver.findElement(By.xpath("//*[@name='uname']")).sendKeys("admin");
	  ffdriver.findElement(By.xpath("//*[@name='psw']")).sendKeys("pass");
	  ffdriver.findElement(By.xpath("//*[@type='submit']")).click();

  }
  @BeforeTest
  public void beforeTest() {
	  ffdriver.get("http://ec2-18-212-55-248.compute-1.amazonaws.com:8090/TestWebapp/");
	    System.setProperty("webdriver.gecko.driver","E://geckodriver.exe");
	    ffdriver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  System.out.println(ffdriver.getTitle()+"tested successfully");
	  ffdriver.close();
  }

}
