package com.cg.WebDriver2;

import static org.junit.Assert.*;

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

import com.cg.project.beans.RegistrationPage;

public class RegistrationPageTest {
	static WebDriver driver=new ChromeDriver();
	RegistrationPage registrationPage;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
		driver.manage().window().maximize();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.close();
	}

	@Before
	public void setUp() throws Exception {
		driver.get("https://github.com/");
		registrationPage=new RegistrationPage();
		PageFactory.initElements(driver, registrationPage);
	}

	@After
	public void tearDown() throws Exception {
		registrationPage=null;
	}

	@Test
	public void testForBlankAll() {
		registrationPage.setUserName("");
		registrationPage.setEmail("");
		registrationPage.setPassword("");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd[2]")).getText();
		String expectedErrorMessage2="Login can't be blank";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd[2]")).getText();
		String expectedErrorMessage3="Email can't be blank";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password can't be blank and is too short (minimum is 7 characters)";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForBlankEmailAndPassword() {
		registrationPage.setUserName("");
		registrationPage.setEmail("");
		registrationPage.setPassword("");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd[2]")).getText();
		String expectedErrorMessage3="Email can't be blank";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password can't be blank and is too short (minimum is 7 characters)";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForIncorrectEmailAndBlankPassword() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("sindhukalakonda1796@gmail.com");
		registrationPage.setPassword("");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd[2]")).getText();
		String expectedErrorMessage3="Email is invalid or already taken";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password can't be blank and is too short (minimum is 7 characters)";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForBlankPassword() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("sindhu@gmail.com");
		registrationPage.setPassword("");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd/p")).getText();
		String expectedErrorMessage3="Weâ€™ll occasionally send updates about your account to this inbox. Weâ€™ll never share your email address with anyone.";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password can't be blank and is too short (minimum is 7 characters)";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForShortPassword() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("sindhu@gmail.com");
		registrationPage.setPassword("asdf");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd/p")).getText();
		String expectedErrorMessage3="Weâ€™ll occasionally send updates about your account to this inbox. Weâ€™ll never share your email address with anyone.";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password is too short (minimum is 7 characters) and needs at least one number";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForPasswordWithoutNumber() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("sindhu@gmail.com");
		registrationPage.setPassword("asdfghj");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd/p")).getText();
		String expectedErrorMessage3="Weâ€™ll occasionally send updates about your account to this inbox. Weâ€™ll never share your email address with anyone.";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password needs at least one number";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForShortPasswordWithNumber() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("sindhu@gmail.com");
		registrationPage.setPassword("asdfg1");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd/p")).getText();
		String expectedErrorMessage3="Weâ€™ll occasionally send updates about your account to this inbox. Weâ€™ll never share your email address with anyone.";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password is too short (minimum is 7 characters)";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForSamePasswordAndUsername() {
		registrationPage.setUserName("gabriel1796");
		registrationPage.setEmail("gabriel1796@gmail.com");
		registrationPage.setPassword("gabriel1796");
		registrationPage.clickSubmitButton();

		String actualErrorMessage1=driver.findElement(By.xpath("//*[@id='signup-form']/div")).getText();
		String expectedErrorMessage1="There were problems creating your account.";
		Assert.assertEquals(expectedErrorMessage1, actualErrorMessage1);

		String actualErrorMessage2=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[1]/dl/dd/p")).getText();
		String expectedErrorMessage2="This will be your username. You can add the name of your organization later.";
		Assert.assertEquals(expectedErrorMessage2, actualErrorMessage2);

		String actualErrorMessage3=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[2]/dl/dd/p")).getText();
		String expectedErrorMessage3="Weâ€™ll occasionally send updates about your account to this inbox. Weâ€™ll never share your email address with anyone.";
		Assert.assertEquals(expectedErrorMessage3, actualErrorMessage3);

		String actualErrorMessage4=driver.findElement(By.xpath("//*[@id='signup-form']/auto-check[3]/dl/dd[2]")).getText();
		String expectedErrorMessage4="Password can't be your username";
		Assert.assertEquals(expectedErrorMessage4, actualErrorMessage4);
	}

	@Test
	public void testForAllValidDetails() {
		registrationPage.setUserName("gab1796");
		registrationPage.setEmail("gab179696@gmail.com");
		registrationPage.setPassword("1796gab");
		registrationPage.clickSubmitButton();
		String actual=driver.findElement(By.name("user-login")).getAttribute("content");
		String expected="gab1796";
		Assert.assertEquals(expected, actual);

	}
}
