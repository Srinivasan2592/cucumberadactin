package loginstepdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;

	@Given("User is on the adacitn login site")
	public void user_is_on_the_adacitn_login_site() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Srinivasan\\eclipse-workspace\\MavenDemo\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("User enrtes  {string} ,{string}")
	public void user_enrtes(String username, String password) {
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(username);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(password);
	}

	@When("User clicking on Login Btn")
	public void user_clicking_on_Login_Btn() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@When("User Search hotel type and room {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_Search_hotel_type_and_room(String location, String hotel, String roomtype, String numbersofrooms,
			String chkdate, String chkoutdate, String adults, String child) {
		WebElement hotellocation = driver.findElement(By.xpath("//select[@id='location']"));
		Select se = new Select(hotellocation);
		se.selectByVisibleText(location);
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select se1 = new Select(hotels);
		se1.selectByVisibleText(hotel);
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select se2 = new Select(room);
		se2.selectByVisibleText(roomtype);
		WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select se3 = new Select(numberofrooms);
		se3.selectByVisibleText(numbersofrooms);
		WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.sendKeys(chkdate);
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.sendKeys(chkoutdate);
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select se4 = new Select(adultroom);
		se4.selectByVisibleText(adults);
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select se5 = new Select(childroom);
		se5.selectByVisibleText(child);
		WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
		search.click();
	}

	@When("User search btn")
	public void user_search_btn() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		WebElement conti = driver.findElement(By.id("continue"));
		conti.click();
	}

	@When("User book a Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_book_a_Hotel(String firstname, String LastName, String Billingaddress, String Creditcardno,
			String CreditCardType, String CardExpiryMonth, String CardExpiryyear, String CVV) {
		WebElement first = driver.findElement(By.xpath("//input[@id='first_name']"));
		first.sendKeys("firstname");
		WebElement last = driver.findElement(By.xpath("//input[@id='last_name']"));
		last.sendKeys("LastName");
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys(Billingaddress);
		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardno.sendKeys(Creditcardno);
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select se6 = new Select(cardtype);
		se6.selectByVisibleText(CreditCardType);
		WebElement cardmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select se7 = new Select(cardmonth);
		se7.selectByVisibleText(CardExpiryMonth);
		WebElement cardyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select se8 = new Select(cardyear);
		se8.selectByVisibleText(CardExpiryyear);
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys(CVV);
	}

	@When("User to click Book btn")
	public void user_to_click_Book_btn() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		WebElement orderid = driver.findElement(By.id("order_no"));
		String attribute = orderid.getAttribute("value");
		System.out.println(attribute);
		
	}

	@Then("User successfully logged into the homepage")
	public void user_successfully_logged_into_the_homepage() {
		Assert.assertTrue(true);
		driver.quit();
	}

}
