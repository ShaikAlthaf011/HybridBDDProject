package StepDefinition;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import OrPage.LoginPageTest;
public class LoginApplication {
	public static WebDriver driver;
  
  public LoginPageTest login;
@Given("Login Application Url")
public void login_application_url() {
	driver=Hooks.getDriver();
	driver.navigate().to("https://www.opencart.com/index.php?route=cms/demo");
    driver.manage().window().maximize();
    login=new LoginPageTest(driver);
}
@When("click on Demo Project")
public void click_on_demo_project() {
    login.Administration();
}
@When("click catalog project")
public void click_catalog_project() {
	String str1="https://www.opencart.com/index.php?route=cms/demo";
	String str2=driver.getCurrentUrl();
	if(str1.equals(str2)) {
		System.out.println("Test Case is Passed");
	}else {
		System.out.println("Test Case is Failed");
	}
    }

@When("Switch to Democart")
public void switch_to_democart() {
   Set<String>S=driver.getWindowHandles();
   Iterator<String>It=S.iterator();
   String FirstWindow=It.next();
   String SecondWindow="";
   while(It.hasNext()) {
	   SecondWindow=It.next();
   }
   driver.switchTo().window(SecondWindow);
}
@When("I am Enter Username")
public void i_am_enter_username() {
    login.username();
}
@When("I am Enter Password")
public void i_am_enter_password() {
    login.password();
}
@When("I am click login")
public void i_am_click_login() {
    login.login();
}
@When("I am close the button")
public void i_am_close_the_button() throws InterruptedException {
    login.close_btn();
}
@When("I am Catalog button")
public void i_am_catalog_button() {
   login.CATALOG();
}
@When("I am Enter catageries")
public void i_am_enter_catageries() {
    login.CATAGERIES();
}
@When("I click Plus button")
public void i_click_plus_button() {
  login.Plus_button();
}
@When("I am click on General")
public void i_am_click_on_general() {
    login.DATA();
    login.seo();
    login.design();
}
@When("I am Enter Product")
public void i_am_enter_product() {
    login.Products();
}

@When("I am Enter the all Description")
public void i_am_enter_the_all_description() {
    login.allDescription();
}

@When("I am {string} ExtensionTheme")
public void i_am_extension_theme(String SearchThemes ) {
   login.place(SearchThemes );
}
@When("I am {string} modified")
public void i_am_modified(String DataModified) {
    login.THEME(DataModified);
}

@Then("I am Enter the Installer")
public void i_am_enter_the_installer() {
    login.install();
}
@When("I am Enter the Extension")
public void i_am_enter_the_extension() {
    login.Extension();
}
@When("I am {string} extension")
public void i_am_extension(String Filter) {
   login.Formed(Filter);
}
@When("I am Enter the filter")
public void i_am_enter_the_filter() {
   login.filtersection();
}
}
