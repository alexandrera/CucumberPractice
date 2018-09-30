package cucumberWebAutomation;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumberWebAutomation.PageObject;

public class Stepdefs {
	public WebDriver driver;

	@Before
	public void startDriver() {
		System.setProperty("webdriver.chrome.driver", PageObject.pathProperty);
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	// Background
	@Given("^user accesses the URL Address$")
	public void access_URL_Address() {
		driver.get(PageObject.url);
	}

	@When("^correct user and password are filled$")
	public void fill_user_and_password() {
		PageObject.SignInHome(driver).click();
		PageObject.EmailField(driver).sendKeys(PageObject.userEmail);
		PageObject.PasswordField(driver).sendKeys(PageObject.userPassword);
		// throw new PendingException();

	}

	@Then("^it is possible to perform login")
	public void perform_login() {
		PageObject.SignInButton(driver).click();
		// throw new PendingException();

	}

	// Scenario 1
	@Given("^user searches a specific product$")
	public void user_searches_a_specific_product() {
		PageObject.SearchField(driver).sendKeys("pink");
		PageObject.SearchField(driver).sendKeys(Keys.ENTER);
	}

	@When("^open product details$")
	public void open_product_details() {

		// Mouse over element
		Actions action = new Actions(driver);
		WebElement we = PageObject.MouseOverProduct(driver);
		action.moveToElement(we).build().perform();
		PageObject.MoreButton(driver).click();

	}

	@And("^add \"(.*)\" product to cart$")
	public void add_product_to_cart(String quantity) {
		PageObject.QuantityField(driver).clear();
		PageObject.QuantityField(driver).sendKeys(quantity);
		PageObject.AddToCartButton(driver).click();
	}

	@Then("^it is possible to pay it by using bank-wire payment \"(.*)\"")
	public void pay_by_using_bankwire(String answer) {
		// Proceed to checkout
		PageObject.ProceedToCheckoutButton(driver).click();
		PageObject.ProceedToCheckoutButtonOnSummary(driver).click();
		PageObject.ProceedToCheckoutButtonOnAddress(driver).click();
		PageObject.AgreeToTermsCheckbox(driver).click();
		PageObject.ProceedToCheckoutButtonOnShipping(driver).click();

		// Used bank-wire payment since the option to use credit card is not available
		PageObject.SelectPayByBankWire(driver).click();
		PageObject.ConfirmOrder(driver).click();
		System.out.println(answer);
	}

	// Scenario 2
	@And("^add one product to cart$")
	public void add_one_product_to_cart() {
		PageObject.AddToCartButton(driver).click();
	}

	@Then("^remove product from cart$")
	public void remove_product_from_cart() {
		PageObject.ProceedToCheckoutButton(driver).click();
		PageObject.QtySubtractButton(driver).click();
		PageObject.ShoppingCartIsEmpty(driver).getText().equals("Your shopping cart is empty.");
	}

	@After
	public void closeDriver() {
		driver.close();
	}

}