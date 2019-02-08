package stepdefs;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/*import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.List;
import java.util.concurrent.TimeUnit;*/

public class logintest {

    @Given("^I am on login page$")
    public void i_am_on_login_page() throws Exception {
       System.out.println( "This is I am on login page scenario" );
       }

    @When("^I entered username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_entered_username_as_and_password_as(String arg1, String arg2) throws Exception {
        System.out.println( "This is I entered username & Password scenario" );

    }

    @Then("^System should be logged in$")
    public void system_should_be_logged_in() throws Exception {
        System.out.println( "This is I am loges in scenario" );
    }


   /* public WebDriver driver;
    public static final String url = "https://axiomqa.tal.deere.com";
    public static final String username_xpath = "//*[@id=\"userName1\"]";
    public static final String password_xpath = "//*[@id=\"password1\"]";
    public static final String loginbtn_xpath = "//*[@id=\"loginFormValueProp\"]/div[1]/div[2]/div[3]/div[1]/input";
    public static final String orgids_xpath = "//*[@id=\"content\"]/section/ol";
    public static final String tools_xpath = "//*[@id=\"menu-bar\"]/nav/ul/li[5]/a";


    @Given("^I am on login page$")
    public void i_am_on_login_page() {
        System.setProperty( "webdriver.chrome.driver", "C:\\Users\\mm18780\\Desktop\\Mayank\\Automation\\cucumber_pratice\\support\\chromedriver_2.41.exe" );
        ChromeOptions options = new ChromeOptions();
        options.addArguments( "--no-sandbox" );
        driver = new ChromeDriver( options );
        driver.manage().timeouts().implicitlyWait( 30, TimeUnit.SECONDS );
        driver.manage().window().maximize();
        driver.navigate().to( url );
        String title = driver.getTitle();
        Assert.assertEquals( "MyJohnDeere Login", title );
        System.out.println( "You are on correct page" );

    }

    @When("^I entered username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void i_entered_username_as_and_password_as(String arg1, String arg2) throws Exception {
        driver.findElement( By.xpath( username_xpath ) ).sendKeys( arg1 );
        System.out.println( "Entered user Name" );
        driver.findElement( By.xpath( password_xpath ) ).sendKeys( arg2 );
        System.out.println( "Entered Password" );

    }

    @When("^I click on login$")
    public void i_click_on_login() throws Exception {
        System.out.println( "Click on Login button" );
        driver.findElement( By.xpath( loginbtn_xpath ) ).click();
        //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        Thread.sleep( 10000 );

    }

    @When("^i select Organization Id as \"([^\"]*)\"$")
    public void i_select_Organization_Id_as(String arg1) throws Exception {
        System.out.println( "Page Loading" );
        String actual_url = driver.getCurrentUrl();
        String expected_url = "https://axiomqa.tal.deere.com/supportLandingPage";

        if (!actual_url.equals( expected_url )) {
            driver.navigate().refresh();
        }

        try {

            WebElement org_list;

            org_list = driver.findElement( By.id( "content" ) );
            List<WebElement> org_ids = org_list.findElements( By.tagName( "li" ) );
            for (WebElement li : org_ids) {
                li.getText().equals( arg1 );
                li.click();
                break;
            }
        } catch (Exception e) {
            System.out.println( e.getMessage() );
        }
    }

    @Then("^System should be logged in$")
    public void system_should_be_logged_in() throws Exception {
        String expected_title = "Map - Operations Center";
        String actual_title = driver.getTitle();
        Assert.assertEquals( "User does not successfully logged in", expected_title, actual_title );
        System.out.println( "User successfully logged in" );
    }*/
}
