package BaseSetup;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSteps {
    public ChromeDriver driver;
    public static void openBrowser(){
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public ChromeDriver getdriver(){
        return driver;
    }
}
