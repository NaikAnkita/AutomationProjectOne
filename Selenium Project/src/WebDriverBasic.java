import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\softs\\Automation\\ChromeDriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url= "https://www.myntra.com/register?referer=https://www.myntra.com/"; //"https://www.ebay.com/";
		driver.get(url); //launch url
		String title = driver.getTitle();//to get title
		System.out.println(title);
		if(title.equals("Register")) {
			System.out.println("Correct Title");
		}
			else {
				System.out.println("In-Correct Title");			
			}	
	System.out.println(driver.getCurrentUrl());
	//System.out.println(driver.getPageSource());
	driver.findElement(By.xpath("//*[@class='register-user-input-email register-user-input']")).sendKeys("abrdtest@gmail.com");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
	driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8888888877");
	WebElement R1 = driver.findElement(By.xpath("//input[@id='female']"));	//select checkbox
	R1.click();
	System.out.println("Clicked successfully");
	driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/div/form/fieldset[2]/button")).click();
	//boolean b1= driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div/div/div/form/fieldset[2]/button")).isDisplayed();
	//System.out.println(b1);
	
	
	
	
//	driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Mishra");
//	
//	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("sharmamatest@gmail.com");
//	
	//driver.quit(); //to quite the browser
	//driver.close();
	}

}
