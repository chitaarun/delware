package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/arun1/Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
     //  driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
    //    Thread.sleep(2000);
     //   driver.findElement(By.id("hrefIncAdt")).click();
        
   //     //a[@value='MAA']
        
   //     //a[@value='BLR']
        
     //   driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT").
        		
        		
      // driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

     //   driver.findElement(By.xpath("//a[@value='BLR']")).click();

        Thread.sleep(2000);

        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

    //    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        }


	}


