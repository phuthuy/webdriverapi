package selenium_api;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Topic01 {
	WebDriver driver;
  @Test
  public void f() {
	  String homePageTitle = driver.getTitle();
	  Assert.assertEquals(homePageTitle, "Guru99 Bank Home Page");
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
	  driver.get("https://demo.guru99.com/V4/");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
