package com.searchmodule.tests;

import com.searchmodule.pages.SearchPage;
import com.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest {

//    private WebDriver driver;
//
//    @BeforeTest
//    public void setupDriver(){
//        System.setProperty("webdriver.chrome.driver", "D:\\Automation\\Tools\\Drivers\\chromedriver.exe");
//        this.driver=new ChromeDriver();
//    }

    @Test
    @Parameters({"keyword"})
    public void search(String keyword){
        SearchPage searchPage=new SearchPage(driver);
        searchPage.goTo();
        searchPage.doSearch(keyword);
        searchPage.goToVideos();
        int size=searchPage.getResult();

        Assert.assertTrue(size>0);
    }
}
