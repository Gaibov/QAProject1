package org.wipro.automation.uo.utilitiesPkg;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile 
{

	public static String readconfigdata(String key) throws IOException
	{
		
		FileReader fr = new FileReader("./Testdata/config.properties");
		
		Properties prop=new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}

	public static String readelementdata(String key) throws IOException
	{
		
		FileReader fr = new FileReader("./Testdata/element.properties");
		
		Properties prop=new Properties();
		prop.load(fr);
		return prop.get(key).toString();
	}
	
	
}
