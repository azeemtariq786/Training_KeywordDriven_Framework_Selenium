package pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonUtils;
import common.Driver;

public class InsurantDataPage extends Driver {
	private CommonUtils common;

	@FindBy(id ="firstname")
	WebElement txtFirstName;
	
	@FindBy(id ="lastname")
	WebElement txtLastName;
	
	@FindBy(id ="birthdate")
	WebElement dteDateOfBirth;
	
	@FindBy(id ="opendateofbirthcalender")
	WebElement btnOpenDateOfBirthCalender;
	
	@FindBy(xpath ="//input[@name='Gender']/parent::label")
	List<WebElement> rdoGender;
	
	@FindBy(id ="streetaddress")
	WebElement txtStreetAddress;
	
	@FindBy(id ="country")
	WebElement ddCountry;
	
	@FindBy(id ="zipcode")
	WebElement txtZipCode;
	
	@FindBy(id ="city")
	WebElement txtCity;
	
	@FindBy(id ="occupation")
	WebElement ddOccupation;
	
	@FindBy(xpath ="//input[@name='Hobbies']/parent::label")
	List<WebElement> chkHobbies;
	
	
	@FindBy(id ="website")
	WebElement txtWebsite;
	
	@FindBy(id ="picture")
	WebElement fileSelectorPicture;
	
	@FindBy(id ="open")
	WebElement btnPictureOpen;
	
	@FindBy(id ="preventervehicledata")
	WebElement btnPrevEnterVehicleData;
	
	@FindBy(id ="nextenterproductdata")
	WebElement btnNextEnterProductData;
	
	public InsurantDataPage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	public void clickNext() {
		common.click(btnNextEnterProductData);
	}
	public void clickPrevious() {
		common.click(btnPrevEnterVehicleData);
	}
	
	public void enterInsurantData() throws Exception {
		
		common.sendKeys(txtFirstName, "Keyword");
		common.sendKeys(txtFirstName, "Framework");
		
		// gender
		common.sendKeys(txtStreetAddress, "1920 Torronto St");
		// country -> radio button
		common.selectRadioButtonOption(rdoGender, "Male");
		
		common.selectDropdownValue(ddCountry, "Aruba");
		common.sendKeys(txtZipCode, "23140");
		common.sendKeys(txtCity, "Banff");
		//occupation
		common.selectDropdownValue(ddOccupation, "Employee");
		//hobbies
		common.selectCheckboxOptions(chkHobbies, "Bungee Jumping,Cliff Diving");
		
		common.sendKeys(txtWebsite, "https://xaama.tech/");
		
		
	}
	

	

	


}
