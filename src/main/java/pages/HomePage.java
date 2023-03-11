package pages;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HomePage {
    private WebDriver driver;
    String url = "C:/Users/arvindkumar/Downloads/account_statement_CurrentFinancialYear%20-%20Copy.pdf";
    String currenturl;

    public HomePage(WebDriver driver) {
        this.driver = driver;

    }

    public void launchWebSite(){
        driver.get(url);
         currenturl= driver.getCurrentUrl();
        System.out.println(currenturl);
    }

    public void readPDF() throws IOException {
        URL pdfURL = new URL(currenturl);
        InputStream ip =pdfURL.openStream();

       PDDocument bf= PDDocument.load(ip);
       int pageCount = bf.getNumberOfPages();
       System.out.println(pageCount);


      /* System.out.println("-------PDF Content----------");
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        String pdfText =pdfTextStripper.getText(bf);

        System.out.println(pdfText);*/

    }
}
