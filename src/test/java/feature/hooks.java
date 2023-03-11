package feature;

import base.DriverFactory;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Properties;

public class hooks {

    private WebDriver webDriver;
    private DriverFactory driverFactory;
    private ConfigReader configReader;
    Properties prop;

    @Before(order = 0)
    public void getProperty() throws IOException {
        configReader = new ConfigReader();
        prop = configReader.init_prop();
    }

    @Before(order = 1)
    public void launchBrowser() throws MalformedURLException {
        String browserName = prop.getProperty("Browser");
        System.out.println(browserName);
        driverFactory = new DriverFactory();
        webDriver = driverFactory.init_driver(browserName);


    }




}
