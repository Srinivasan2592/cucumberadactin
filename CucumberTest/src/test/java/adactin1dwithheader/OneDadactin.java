package adactin1dwithheader;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OneDadactin {
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
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> map = asMaps.get(1);
		// List<List<String>> asLists = dataTable.asLists();
//		List<String> list = asLists.get(0);
//		String string = list.get(1);
		String string = map.get("username");
		System.out.println(string);
		driver.findElement(By.id("username")).sendKeys(string);

//		List<String> list2 = asLists.get(1);
//		String string2 = list2.get(1);
		Map<String, String> map2 = asMaps.get(1);
		String string2 = map2.get("password");
		System.out.println(string2);
		driver.findElement(By.id("password")).sendKeys(string2);

	}

	@When("User clicking on Login Btn")
	public void user_clicking_on_Login_Btn() {

		WebElement btnlogin = driver.findElement(By.id("login"));
		btnlogin.click();
	}

	@Then("User successfully logged into the homepage")
	public void user_successfully_logged_into_the_homepage() {
		driver.quit();

	}

}
