package OperationLogic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class properties_logic {
	
	
	
	public static Properties pro;
	String type;
		
		public properties_logic(String type)
		{
			this.type=type;
		}
		
		public String Propeties(String ParameterName) throws IOException {

			 File src = new File(System.getProperty("user.dir") + "\\properties_config\\properties_file.properties");

	         FileInputStream fis = new FileInputStream(src);
		      pro = new Properties();
			  pro.load(fis);
			  String ParameterValue=pro.getProperty(ParameterName);
			  return ParameterValue;	
		}
	
	

}
