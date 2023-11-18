package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonUtils;
import common.Driver;

public class PriceOptionPage extends Driver {
	private CommonUtils common;
	
	@FindBy(xpath ="//input[@name='Select Option' and @value='Silver']/parent::label")
	WebElement selecOptionSilver;
	
	@FindBy(id ="nextsendquote")
	WebElement btnNext;
	
	@FindBy(id ="preventerproductdata")
	WebElement btnPrevious;
	
	@FindBy(id="viewquote")
	WebElement viewQuote;
	
	@FindBy(id="downloadquote")
	WebElement downloadQuote;
	
	public PriceOptionPage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	public void clickNext() {
		common.click(btnNext);
	}
	public void clickPrevious() {
		common.click(btnPrevious);
	}

}
