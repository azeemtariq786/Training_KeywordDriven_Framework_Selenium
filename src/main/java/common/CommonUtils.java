package common;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtils extends Driver {
	
	// common methods to click web element
	public void click(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
	}
	
	public void click(By by) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by)).click();
	}
	
	// common methods to pass data to text field web element
	public void sendKeys(WebElement element, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
		element.sendKeys(value);
	}
	
	public void sendKeys(By by, String value) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(by)).sendKeys(value);
	}
	
	// common method to handle dropdown
	public void selectDropdownValue(WebElement element, String value) throws Exception {

		Select options = new Select(element);
		boolean optionFound = false;
		
		for (WebElement option: options.getOptions()) {
			if (option.getText().equals(value)) {
				options.selectByVisibleText(value);
				optionFound = true;
				break;
			}
		}
		if (!optionFound) {
			throw new Exception ("Value '"+value+"' is not avaliable in the dropdown.");
		}
		
	}
	
	// common method to handle radio button options
	public void selectRadioButtonOption(List<WebElement> genderOptions, String valueToBeSelected) {	
		for (WebElement element: genderOptions) {
			if(element.getText().equalsIgnoreCase(valueToBeSelected)) {
				element.click();
			}
		}
	}
	
	// common method to handle checkbox options
	public void selectCheckboxOptions(List<WebElement> hobbies, String checkOptions) {			
		String [] hobbiesToCheck = checkOptions.split(",");			
		for(String item: hobbiesToCheck) {
			for (WebElement hobby: hobbies) {
				if(hobby.getText().equalsIgnoreCase(item)) {
					hobby.click();
					break;
				}
			}
		}
	}

}
