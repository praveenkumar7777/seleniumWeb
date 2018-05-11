package config;
import static executionEngine.DriverScript.OR;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import executionEngine.DriverScript;
import utility.Log;

public class ActionKeywords {

	
	public static WebDriver driver;	 



public static void openBrowser(String object){
    try {
    	Log.info("Opening Browser");
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	}catch(Exception e) {
    		//This is to print the logs - Method Name & Error description/stack
			Log.info("Not able to open Browser --- " + e.getMessage());
			//Set the value of result variable to false
			DriverScript.bResult = false;
    	}	
	}

public static void navigate(String object){	
   try{Log.info("Navigating to URL");
   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
   driver.get(Constants.URL);
	}catch(Exception e) {
		Log.info("Not able to navigate --- " + e.getMessage());
		DriverScript.bResult = false;
		}
	}

public static void click(String object){
	try{driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	Log.info("Clicking on Webelement "+ object);
	driver.findElement(By.xpath(OR.getProperty(object))).click();
	}catch(Exception e) {
		Log.error("Not able to click --- " + e.getMessage());
		DriverScript.bResult = false;
		}
	}

public static void input_Username(String object){
try {
	driver.findElement(By.id("email")).clear(); 	
    Log.info("Entering the text in UserName");
    driver.findElement(By.id(OR.getProperty(object))).sendKeys(Constants.UserName); 
	}catch(Exception e) {
		Log.error("Not able to Enter UserName --- " + e.getMessage());
		DriverScript.bResult = false;
		}
	}

public static void input_Password(String object){
try{driver.findElement(By.id("password")).clear();
Log.info("Entering the text in Password");
driver.findElement(By.id("password")).sendKeys(Constants.Password);
	}catch(Exception e) {
		Log.error("Not able to Enter Password --- " + e.getMessage());
		 DriverScript.bResult = false;
		}
	}

public static void closeBrowser(String object, String data){
	try{
		Log.info("Closing the browser");
		driver.quit();
	 }catch(Exception e){
		 Log.error("Not able to Close the Browser --- " + e.getMessage());
		 DriverScript.bResult = false;
     	}
	}
}

/*package config;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionKeywords {

	public static WebDriver driver;
	 
public static void openBrowser(){		
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}

public static void navigate(){	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://mspot.rubique.com");
	}

public static void input_Username(){
	driver.findElement(By.id("email")).clear(); 
	driver.findElement(By.id("email")).sendKeys("Cross777@sel.com"); 
	}

public static void input_Password(){
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("rub!que@123"); 
	}

public static void click_Login(){
	driver.findElement (By.cssSelector("button[type='submit']")).click(); 
	}

public static void click_Toast(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//div[@id='toast-container']/div/div/div/div[2]")).click();
	}
public static void click_UserIcon(){
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.cssSelector("div[class='user-info ng-scope']")).click();
	}
public static void click_Logout(){
	driver.findElement(By.cssSelector("button[ng-click='vm.logout()']"));
	}

public static void closeBrowser(){
		driver.quit();
	}
}
*/