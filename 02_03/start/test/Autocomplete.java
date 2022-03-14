import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\johal\\Documents\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement automComplete= driver.findElement(By.id("autocomplete"));
        automComplete.sendKeys("93 Education Road, Brampton, ON");
        Thread.sleep(1000);

        WebElement autocompleteResult= driver.findElement(By.className("pac-item"));
        autocompleteResult.click();

        driver.quit();
    }
}
