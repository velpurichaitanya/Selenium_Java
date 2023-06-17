package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;

public class GenericMethods extends SetupMethods{

    public static void customClick(String locatorHint){
        System.out.println("Clicking on "+locatorHint);
        if (locatorHint.contains("//")){
            driver.findElement(By.xpath(locatorHint)).click();
            return;
        }
        try {
            driver.findElement(By.xpath("//*[@*[contains(.,'"+locatorHint+"')]]")).click();
        }
        catch (WebDriverException e){
            driver.findElement(By.xpath("//*[contains(text(),'"+locatorHint+"')]")).click();
        }
    }

    public static void customInput(String locatorHint, String text){
        System.out.println("Inputting "+text+" into "+locatorHint);
        if (locatorHint.contains("//")){
            driver.findElement(By.xpath(locatorHint)).sendKeys(text);
            return;
        }
        try{
            driver.findElement(By.xpath("//*[contains(@placeholder,'"+locatorHint+"')]")).sendKeys(text);
        } catch (WebDriverException e) {
            driver.findElement(By.xpath("//*[@*[contains(.,'"+locatorHint+"')]]")).sendKeys(text);
        }
    }
}
