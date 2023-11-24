package testcases;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Config.config;
import pageObject.Pratice_Forms;

public class Tc_01_PraticeForms extends  Pratice_Forms
{
	     

    
	      @Test(enabled=false)
	      public void pratice_set() throws Exception
	      {
	    	  
	        config.obj_Op.OPENurl();
	        Thread.sleep(5000);
	        
	     	config.obj_Op.click(or_Forms);
	     	Thread.sleep(5000);
	        config.obj_Op.click(or_praticeForm);
	        Thread.sleep(5000);
	       
	       
	        config.obj_Op.sendkeys(or_StudentFirstName, name);
	        Thread.sleep(5000);
	       
	        config.obj_Op.sendkeys(or_StudentLastName, Lastname);
	        Thread.sleep(5000);
	        
	        config.obj_Op.sendkeys(or_StudentEmail, Email);
	        Thread.sleep(5000);
	       
	        Thread.sleep(5000);
	        config.obj_Op.click(or_GenderMale);
	        Thread.sleep(5000);
	     
	        config.obj_Op.sendkeys(or_StudentNumber, Mnumber);
	        Thread.sleep(5000);
	       
	      
	        config.obj_Op.sendkeys(or_SubjectBox, subjectSearch);
	        Thread.sleep(5000);
	        config.obj_Op.SCROLL_DOWNscreen();
	      
	        config.obj_Op.click(or_Subject0);
	        Thread.sleep(5000);
	        config.obj_Op.click(or_hobiiee1);
	        Thread.sleep(5000);
	        
	        config.obj_Op.click(or_hobiiee2);
	        Thread.sleep(5000);
	       
	        
	        config.obj_Op.sendkeys(or_Upload_Picture, UploadPIC);
	        Thread.sleep(5000);
	        
	        config.obj_Op.sendkeys(or_StudentAdress, Adress);
	        Thread.sleep(5000);
	        config.obj_Op.SCROLL_DOWNscreen();
	        config.obj_Op.click(or_Select_State);
	        Thread.sleep(5000);
	        config.obj_Op.click(or_Select_State1);
	        Thread.sleep(5000);
	        
	        config.obj_Op.click(or_Select_city);
	        Thread.sleep(5000);
	        config.obj_Op.click(or_Select_city1);
	        Thread.sleep(5000);
	        config.obj_Op.zoomscreen();  
	        Thread.sleep(5000);
	        config.obj_Op.click(or_submit);
	        Thread.sleep(5000);
	        
	        config.obj_Op.ClosedBrowser();
	       
         }
/*============================================================================================================*/	      
	    @Test(enabled=false)
	  	 public void TC_02_Alert() throws Exception 
	  	   {
	          config.obj_Op.OPENurl();
	          
	          config.obj_Op.click(or_alert_frame_window_Header);
	          
	          config.obj_Op.click(or_alert_Section); 
	          config.obj_Op.zoomscreen();
	          
	          config.obj_Op.click(or_alert_click1); 
	          config.obj_Op.AlertVerified(or_Alert11_confirmtext);
	          
	          config.obj_Op.click(or_alert_click2); 
	          config.obj_Op.AlertVerified(or_Alert12_confirmtext);
	          
	          config.obj_Op.click(or_alert_click3);
	          config.obj_Op.AlertVerified(or_Alert13_confirmtext);
	          config.obj_Op.AlertActionMessageVerified(or_Alert13_condirmResult, or_select_ok_text);
	          
	          config.obj_Op.click(or_alert_click4);
	          config.obj_Op.AlertVerified(or_Alert14_condirmResult);
	          config.obj_Op.AlertVerified1(sendname, or_select_ok_text11);
	  	      config.obj_Op.ClosedBrowser();
		       
	     }
/*===========================================================================================================*/	      
	    @Test(enabled=false)
	    public void TC_03_Frames() throws Exception
	    {
	    	config.obj_Op.OPENurl();
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_alert_frame_window_Header);
	    	Thread.sleep(5000);
	        config.obj_Op.SCROLL_DOWNscreen();
	    	config.obj_Op.click(or_frame);
	    	Thread.sleep(5000);
	    	config.obj_Op.Switchframe(frame1_index,or_frame1HeaderPATH);
	    	Thread.sleep(5000);
	    	config.obj_Op.Switchframe(frame2_index,or_frame2HeaderPATH);
	    	Thread.sleep(5000);
	    	config.obj_Op.ClosedBrowser();
	    	
	   }
	    
	    @Test()
	    public void TC_04_Nested_Frames() throws Exception
	    {
	    	config.obj_Op.OPENurl();
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_alert_frame_window_Header);
	    	Thread.sleep(5000);
	    	config.obj_Op.SCROLL_DOWNscreen();
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_NestedFrame);
	    	Thread.sleep(5000);
	    	config.obj_Op.Switch_Nestedframe(Nestedframe1_name, or_parentFrame,Nestedframe2_idex);
	    	Thread.sleep(5000);
	    	config.obj_Op.Switch_to_parentFrame();
	    	Thread.sleep(5000);
	    	config.obj_Op.ClosedBrowser();
	    }

	    @Test(enabled=false)
	    public void TC_05_modale_dialogs() throws Exception 
	    {
	    	config.obj_Op.OPENurl();
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_alert_frame_window_Header);
	    	Thread.sleep(5000);
	    	config.obj_Op.SCROLL_DOWNscreen();
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_modalDialogue_Header);
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_smallmodal_Click);
	    	Thread.sleep(5000);
	    	config.obj_Op.Modal_dialogs(or_smallmodal_Body,"Small Model");
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_smallmodal_closeButton);
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_largemodal_click);
	    	Thread.sleep(5000);
	    	config.obj_Op.Modal_dialogs(or_largemodal_Body,"Large Model");
	    	Thread.sleep(5000);
	    	config.obj_Op.click(or_largemodal_closeButton);
	    	config.obj_Op.ClosedBrowser();

	    }


}
