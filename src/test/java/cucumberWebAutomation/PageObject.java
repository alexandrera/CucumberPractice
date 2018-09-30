package cucumberWebAutomation;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

	// static int timestamp1 = (int) ((new Date().getTime() / 1000) - 2000);
	public static final String url = "http://www.automationpractice.com";
	public static final String pathProperty = "C:/chromedriver.exe";
	public static final String userEmail = "userfortest@nonexistingmailprovider.com";
	public static final String userPassword = "loremipsumdolor";
	public static final String defaultAddress = "Nice Avenue, 10955, Umbrella Corporation, third floor";
	public static final String defaultPostalCode = "10955";

	public static void waitALittle() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static WebElement SignInHome(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//header[@id='header']//nav//a[@title='Log in to your customer account']")));

		return element;
	}

	public static WebElement SignInButton(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='SubmitLogin']/span")));

		return element;
	}

	public static WebElement EmailField(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));

		return element;
	}

	public static WebElement PasswordField(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("passwd")));

		return element;
	}

	public static WebElement SearchField(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='search_query_top']")));

		return element;
	}

	public static WebElement SearchButtonAction(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form[@id='searchbox']/button[@name='submit_search']")));

		return element;
	}

	public static WebElement MoreButton(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='center_column']/ul//div[@class='product-container']//a[@title='View']/span[.='More']")));

		return element;
	}

	public static WebElement MouseOverProduct(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='center_column']/ul//div[@class='product-container']//div[@class='product-image-container']/a[@title='Printed Dress']/img[@alt='Printed Dress']")));

		return element;
	}

	public static WebElement AddToCartButton(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")));

		return element;
	}

	public static WebElement ProceedToCheckoutButton(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")));

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnSummary(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[@id='center_column']//a[@title='Proceed to checkout']/span")));
		// div[@id='center_column']/form[@action='http://automationpractice.com/index.php?controller=order']//button/span

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnAddress(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='center_column']/form[@action='http://automationpractice.com/index.php?controller=order']//button/span")));
		// form[@id='form']//button[@name='processCarrier']/span
		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnShipping(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//form[@id='form']//button[@name='processCarrier']/span")));

		return element;
	}

	public static WebElement ProceedToCheckoutButtonOnPayment(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("(.//*[normalize-space(text()) and normalize-space(.)='(Read the Terms of Service)'])[1]/following::span[1]")));

		return element;
	}

	public static WebElement AgreeToTermsCheckbox(WebDriver driver) {

		waitALittle();

		WebElement element = driver.findElement(By.xpath("/html//input[@id='cgv']"));

		return element;
	}

	public static WebElement ConfirmOrder(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='cart_navigation']//span")));

		return element;
	}

	public static WebElement SelectPayByBankWire(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("/html//div[@id='HOOK_PAYMENT']//a[@title='Pay by bank wire']")));

		return element;
	}

	public static WebElement QuantityField(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30))
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html//input[@id='quantity_wanted']")));

		return element;
	}

	public static WebElement QtySubtractButton(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("/html//table[@id='cart_summary']/tbody/tr//a[@title='Subtract']//i[@class='icon-minus']")));

		return element;
	}

	public static WebElement ShoppingCartIsEmpty(WebDriver driver) {

		waitALittle();

		WebElement element = (new WebDriverWait(driver, 30)).until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//div[@id='center_column']/p[@class='alert alert-warning']")));

		return element;
	}

}
