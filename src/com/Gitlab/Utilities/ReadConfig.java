package com.Gitlab.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	
	public ReadConfig()
	{
		File src= new File("./Configurations/config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e){
			System.out.println("Exceptioin is " +e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String URL=pro.getProperty("baseURL");
		return URL;
	}
	public String getEmail()
	{
		String email=pro.getProperty("email");
		return email;
		
	}
	public String getUsername()
	{
		String username= pro.getProperty("username");
				return username; 
	}
	public String getPassword()
	{
		String Password= pro.getProperty("password");
		return Password;
	}
	public String getChromePath()
	{
		String chromePath = pro.getProperty("chromepath");
		return chromePath;
	}	
}
