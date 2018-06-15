package com.cg.WebDriver1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\javaflp crosskiling(9-4-18)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");


		WebElement searchField=driver.findElement(By.id("lst-ib"));
		//		searchField.sendKeys("pluralsight");
		searchField.sendKeys("royal enfield classic 350");
		searchField.submit();

		WebElement imagesLink=driver.findElements(By.linkText("Images")).get(0);		
		imagesLink.click();
		WebElement imagesLink1=driver.findElements(By.linkText("silver")).get(0);		
		imagesLink1.click();

		WebElement imageElement=driver.findElements(By.cssSelector("a[class=rg_l]")).get(3);

		WebElement imageLink=imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
	}
}