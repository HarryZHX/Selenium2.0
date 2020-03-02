import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
    public static void main(String[] arg){
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
        driver.quit();
    }
}
