package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.CommonUtils;
import common.Driver;

public class VehicleDataPage extends Driver {
	private CommonUtils common;
	
	@FindBy(id ="make")
	WebElement ddMake;
	
	@FindBy(xpath ="//select[@id='make']/following-sibling::span[contains(@class,'error')]")
	WebElement errorMake;
	
	@FindBy(id ="model")
	WebElement ddModel;
	
	@FindBy(id ="cylindercapacity")
	WebElement txtCylinderCapacity;
	
	@FindBy(xpath ="//input[@id='cylindercapacity']/following-sibling::span[contains(@class,'error')]")
	WebElement errorCylinderCapacity;
	
	@FindBy(id ="engineperformance")
	WebElement txtEnginePerformance;
	
	@FindBy(xpath ="//input[@id='engineperformance']/following-sibling::span[contains(@class, 'error')]")
	WebElement errorEnginePerformance;
	
	@FindBy(id ="dateofmanufacture")
	WebElement dteDateOfManufacture;
	
	@FindBy(xpath ="//input[@id='dateofmanufacture']/parent::div/child::span")
	WebElement errorDateOfManufacture;
	
	@FindBy(id ="numberofseatsmotorcycle")
	WebElement ddNumberOfSeats;
	
	//fuel type => id: fuel
	@FindBy(id ="fuel")
	WebElement ddFuelType;
	
	
	//payload id: payload
	@FindBy(id ="payload")
	WebElement txtPayload;
	
	
	//total weight id: totalweight
	@FindBy(id ="totalweight")
	WebElement txtTotalWeight;
	
	@FindBy(id ="listprice")
	WebElement txtListPrice;
	
	//license plat number
	@FindBy(id ="licenseplatenumber")
	WebElement txtLicensePlateNumber;
	
	@FindBy(id ="annualmileage")
	WebElement txtAnnualMilage;
	
	@FindBy(id ="nextenterinsurantdata")
	WebElement btnNext;
	
	public VehicleDataPage() {
		common = new CommonUtils();
		PageFactory.initElements(driver, this);
	}
	
	public void clickNext() {
		common.click(btnNext);
	}
	
	
	// basic code 
	
	
	public String enginePerformanceError() {
		//input[@id='engineperformance']/following-sibling::span[contains(@class, 'error')]

		return driver.findElement(By.xpath("//input[@id='engineperformance']/following-sibling::span[contains(@class, 'error')]")).getText();
	}

	public void setEnginePerformance(String value) {
		// engine performance
		driver.findElement(By.id("engineperformance")).sendKeys(value);

	}
	


	
	public void enterVehicleData() throws Exception {
		// select make
		common.selectDropdownValue(ddMake, "Nissan");

		// engine performance
		common.sendKeys(txtEnginePerformance, "1400");				
		
		common.sendKeys(dteDateOfManufacture, "08/14/2023");		

		// number of seats
		common.selectDropdownValue(ddNumberOfSeats, "5");

		// Fuel type
		common.selectDropdownValue(ddFuelType, "Gas");


		// Payload
		common.sendKeys(txtPayload, "850");

		// Total Weight
		common.sendKeys(txtTotalWeight, "7500");

		// List Price
		common.sendKeys(txtListPrice, "45000");

		// License Plate
		common.sendKeys(txtLicensePlateNumber, "Keyword Framework");

		// Annual Mileage
		
		common.sendKeys(txtAnnualMilage, "12000");

	}

}
