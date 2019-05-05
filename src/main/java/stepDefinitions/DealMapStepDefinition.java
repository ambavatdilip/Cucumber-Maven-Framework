package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class DealMapStepDefinition {

	WebDriver driver;

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Softtech\\eclipse-workspace\\POM\\BDD_FreeCRM\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
	}

	@SuppressWarnings("deprecation")
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {

		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		Assert.assertEquals("CRMPRO - CRM software for customer relationship management, sales, and support.",
				loginPageTitle);
	}

	// @Then("^user enters \"(.*)\" and \"(.*)\"$")
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable credentials) {
		for (Map<String,String> mapCred : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("username")).sendKeys(mapCred.get("username"));
		driver.findElement(By.name("password")).sendKeys(mapCred.get("password"));

	}
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		WebElement lognBtn = driver.findElement(By.xpath("//input[@type='submit']"));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].click();", lognBtn);
	}

	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		String homePageTitle = driver.getTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals("CRMPRO", homePageTitle);
	}

	@Then("^user moves to new contact page$")
	public void user_moves_to_new_contact_page() {

		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

	}

	// @Then("^user enter contact details \"([^\"]*)\" and \"([^\"]*)\"$")

	@Then("^user enter contact details firstname and lastname$")

	public void user_enter_contact_details_firstname_and_lastname(DataTable contactData) {

		for(Map<String, String> contactDet : contactData.asMaps(String.class, String.class)){
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys(contactDet.get("firstname"));
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys(contactDet.get("lastname"));
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Contact')]")).click();

	}
	}

	
	@Then("^user move to deal page$")
	public void user_move_to_deal_page() {

		//driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();

	}

	@Then("^user enter deal detail$")
	public void user_enter_deal_detail(DataTable dealData) {

		for(Map<String, String> custDeal : dealData.asMaps(String.class, String.class)){
		driver.findElement(By.id("title")).sendKeys(custDeal.get("title"));
		driver.findElement(By.id("amount")).sendKeys(custDeal.get("Amount"));
		driver.findElement(By.id("probability")).sendKeys(custDeal.get("Probability"));
		driver.findElement(By.id("commission")).sendKeys(custDeal.get("Commission"));
		
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();


		}
	}

	
	@Then("^user close the browser$")
	public void user_close_the_browser() {

		driver.close();

	}
}
