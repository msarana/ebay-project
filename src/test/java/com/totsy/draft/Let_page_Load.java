package com.totsy.draft;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Let_page_Load {


	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://yahoo.com");

		// time for the page to load
		// submit form

	        Object result = ((JavascriptExecutor) driver).executeScript(
	        		"function pageloadingtime()"+
	        				"{"+
	        				"return 'Page has completely loaded'"+
	        				"}"+
	        		"return (window.onload=pageloadingtime());");
        
        System.out.println(result);
		
	}

}
