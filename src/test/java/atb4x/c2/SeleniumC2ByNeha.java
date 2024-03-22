package atb4x.c2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumC2ByNeha {
    EdgeDriver driver;
    @BeforeTest
    public void openBrowser() {
        driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }
     @Test
    public void NegativeTC(){

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();
        // Flow to Automation
        // Navigate to URL
        // Find the First Element username and enter the email Id
        // Find the Second Element username and enter the password
        // Find the Third Element username and click / submit
        // Verify that error should come
        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("phulkeneha18@gmail.com");
        WebElement password= driver.findElement(By.id("login-password"));
        password.sendKeys("123");

        WebElement submitButtn= driver.findElement(By.id("js-login-btn"));
        submitButtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement erormsg=driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(erormsg.getText());

        Assert.assertEquals(erormsg.getText(),"Your email, password, IP address or location did not match");



    }
    @Test
    public void positiveTc(){

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());

        driver.manage().window().maximize();
        // Flow to Automation
        // Navigate to URL
        // Find the First Element username and enter the email Id
        // Find the Second Element username and enter the password
        // Find the Third Element username and click / submit
        // Verify that error should come
        WebElement username= driver.findElement(By.id("login-username"));
        username.sendKeys("phulkeneha18@gmail.com");
        WebElement password= driver.findElement(By.id("login-password"));
        password.sendKeys("Testing@2024");

        WebElement submitButtn= driver.findElement(By.id("js-login-btn"));
        submitButtn.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement erormsg=driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(erormsg.getText());

        Assert.assertEquals(erormsg.getText(),"Your email, password, IP address or location did not match");



    }
@AfterTest
    public void closebROSER()
{
    driver.quit();
}
}
