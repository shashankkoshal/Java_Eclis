package PraticeSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Teacher {
	
	WebDriver dri;
	
	Teacher(WebDriver d)
	{
		dri = d;
	}
	
	public void i_am_teacher()
	{
		dri.findElement(By.linkText("I'm a Teacher")).click();
	}
	
	public void username()
	{
		dri.findElement(By.xpath(".//*[@id='teacher-em-input']")).sendKeys(RandomNumber.random_no());
	}
	
	public void password()
	{
		dri.findElement(By.xpath(".//*[@id='teacher-email-input']")).sendKeys(RandomNumber.random_pass());
	}
    public void signup()
    {
    	dri.findElement(By.xpath(".//*[@id='do-create-teacher-account']/span[1]")).click();
    }
	
    public void tell_us_name()
    {
    	dri.findElement(By.id("first-name-input")).sendKeys("kkjdjjdja dd");
    }
    public void tell_us_pass()
    {
    	dri.findElement(By.id("last-name-input")).sendKeys("guffdd@1122");
    }
    public void tell_us_radio()
    {
    	dri.findElement(By.className("intention-text")).click();
    }
    public void tell_us_continue()
    {
    	dri.findElement(By.name("button")).click();
    }
    
    public void join_comm() throws Exception
    {
    	dri.findElement(By.id("school-search-input")).sendKeys("a");
    	Thread.sleep(5000);
    	dri.findElement(By.id("item-201175")).click();
    }

    public void skip_join()
    {
    	dri.findElement(By.xpath(".//*[@id='nux-skip']")).click();
    }
  
    public void skipp_join()
    {
    	dri.findElement(By.xpath(".//*[@id='nux-skip']")).click();
    }
     public void verify_user_homepage()
    {
 	  String title = dri.getTitle();
 	  Assert.assertTrue(title.contentEquals("Home | Edmodo"));
 	}
    
	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.gecko.driver", "src\\driver\\geckodriver.exe");

		
		WebDriver dri = new FirefoxDriver();
		dri.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dri.get("https://www.edmodo.com/");
		dri.manage().window().maximize();
		Teacher t = new Teacher(dri);
			t.i_am_teacher();
			t.username();
			t.password();
			t.signup();
			t.tell_us_name();
			t.tell_us_radio();
			t.tell_us_pass();
			t.tell_us_continue();
			Thread.sleep(5000);
			t.join_comm();
			t.skip_join();
			Thread.sleep(5000);
			t.skipp_join();
			Thread.sleep(5000);
			t.verify_user_homepage();
			dri.quit();

	}

}
