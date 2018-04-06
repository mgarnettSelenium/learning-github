package learn.programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Github {
	public static WebDriver driver;
	
	public static int a = 0;
	
	
	public static void main(String[] args) {
		System.out.println("Java coding is fun");
		System.out.println("Rick and Morty");
		
		
		WebElement fake_button = driver.findElement(By.cssSelector("#Pokie"));
		WebElement fake_amount = driver.findElement(By.cssSelector("#Amount"));
		
		int b = 10;

		while  (0 < 5) { //(a < b)
			System.out.println("I am iterating ");
			fake_button.click();
			
			if(fake_amount.getText().equals("90")) {
				break;
			}

		}
		
		do {
			
			System.out.println("catdog");
			
		} while (true); 
		
		Actions action = new Actions(driver);
		action.clickAndHold(target)
		
	}

}
