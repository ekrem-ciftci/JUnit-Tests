import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_driver {

    //main method
    public static void main(String[] args) {

        //locate the driver
        System.setProperty("webdriver.chrome.driver","/Users/ekaler/Documents/GitHubCode/swag_labs_tests/src/main/java/driver/chromedriver");

        //creating chrome driver
        WebDriver driver = new ChromeDriver();

        //going to the location of the website with direct link
        driver.get("https://www.ekremciftci.com");

        //maximize the screen
        driver.manage().window().maximize();

        //close the driver
        driver.close();
    }

}
