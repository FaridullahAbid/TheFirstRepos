package Utilities;

import BaseSetup.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilities extends BaseSteps {
    private WebDriverWait getwait(){
        WebDriverWait wait = new WebDriverWait(getdriver(), Duration.ofSeconds(10));
        return wait;
    }
    public void  clickElement(By locater){
        getwait().until(
                ExpectedConditions.elementToBeClickable(locater)).click();
    }
    public void sendTextElement(By locater, String text){
        getwait().until(
                ExpectedConditions.visibilityOfElementLocated(locater)).sendKeys(text);
    }
    public boolean isElementDisplayed(By locater){
        return
        getwait().until(ExpectedConditions.visibilityOfElementLocated(locater)).isDisplayed();
    }

}
