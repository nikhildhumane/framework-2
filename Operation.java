package OperationLogic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Operation {

    public WebDriver driver;
	public ChromeOptions co;
	public WebDriverWait wait;
	public String or_UserdirectiryPath=System.getProperty("user.dir");
	public String Url="https://demoqa.com";
	public JavascriptExecutor js;
	
   public void OPENurl()
   {
	    System.setProperty("webdriver.chrome.driver", or_UserdirectiryPath+"\\drivers\\chromedriver.exe");
		co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(co);
		driver.get(Url);
		driver.manage().window().maximize();
		System.out.println("open url");
   }
		
	public void click(String xptah)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement g=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xptah))); 
	    g.click();
	    
	 
		//	 driver.findElement(By.xpath(xptah)).click();
	}
	public void sendkeys(String Xpath, String Sendvalue)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement g=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath))); 
		g.sendKeys(Sendvalue);
		//  driver.findElement(By.xpath(Xpath)).sendKeys(Sendvalue);
		  
	}

	public void AlertVerified(String ActText)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
 	    String Alert1_Text=Alert1.getText();
 	    
 	   
 	    if(Alert1_Text.equals(ActText))
 	    {
 	    	   System.out.println("Alert1 message verified");
 	    }
 	    else
 	     {
 	    	   System.out.println("Alert1 message not verified");
 	     }
 	       
 	       Alert1.accept();
	}
	
	public void AlertVerified1(String name,String ActText)
	{
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert Alert1=wait.until(ExpectedConditions.alertIsPresent());
		 Alert1.sendKeys(name);
 	    String Alert1_Text=Alert1.getText();
 	   
 	    
 	   
 	    if(Alert1_Text.equals(ActText))
 	    {
 	    	   System.out.println("Nikhil input message verified");
 	    }
 	    else
 	     {
 	    	   System.out.println("Nikhil input message Not verified");
 	     }
 	       
 	      
	}
	public void AlertActionMessageVerified(String xpath, String ActText)
	{
		 String result_alert3=driver.findElement(By.xpath(xpath)).getText();
	       
	       if(result_alert3.equals(ActText))
	       {
	    	   System.out.println("Ok select message verified");
	       }
	       else
	       {
	    	   System.out.println("ok select message not verified");
	       }
	}
	
	public void zoomscreen()
	{
		 js = (JavascriptExecutor) driver;
		 js.executeScript("document.body.style.zoom='50%'");

	        // Wait for 2 seconds
	        try {
	            Thread.sleep(2000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}
	public void SCROLL_DOWNscreen()
	{
		 js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void Switchframe(int index ,String HedarName)
	{
		driver.switchTo().frame(index);
		String frame_ActMessage=driver.findElement(By.xpath(HedarName)).getText();
		String frame_EXPMessage="This is a sample page";
		
		if(frame_ActMessage.equals(frame_EXPMessage))
		{
			System.out.println("frame "+index+" message verified");
		}
		
		else
		{
			System.out.println("frame "+index+" message not verified");
		}
		
		driver.switchTo().defaultContent();
		
		
	}
	
	public void Switch_Nestedframe(String name ,String HedarName ,int index)
	{
		driver.switchTo().frame(name);
		String frame1_ActMessage=driver.findElement(By.xpath(HedarName)).getText();
		String frame1_EXPMessage="Parent frame";
		
		if(frame1_ActMessage.equals(frame1_EXPMessage))
		{
			System.out.println(name+" message verified");
		}
		
		else
		{
			System.out.println(name+" message not verified");
		}
		
		driver.switchTo().frame(index);
		String frame2_ActMessage=driver.findElement(By.xpath(HedarName)).getText();
		String frame2_EXPMessage="Child Iframe";
		if(frame2_ActMessage.equals(frame2_EXPMessage))
		{
			System.out.println("frame "+index+" message verified");
		}
		
		else
		{
			System.out.println("frame "+index+" message not verified");
		}
		
		
	}
	
	public void Switch_to_parentFrame() 
	{
		driver.switchTo().parentFrame();
	}
	
	public void Modal_dialogs(String small, String txt)
	{
		String modal_bodyText=driver.findElement(By.xpath(small)).getText();
		System.out.println(txt+" text =" +modal_bodyText);
	}
	
	
	
	
	public void ClosedBrowser()
     {
				
				driver.quit();
	 }
	

}
