package configurationDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class TestLearnAutomation {
	private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(TestLearnAutomation.class);
	
//	ConfigReader config;
//	WebDriver driver;
//	@BeforeTest
//	public void setUp(){
//		
//		config=new ConfigReader() ;
//		System.setProperty("webdriver.chrome.driver", config.getChromePath());		
//	}
	@Test
	public void testChrome(){
		
//	 	driver=new ChromeDriver();
//	 	LOGGER.info("Browser opened");
//		driver.get(config.getURL());
//		LOGGER.info("URL opened");
//		driver.quit();
//		
//		String str="vishn *&%%u";
//		Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
//	      Matcher m = p.matcher(str);
//		if(str.contains(" ")){
//			System.out.println("FAIL");
		
		String str = "V!is@hn&u#";
		 
	      Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
	      Matcher m = p.matcher(str);
	 
	      //System.out.println(str);
	      if(m.find()){
     		System.out.println("FAIL");
//	      int count = 0;
//	      while (m.find()) {
//	         count = count+1;
//	         System.out.println("position "  + m.start() + ": " + str.charAt(m.start()));
//	      }
//	      System.out.println("There are " + count + " special characters");}
	

	      }}}
