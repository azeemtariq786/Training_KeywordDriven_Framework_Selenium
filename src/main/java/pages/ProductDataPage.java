package pages;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import common.CommonUtils;
import common.Driver;

public class ProductDataPage extends Driver {
	private CommonUtils common;
	
	@FindBy(id ="startdate")
	WebElement dteStartdate;
	
	@FindBy(id ="openstartdatecalender")
	WebElement btnOpenStartDateCalender;
	
	@FindBy(id ="insurancesum")
	WebElement ddInsuranceSum;
	
	@FindBy(id ="damageinsurance")
	WebElement ddDamageInsurance;
	
	// chekbox handling
	@FindBy(xpath = "//input[@name='Optional Products[]']/parent::label")
	List<WebElement> chkOptionalProducts;

	
	@FindBy(id ="preventerinsurancedata")
	WebElement btnPrevEnterInsuranceData;
	
	@FindBy(id ="nextselectpriceoption")
	WebElement btnNextSelectPriceOption;
	
	public ProductDataPage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	public void clickNext() {
		common.click(btnNextSelectPriceOption);
	}
	public void clickPrevious() {
		common.click(btnPrevEnterInsuranceData);
	}
	

	public void enterProductData() throws Exception {
		common.sendKeys(dteStartdate, "09/25/2025");
		//insurance sum
		common.selectDropdownValue(ddInsuranceSum, "7.000.000,00");
		//damage insurance
		common.selectDropdownValue(ddDamageInsurance, "Partial Coverage");
		//optional products
		common.selectCheckboxOptions(chkOptionalProducts, "Euro Protection");
	}

}
