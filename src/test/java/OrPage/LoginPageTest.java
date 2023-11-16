package OrPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPageTest {
	public WebDriver driver;
	
	@FindBy(css="#cms-demo > div.container > div > div:nth-child(2) > div > a > span.hidden-xs")
	public WebElement administration;
	
	@FindBy(css="div[class='input-group']>input[id='input-username']")
	public WebElement UserName;
	
	@FindBy(css="input[id='input-password']")
	public WebElement Password;
	
	@FindBy(css="div[class='text-end']>button")
	public WebElement Login;
	
	@FindBy(css="#modal-security > div > div > div.modal-header > button")
	public WebElement Close;
	
	@FindBy(css="ul[id='menu']>li[id='menu-catalog']")
	public WebElement Catalog;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(1)")
	public WebElement Categeries;
	
	@FindBy(css="#content > div.page-header > div > div > a")
	public WebElement Plus;
	
	@FindBy(css="ul[class='nav nav-tabs']>li:nth-child(2)")
	public WebElement Data;
	
	@FindBy(css="#form-category > ul > li:nth-child(3) > a")
	public WebElement SEO;
	
	@FindBy(css="#form-category > ul > li:nth-child(4) > a")
	public WebElement Design;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(2)")
	public WebElement PRODUCT;
	
	@FindBy(css="datalist[id='list-name']")
	public WebElement DATALIST;
	
	@FindBy(css="datalist[id='list-model']")
	public WebElement MODEL;
	
	@FindBy(css="input[id='input-price']")
	public WebElement Price_input;
	
	@FindBy(css="input[id='input-quantity']")
	public WebElement QUANTITY;
	
	@FindBy(css="select[id='input-status']")
	public WebElement STATUS;
	
	@FindBy(css="div[class='text-end']>button")
	public WebElement Filter_button;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(3)")
	public WebElement Subscription;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(4)")
	public WebElement Filter;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(5)")
	public WebElement Attributes;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(6)")
	public WebElement Optional;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(7)")
	public WebElement Manufactures;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(8)")
	public WebElement Download;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(9)")
	public WebElement Reviews;
	
	@FindBy(css="ul[id='collapse-1']>li:nth-child(10)")
	public WebElement Information;
	
	@FindBy(css="ul[id='menu']>li:nth-child(3)")
	public WebElement Extension;
	
	@FindBy(css="#collapse-2 > li:nth-child(1) > a")
	public WebElement MarketPlace;
	
	@FindBy(css="input[id='input-search']")
	public WebElement Place_market;
	
	@FindBy(css="select[class='form-select']")
	public WebElement Theme;
	
	@FindBy(css="ul[id='collapse-2']>li:nth-child(2)")
	public WebElement Installer;
	
	@FindBy(css="ul[id='collapse-2']>li:nth-child(3)")
	public WebElement extension;
	
	@FindBy(css="select[id='input-type']")
	public WebElement formes;
	
	@FindBy(css="div[class='input-group-text']")
	public WebElement onclick_section;
	
	public LoginPageTest(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
public void Administration() {
administration.click();
}
public void username() {
 UserName.sendKeys("demo");
}
public void password() {
Password.sendKeys("demo");
}
public void login() {
Login.click();
}
public void close_btn() throws InterruptedException {
	Thread.sleep(1000);
	Close.click();
}
public void CATALOG() {
	Catalog.click();
}
public void CATAGERIES() {
	Categeries.click();
}
public void Plus_button() {
	Plus.click();
}
public void DATA() {
	Data.click();
}
public void seo() {
	SEO.click();
}
public void design() {
	Design.click();
}
public void Products( ) {
	PRODUCT.click();
}
public void allDescription() {
	Subscription.click();
	Filter.click();
	Attributes.click();
	Optional.click();
	Manufactures.click();
	Download.click();
	Reviews.click();
	Information.click();
	Extension.click();
	MarketPlace.click();
}
public void place(String SearchThemes) {
	Place_market.sendKeys(SearchThemes);
}
public void THEME(String DataModified) {
	Theme.sendKeys(DataModified);
	
}
public void install() {
	Installer.click();
}
public void Extension() {
	extension.click();
}
public void Formed(String Filter ) {
	formes.sendKeys(Filter);
	
}
public void filtersection() {
	onclick_section.click();
}
}
