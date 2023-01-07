import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_page_source {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/ekaler/Documents/GitHubCode/swag_labs_tests/src/main/java/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ekremciftci.com");

        //getting the page source
        String pageSource = driver.getPageSource();

        //Checking if 'Registry' exist on the entire page
        if (pageSource.contains("JUnit")){
            System.out.println("PASS");
        }else{
            System.out.println("FAILS");
        }

        driver.quit();
    }
}
