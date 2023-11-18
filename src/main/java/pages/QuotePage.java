package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonUtils;
import common.Driver;

public class QuotePage extends Driver {
	private CommonUtils common;
	
	@FindBy (id="email")
	WebElement txtEmail;
	
	@FindBy (id = "phone")
	WebElement txtPhone;
	
	@FindBy (id= "username")
	WebElement txtUserName;
	
	@FindBy (id="password")
	WebElement txtPassword;
	
	@FindBy (id = "confirmpassword")
	WebElement txtConfirmPassword;
	
	@FindBy (id = "Comments")
	WebElement txtComments;
	
	@FindBy (id="sendemail")
	WebElement btnSend;
	
	@FindBy (id = "prevselectpriceoption")
	WebElement btnPrevious;
	
	@FindBy (xpath = "//button[@class='confirm']")
	WebElement confirmEmail;
	
	public QuotePage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	public void clickSend() {
		common.click(btnSend);
	}
	public void clickPrevious() {
		common.click(btnPrevious);
	}
	
	public void confirmEmail() {
		common.click(confirmEmail);
	}

}
