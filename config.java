package Config;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import OperationLogic.Operation;
import OperationLogic.properties_logic;

public class config 

{ 
	
	public static Operation obj_Op=new Operation();	// Pass Parameter for islogEnable, isReportEnable & Result storage Path

	public static properties_logic pro_obj=new properties_logic("properties_file.properties");
    
	
}




