package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import Config.config;


public class Pratice_Forms {
	
   
	
	
	
	
	public String or_Forms="//div[normalize-space()='Forms']";
	public String or_praticeForm="//span[normalize-space()='Practice Form']";
	public String or_StudentFirstName="//input[@placeholder='First Name']";
    public String name="NICK";
	public String or_StudentLastName="//input[@placeholder='Last Name']";
	public String Lastname="pawar";
	public String or_StudentEmail="//input[@id='userEmail']";
	public String Email="nikh-nik@gmail.com";
	
	public String or_GenderMale="//label[contains(text(),'Male')]";
	public String or_GenderFemale="//label[contains(text(),'Female')]";
	
	public String or_StudentNumber="//input[@id='userNumber']";
	public String Mnumber="8565964455";
	
	public String or_SubjectBox="//input [@id='subjectsInput']";
	public String subjectSearch="math";
	public String or_Subject0="//div[@id='react-select-2-option-0']";
	public String or_Subject1="//div[@id='react-select-2-option-1']";
	public String or_Subject2="//div[@id='react-select-2-option-2']";
	

	public String or_h1="//div[@id='hobbiesWrapper']/div/div/label[normalize-space()='Reading']";
	public String or_hobiiee1="//label[normalize-space()='Sports']";
	public String or_hobiiee2="//label[normalize-space()='Reading']";
    public String or_hobiiee3="//label[contains(text(),'Music')]";
    
	
	public String or_Upload_Picture="//input[@id='uploadPicture']";
	public String UploadPIC="C:\\Users\\nikhildhumane\\Pictures\\add allergies.png";
	
	public String or_StudentAdress="//textarea[@id='currentAddress']";
	public String Adress="at wardha maharastra";
	
	
	public String or_Select_State="//div[contains(text(),'Select State')]";
	public String or_Select_State0="//div[@id='react-select-3-option-0']";
	public String or_Select_State1="//div[@id='react-select-3-option-1']";
	public String or_Select_State2="//div[@id='react-select-3-option-2']";
	
	public String or_Select_city="//div[@id='city']";
	public String or_Select_city0="//div[@id='react-select-4-option-0']";
	public String or_Select_city1="//div[@id='react-select-4-option-1']";
	
	public String or_submit="//button[@id='submit']";
	
	
	
	// Alert 
	
	public String or_alert_frame_window_Header="//div[normalize-space()='Alerts, Frame & Windows']";
	public String or_alert_Section="//span[normalize-space()='Alerts']";
	public String or_alert_click1="//button[@id='alertButton']";
	public String or_Alert11_confirmtext="You clicked a button";
	
	public String or_alert_click2="//button[@id='timerAlertButton']";
	public String or_Alert12_confirmtext="This alert appeared after 5 seconds";
	
	public String or_alert_click3="//button[@id='confirmButton']";
	public String or_Alert13_confirmtext="Do you confirm action?";
	public String or_Alert13_condirmResult="//span[@id='confirmResult']";
	public String or_select_ok_text="You selected Ok";
	public String or_select_cancel_text="You selected Cancel";
	
	public String or_alert_click4="//button[@id='promtButton']";
	
	public String or_Alert14_condirmResult="//span[@id='promptResult']";
	public String sendname="NIKHIL";
	public String or_select_ok_text11="You entered NIKHIL";
	
	
	// frames
	public String or_frame="//span[normalize-space()='Frames']";
	
	public int frame1_index=0;
	public String or_frame1HeaderPATH="//h1[@id='sampleHeading']";
	
	public int frame2_index=1;
	public String or_frame2HeaderPATH="//h1[@id='sampleHeading']";
	
	
	//Nested Frame
	public String or_NestedFrame="//span[normalize-space()='Nested Frames']";
	public  String Nestedframe1_name="frame1";
	public String or_parentFrame="//body";
	public  int Nestedframe2_idex=0;
	public String or_childframe="//p[normalize-space()='Child Iframe']";
	
	//module dialogs
	
	public String or_modalDialogue_Header="//span[normalize-space()='Modal Dialogs']";
	public String or_smallmodal_Click="//button[@id='showSmallModal']";
	public String or_smallmodal_Body="//div[@class='modal-body']";
	public String or_smallmodal_closeButton="//button[@id='closeSmallModal']";
	public String or_largemodal_click="//button[@id='showLargeModal']";
	public String or_largemodal_Body="//div[@class='modal-body']";
	public String or_largemodal_closeButton="//button[@id='closeLargeModal']";
	
	
	
	
}


