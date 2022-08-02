package com.awsproject;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RemoteExecution {

	public static void main(String[] args) throws MalformedURLException 
	{	
		//Declaration
		URL url=new URL("http://192.168.229.1:5555/wd/hub");
		DesiredCapabilities cap= new DesiredCapabilities();
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WINDOWS);
		RemoteWebDriver driver =new RemoteWebDriver(url,cap);
		driver.get("https://mail.google.com/");	    	
	}
}
