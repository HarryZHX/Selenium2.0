import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Calendar;
import java.text.SimpleDateFormat;

import java.util.Random;

public class HomePageTest {

    @Test
    public void titleTest(){
        // Go to the homepage https://tstkwidos.tk/
        // Verify title is equal to kwidos
        // turn the log off
        System.setProperty("webdriver.chrome.silentOutput","true");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testkwidos.tk");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Kwidos");
        driver.quit();
    }

    @Test
    public void Homework1() throws InterruptedException {
        // Go to the homepage https://tstkwidos.tk/
        // Verify title is equal to kwidos
        // turn the log off
        System.setProperty("webdriver.chrome.silentOutput","true");
        WebDriver driver = new ChromeDriver();
        driver.get("https://testkwidos.tk/auth/register/contractor");
        driver.manage().window().maximize();
        // add the waiting time
        Thread.sleep(4000);
        //find the first name filed
        WebElement firstName = ((ChromeDriver) driver).findElementByCssSelector("input[formcontrolname='firstName']");
        // fill the first name filed
        firstName.sendKeys("Tester");
        //find the last name filed
        WebElement lastName = ((ChromeDriver) driver).findElementByCssSelector("input[formcontrolname='lastName']");
        // fill the last name filed
        Random rand = new Random();
        int lastNameNumber = rand.nextInt(100);
        lastName.sendKeys(Integer.toString(lastNameNumber));
        // find the business name filed
        WebElement businessName = ((ChromeDriver) driver).findElementByCssSelector("input[formcontrolname='businessName']");
        // fill the business name filed
        businessName.sendKeys("Testpro, LLC");
        // find the phone number filed
        WebElement phoneNumber = ((ChromeDriver) driver).findElementByCssSelector("input[formcontrolname='phone']");
        // fill the phone name filed
        phoneNumber.sendKeys("858-402-5910");
        // find the email filed
        WebElement email = ((ChromeDriver) driver).findElementByCssSelector("input[formcontrolname='email']");
        // fill the email filed
        //generate the timestamp
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat timeOnly = new SimpleDateFormat("HH:mm:ss");
        email.sendKeys(timeOnly.format(cal.getTime()) + "@gmail.com");
        //driver.quit();
    }

}
