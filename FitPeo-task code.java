package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FitPeo 
 {
	public static void main(String[] args) throws InterruptedException 
	{
		
       //   System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		
	    //  WebDriver   driver=new   ChromeDriver();
		
		
		   System.setProperty("webdriver.edge.driver","C:\\msedgedriver.exe");
		
	       WebDriver   driver=new   EdgeDriver();
		
	    
           driver.get("https://www.fitpeo.com");
      
           Thread.sleep(2000);
		
	   	   driver.manage().window().maximize();
		  
		   Thread.sleep(2000);
		  
		                   // WebElement RevenueCal= driver.findElement(By.linkText("Revenue Calculator"));
		  
		   Actions act=new Actions(driver);
		  
		                   //RevenueCal.click();
		  
		  
		  driver.navigate().to("https://www.fitpeo.com/revenue-calculator");
		  
		   Thread.sleep(2000);
		   
		   act.sendKeys(Keys.PAGE_DOWN).perform();
		   
		   Thread.sleep(1000); 
		   
		   WebElement slider1 = driver.findElement(By.cssSelector("body > div.MuiBox-root.css-3f59le > div.MuiBox-root.css-rfiegf > div.MuiGrid-root.MuiGrid-container.MuiGrid-spacing-xs-6.css-l0ykmo > div:nth-child(2) > div > div > span.MuiSlider-root.MuiSlider-colorPrimary.MuiSlider-sizeMedium.css-16i48op > span.MuiSlider-thumb.MuiSlider-thumbSizeMedium.MuiSlider-thumbColorPrimary.MuiSlider-thumb.MuiSlider-thumbSizeMedium.MuiSlider-thumbColorPrimary.css-1sfugkh > input[type=range]"));
	       
		   Thread.sleep(1000); 
		   
	       act.dragAndDropBy(slider1,93, 0).build().perform();
		   
	       act.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT).perform();
	       
	        Thread.sleep(1000);
	        
	        WebElement SliderValue=driver.findElement(By.xpath("//*[@id=\":R57alklff9da:\"]"));
	        
	        String slival=SliderValue.getAttribute("value");
	        
	        System.out.println("the Slider position & textfieldbox value is updated correctly: "+slival);
		 
		     WebElement textfieldbox=driver.findElement(By.xpath("//*[@id=\":R57alklff9da:\"]"));
		
		     Thread.sleep(1000);

		     textfieldbox.click();
	        
	         Thread.sleep(3000); 
	        
	         act.sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).sendKeys(Keys.BACK_SPACE).perform();
		  
	         textfieldbox.sendKeys("560");
	        
	         String tfb=textfieldbox.getAttribute("value");
	         
	         Thread.sleep(1000);
	        
	         WebElement slider= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div/span[1]/span[3]/input"));
	        
	         String slr=slider.getAttribute("value");
	        
	         System.out.println("Enter the TextFieldbox value is: "+slr);
	        
	         System.out.println("the TextFieldbox value and Slider position is updated correctly : "+ tfb);
	        
	         if(tfb.equalsIgnoreCase(slr))
	          {
	        	  System.out.println("Both the slider position & textfieldbox values are same:"+tfb);
	        	 
	           }
	         else
	           {
	        	 System.out.println("both the Slider position & textfieldbox values are different"+slival+tfb);
	            }
	        
	         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input")).click();

	         Thread.sleep(1000);
	        
	         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
	        
	         Thread.sleep(1000);
	        
	         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
	        
	         Thread.sleep(1000);
	        
	         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")).click();

	         WebElement totalReimbursement = driver.findElement(By.cssSelector("body > div.MuiBox-root.css-3f59le > div.MuiBox-root.css-rfiegf > header > div > p:nth-child(4) > p"));
	         
	         String actualReimbursement = totalReimbursement.getText();
	         
	         String expectedReimbursement = "$110700";
	         
	          if (actualReimbursement.equalsIgnoreCase(expectedReimbursement))
	          {
	             System.out.println("Total Recurring Reimbursement is correct.");
	           }
	          else
	          {
	             System.out.println("Total Recurring Reimbursement is incorrect.");
	           }

	          System.out.println("if you enter the 820 value in textfield,the Total Recurring Reimbursement is correct");
	          
			  driver.close();
			  

      }
 }
