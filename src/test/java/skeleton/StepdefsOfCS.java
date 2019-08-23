package stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefsOfCS {
	static WebDriver driver;
	
	@Given("azzTestMeApp is up and running")
	public void azztestmeapp_is_up_and_running() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[2]/a")).click();
	}

	@When("azzUser enters valid username {string}")
	public void azzuser_enters_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys(string);
	}

	@Then("azzenters firstname {string}")
	public void azzenters_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("firstName")).sendKeys(string);
	}

	@Then("azzenters lastname {string}")
	public void azzenters_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("lastName")).sendKeys(string);
	}

	@Then("azzenters Password {string}")
	public void azzenters_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys(string);
	}

	@Then("azzenters Confirm Password {string}")
	public void azzenters_Confirm_Password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("confirmPassword")).sendKeys(string);
	}

	@Then("azzselects gender")
	public void azzselects_gender() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"gender\"]")).click();
	}

	@Then("azzenters valid email address {string}")
	public void azzenters_valid_email_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("emailAddress")).sendKeys("mallika12345@gmail.com");
	}

	@Then("azzenters valid phone number {string}")
	public void azzenters_valid_phone_number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("mobileNumber")).sendKeys(string);
	}

	@Then("azzenters valid date of birth {string}")
	public void azzenters_valid_date_of_birth(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("dob")).sendKeys(string);
	}

	@Then("azzenters Address {string}")
	public void azzenters_Address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("address")).sendKeys(string);
	}

	@Then("azzSelects Security question")
	public void azzselects_Security_question() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .name("securityQuestion")).click();
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"securityQuestion\"]/option[1]"))).click().perform();
	}

	@Then("azzenters the answer {string}")
	public void azzenters_the_answer(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("answer")).sendKeys(string);
	}

	@Then("azzclicks on the submit button")
	public void azzclicks_on_the_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Submit")).click();
	}

	@Given("azzLogin page is ready after successfull registration")
	public void azzlogin_page_is_ready_after_successfull_registration() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
	  	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  	driver.manage().window().maximize();
	}

	@Then("azzEnter valid username {string}")
	public void azzenter_valid_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
	}

	@Then("azzenters valid password {string}")
	public void azzenters_valid_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("password")).sendKeys("Password123");
	}

	@Then("azzclicks on Login")
	public void azzclicks_on_Login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("Login")).click();
		String str = driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[4]/a/span")).getText();
		String str1 = "OrderDetails";
		
		Assert.assertEquals(str, str1);
		driver.close();
	}

	@Given("azzThe user is logged in")
	public void azzthe_user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe");
		driver=new ChromeDriver();
	  	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  	driver.manage().window().maximize();
	  	driver.findElement(By .name("userName")).sendKeys("lalitha");
	  	driver.findElement(By .name("password")).sendKeys("Password123");
	  	driver.findElement(By .name("Login")).click();
	  	
		String str = driver.findElement(By .xpath("//span[contains(text(),'Order')]")).getText();
		String str1 = "OrderDetails";
		Assert.assertEquals(str, str1);
	}

	@Then("azzenter partial data of product in searchfield")
	public void azzenter_partial_data_of_product_in_searchfield() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//span[contains(text(),'Categories')]")).click(); //All Categories
	}

	@Then("azzselects the product and clicks on find details")
	public void azzselects_the_product_and_clicks_on_find_details() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Actions a=new Actions(driver);
		
		//Electronics  
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().perform();
		
		Thread.sleep(3000);
		  
		//Headphones
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform();
	}

	@Then("azzProduct is added to the cart")
	public void azzproduct_is_added_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
	}

	@Then("azzClicks on cart link to view items in cart")
	public void azzclicks_on_cart_link_to_view_items_in_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		String str = "Headphone";
		String str1 = driver.findElement(By .xpath("//*[@id=\"cart\"]/tbody/tr/td[1]/div/div/h4")).getText();
		
		Assert.assertEquals(str, str1);
	}

	@Then("azzclicks on checkout and proceed to pay redirected to Payment page")
	public void azzclicks_on_checkout_and_proceed_to_pay_redirected_to_Payment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By .xpath("/html/body/b/div/div/div[1]/div/div[2]/div[3]/div/form[2]/input")).click();
	}

	@Then("azzSelects the bank and clicks on continue")
	public void azzselects_the_bank_and_clicks_on_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By .xpath("//*[@id=\"swit\"]/div[1]/div")).click();
		driver.findElement(By .xpath("//*[@id=\"btn\"]")).click();
	}

	@Then("azzEnters valid bank credentials to login")
	public void azzenters_valid_bank_credentials_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("username")).sendKeys("123456");
		driver.findElement(By .name("password")).sendKeys("Pass@456");
		  
		driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[3]/input")).click();
	}

	@Then("azzenters valid Transaction password and completes payment")
	public void azzenters_valid_Transaction_password_and_completes_payment() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .name("transpwd")).sendKeys("Trans@456");
		  
		driver.findElement(By .xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/div/div/form/div/div[2]/input")).click();
		String str3 = driver.findElement(By .xpath("/html/body/b/section/div/div/div/div[2]/p")).getText();
		String str4 = "Your order has been confirmed";
		Assert.assertEquals(str3, str4);
		
		driver.close();
	}

	@Given("azzUser logins with valid credentials")
	public void azzuser_logins_with_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_h2a.06.15\\Desktop\\Testing\\Week 3\\SeleniumBroDrivers\\chromedriver.exe\\");
		driver=new ChromeDriver();
	  	driver.get("http://10.232.237.143:443/TestMeApp/login.htm");
	  	driver.manage().window().maximize();
		driver.findElement(By .name("userName")).sendKeys("lalitha");
		driver.findElement(By .name("password")).sendKeys("Password123");
		driver.findElement(By .name("Login")).click();
		String str = driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[4]/a/span")).getText();
		String str1 = "OrderDetails";
		
		Assert.assertEquals(str, str1);
	}

	@When("azzUser searches for a particular product like headphones")
	public void azzuser_searches_for_a_particular_product_like_headphones() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By .xpath("//span[contains(text(),'Categories')]")).click(); //All Categories
		Actions a=new Actions(driver);
		
		//Electronics  
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span"))).click().perform();
		
		Thread.sleep(3000);
		  
		//Headphones
		a.moveToElement(driver.findElement(By .xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span"))).click().perform();
		
	}

	@When("azztry to proceed to payment without adding any item in the cart")
	public void azztry_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("Cannot view Cart link");
	}

	@Then("azzTestMeApp doesn't display the cart icon")
	public void azztestmeapp_doesn_t_display_the_cart_icon() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String str = driver.findElement(By .xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div")).getText();
		String str1 = "Cart";
		Assert.assertNotEquals(str, str1);
		System.out.println("Cart icon is not displayed");
		
		driver.close();
	}

}
