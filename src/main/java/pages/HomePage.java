package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.CommonUtils;
import common.Driver;

public class HomePage extends Driver{
	private CommonUtils common;
	
	@FindBy(id="nav_automobile")
	WebElement AutomobileTab;
	
	@FindBy(id="nav_truck")
	WebElement TruckTab;
	
	@FindBy(id="nav_motorcycle")
	WebElement MotorcycleTab;
	
	@FindBy(id="nav_camper")
	WebElement CamperTab;
	
	public HomePage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickTruckTab() {
		common.click(TruckTab);
	}
	public void clickMotorCycleTab() {
		common.click(MotorcycleTab);
	}
	public void clickAutomobileTab() {
		common.click(AutomobileTab);
	}
	public void clickCamperTab() {
		common.click(CamperTab);
	}	
	



}
