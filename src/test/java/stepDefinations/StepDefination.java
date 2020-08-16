package stepDefinations;


import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.Options.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination extends Base {

	@Given("User is on GrrenKart home page")
	public void user_is_on_grren_kart_home_page() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		Base.getDriver();
	}

	@When("^User search for (.+) vegetable$")
    public void user_search_for_vegetable(String veg) throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(veg);
		Thread.sleep(3000);
	}

	@Then("^(.+) item will dispalyed$")
    public void item_will_dispalyed(String veg)throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(veg));
		System.out.println(driver.findElement(By.cssSelector("h4.product-name")).getText());
		Thread.sleep(3000);
	}

	@And("Added items to cart")
	public void added_items_to_cart() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//a[contains(@class,'increment')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
		Thread.sleep(1000);

	}

	@And("User proceed to checkout")
	public void user_proceed_to_checkout() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//img[contains(@class,' ')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(3000);
	}

	@Then("^(.+) item will dispalyed on cart")
	public void item_will_dispalyed_on_cart(String veg) {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(driver.findElement(By.cssSelector("p.product-name")).getText().contains(veg));
		System.out.println(driver.findElement(By.cssSelector("p.product-name")).getText());
	}
}
