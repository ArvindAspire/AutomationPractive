package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;


public class DriverFactory {
//private WebDriver driver;

public  static ThreadLocal<WebDriver> tldriver = new ThreadLocal<>();

@Parameters({"browser"})
public WebDriver init_driver(String browser){

    if(browser.equalsIgnoreCase("chrome")){
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--headless=new");
        tldriver.set(new ChromeDriver(co));
    }
    else
        if(browser.equalsIgnoreCase("firefox")){
            tldriver.set(new FirefoxDriver());
        }
        else
            System.out.println("The selected Browser is not valid");

        getDriver().manage().window().maximize();
        return getDriver();


}

    public static WebDriver getDriver() {
    return tldriver.get();
    }


}
