import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefox_driver {

    //main method
    public static void main(String[] args) {

        //locate the driver
        System.setProperty("webdriver.gecko.driver","/Users/ekaler/Documents/GitHubCode/swag_labs_tests/src/main/java/driver/geckodriver");

        //creating firefox driver
        WebDriver driver = new FirefoxDriver();

        //going to the location of the website with direct link
        driver.get("https://www.ekremciftci.com");

        //maximize the screen
        driver.manage().window().maximize();

        //close the driver
        driver.close();
    }
}
