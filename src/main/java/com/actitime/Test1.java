package com.actitime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 
{
@Test
public static void test()
{
WebDriver driver=new FirefoxDriver();
driver.get("http://127.0.0.1/login.do;jsessionid=1m9io8mcavtms");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
String title=driver.getTitle();
System.out.println(title);

}
	
}
