package com.cg.WebDriver2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.project.beans.LoginPage;
public class LoginPageTest {
	static WebDriver driver;
	LoginPage loginPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();   
	}

	@Before
	public  void setUp() throws Exception {
		driver.get("https://github.com/login");
		loginPage=new LoginPage();
		PageFactory.initElements(driver, loginPage);
	}

	@After 
	public void tearDown() throws Exception {
		loginPage=null;
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	
	}

	@Test
	public void testForBlankUserNameAndPassword() {
		loginPage.setUsername("");
		loginPage.setPassword("");
		loginPage.clickSubmitButton();
		String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
		String expectedErrorMessage="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}

	@Test
	public void testForWrongPassword() {
		loginPage.setUsername("shraa");
		loginPage.setPassword("awef");
		loginPage.clickSubmitButton();
		String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
		String expectedErrorMessage="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}

	@Test
	public void testForWrongUserName() {
		loginPage.setUsername("sindhu");
		loginPage.setPassword("awe");
		loginPage.clickSubmitButton();
		String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
		String expectedErrorMessage="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}

	@Test
	public void testForWrongUserNameAndPassword() {
		loginPage.setUsername("asdf");
		loginPage.setPassword("lkj");
		loginPage.clickSubmitButton();
		String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
		String expectedErrorMessage="Incorrect username or password.";
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
	}

	@Test
	public void testForCorrectUserNameAndPassword() {
		loginPage.setUsername("shraa");
		loginPage.setPassword("awe");
		loginPage.clickSubmitButton();
		String actualUserName=driver.findElement(By.name("user-login")).getAttribute("content");
		String expectedUserName="shraa";
		Assert.assertEquals(actualUserName, expectedUserName);
	}
}
