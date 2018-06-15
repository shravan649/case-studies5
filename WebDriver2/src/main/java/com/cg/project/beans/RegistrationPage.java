package com.cg.project.beans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {

	@FindBy(id="user[login]")
	WebElement userName;

	@FindBy(id="user[email]")
	WebElement email;

	@FindBy(id="user[password]")
	WebElement password;

	@FindBy(className="btn")
	WebElement button;

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName.sendKeys(userName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickSubmitButton() {
		button.submit();	
	}
}

