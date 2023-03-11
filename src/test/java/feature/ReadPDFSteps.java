package feature;

import base.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.HomePage;

import java.io.IOException;

public class ReadPDFSteps {
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("the user launch the Website")
    public void theUserLaunchtheBrowser(){
        homePage.launchWebSite();


    }

    @Then("read the pdf")
    public void readThePdf() throws IOException {
        homePage.readPDF();
    }
}
