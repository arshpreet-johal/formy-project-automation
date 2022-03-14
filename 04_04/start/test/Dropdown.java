import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Dropdown {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/johal/Documents/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown= driver.findElement(By.id("dropdownMenuButton"));

        dropDown.click();
        WebElement auto= driver.findElement(By.id("autocomplete"));
        auto.click();
        driver.quit();
    }
}
