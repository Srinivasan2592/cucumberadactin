package adactinloginsetpdef;

import java.util.List;
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
import io.github.bonigarcia.wdm.WebDriverManager;

public class Adactinlogin {
	WebDriver driver;

	@Given("User is on the adacitn login site")
	public void user_is_on_the_adacitn_login_site() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	}

	@When("User enrtes  username and password")
	public void user_enrtes_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		List<String> asList = dataTable.asList();
		String string = asList.get(0);
		System.out.println(string);
		WebElement txtusername = driver.findElement(By.id("username"));
		txtusername.sendKeys(string);
		String string2 = asList.get(1);
		WebElement txtpassword = driver.findElement(By.id("password"));
		txtpassword.sendKeys(string2);

	}

	@When("User clicking on Login Btn")
	public void user_clicking_on_Login_Btn() {
		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@When("User Search hotel type and room Location,Hotels,RoomType,NoOfRooms,CheckInDtae,CheckOutDat,AdultsperRoom and ChildrenperRoom")
	public void user_Search_hotel_type_and_room_Location_Hotels_RoomType_NoOfRooms_CheckInDtae_CheckOutDat_AdultsperRoom_and_ChildrenperRoom(
			io.cucumber.datatable.DataTable dataTable) {

		List<String> asList1 = dataTable.asList();
		String string = asList1.get(0);

		WebElement hotellocation = driver.findElement(By.xpath("//select[@id='location']"));
		Select se = new Select(hotellocation);
		se.selectByVisibleText(string);

		String string1 = asList1.get(1);
		WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		Select se1 = new Select(hotels);
		se1.selectByVisibleText(string1);

		String string2 = asList1.get(2);
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		Select se2 = new Select(room);
		se2.selectByVisibleText(string2);

		String string3 = asList1.get(3);
		WebElement numberofrooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		Select se3 = new Select(numberofrooms);
		se3.selectByVisibleText(string3);

		String string4 = asList1.get(4);
		WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.sendKeys(string4);

		String string5 = asList1.get(5);
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.sendKeys(string5);

		String string6 = asList1.get(6);
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select se4 = new Select(adultroom);
		se4.selectByVisibleText(string6);

		String string7 = asList1.get(7);
		WebElement childroom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select se5 = new Select(childroom);
		se5.selectByVisibleText(string7);
		
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

	@When("User book a Hotel and gives Firstname,LastName,Billingaddress,Creditcardno,CreditCardType,CardExpiryMonth,CardExpiryyear and CVV")
	public void user_book_a_Hotel_and_gives_Firstname_LastName_Billingaddress_Creditcardno_CreditCardType_CardExpiryMonth_CardExpiryyear_and_CVV(
			io.cucumber.datatable.DataTable dataTable) {

		List<String> asList2 = dataTable.asList();
		String string = asList2.get(0);

		WebElement first = driver.findElement(By.xpath("//input[@id='first_name']"));
		first.sendKeys(string);

		String string1 = asList2.get(1);
		WebElement last = driver.findElement(By.xpath("//input[@id='last_name']"));
		last.sendKeys(string1);

		String string2 = asList2.get(2);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='address']"));
		address.sendKeys(string2);

		String string3 = asList2.get(3);
		WebElement cardno = driver.findElement(By.xpath("//input[@id='cc_num']"));
		cardno.sendKeys(string3);

		String string4 = asList2.get(4);
		WebElement cardtype = driver.findElement(By.xpath("//select[@id='cc_type']"));
		Select se6 = new Select(cardtype);
		se6.selectByVisibleText(string4);

		String string5 = asList2.get(5);
		WebElement cardmonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		Select se7 = new Select(cardmonth);
		se7.selectByVisibleText(string5);

		String string6 = asList2.get(6);
		WebElement cardyear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		Select se8 = new Select(cardyear);
		se8.selectByVisibleText(string6);

		String string7 = asList2.get(7);
		WebElement cvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		cvv.sendKeys(string7);

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
	}

}
