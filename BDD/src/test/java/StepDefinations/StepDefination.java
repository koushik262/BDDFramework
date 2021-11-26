package StepDefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import reusablecomponents.ReadPropertyFile;
import uistore.SearchPageDetails;
import uistore.SigninPageDetails;
import utilities.TakeScreenShot;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.interactions.Actions;
@RunWith(Cucumber.class)
public class StepDefination extends ReadPropertyFile {
	public static Logger log=Logger.getLogger(ReadPropertyFile.class.getName());

	@Given("^Initialize browser with chrome$")
	public void initialize_browser_with_chrome() throws Throwable {
	
		
		driver = DriverInitialisation();
		log.info("Browser is successufully invoked");

	}

	@And("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_something_site(String strArg1) throws Throwable {
	
		

		driver.get(strArg1);
		log.info("Navigated successfully");

	}

	@When("^User enters (.+) and (.+) and sign in$")
	public void user_enters_and_and_sign_in(String email, String password) throws Throwable {

		SigninPageDetails s = new SigninPageDetails(driver);
		s.getEmail().sendKeys(email);

		s.getPassword().sendKeys(password);
		s.getSigninButton().click();
		log.info("Submitted successfully");
	}

	@And("^Click on search Bar$")
	public void click_on_search_bar() throws Throwable {
		SearchPageDetails s = new SearchPageDetails(driver);
		s.getSearch().click();
	}

	@And("^Enter \"([^\"]*)\" in search bar$")
	public void enter_something_in_search_bar(String strArg1) throws Throwable {

		SearchPageDetails s = new SearchPageDetails(driver);
		s.getSearch().sendKeys(strArg1);
		log.info("Searched successfully");
		
	}

	@And("^Close the driver$")
	public void close_the_driver() throws Throwable {
		TakeScreenShot r = new TakeScreenShot();
		
		try {
			r.getScreenshot("screenshots");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();

	}
	
	@Given("Click on Gift Card")
	public void click_on_gift_card() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("(//span[@class='link_text'])[3]")).click(); 
	}



	@And("^Click on wish list$")
	public void click_on_wish_list() throws Throwable {
		Thread.sleep(3000);
		

		driver.findElement(By.xpath("(//span[@class='link_text'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='swym-welcome-button']")).click();
	}

	@And("^Click on settings$")
	public void click_on_settings() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"swym-tabs-nav\"]/li[4]/a")).click();
	}

	@Then("^Enter \"([^\"]*)\" in the box$")
	public void enter_something_in_the_box(String strArg1) throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'swym-email-auth-input\']")).sendKeys(strArg1);
		Thread.sleep(3000);
	}

	@And("^click on connect$")
	public void click_on_connect() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\'swym-email-auth-button\']")).click();
	}

	@And("^click on new$")
	public void click_on_marvel() throws Throwable {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[3]/a")).click();

	}

	@Then("^Check Numberof links in the page$")
	public void check_numberof_links_in_the_page() throws Throwable {
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("The number of links is " + links.size());
		log.info("number of links displayed successfully");

	}

	@Then("^select first product in the list$")
	public void select_first_product_in_the_list() throws Throwable {

		driver.findElement(By.xpath("//*[@id=\"snize-product-4001150992472\"]/a/div/span/span[1]")).click();
		Thread.sleep(3000);
	}
	@Then("enter {string}")
	public void enter(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//*[@id=\'PostalCode\']")).sendKeys(string);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"cod-cheker\"]/button")).click();
		Thread.sleep(3000);
	}



	@And("^click on sign link in home page to land on secure sign in page$")
	public void click_on_sign_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {
		SigninPageDetails s = new SigninPageDetails(driver);
		s.getSignin().click();
	}

	@And("^click enter$")
	public void click_enter() throws Throwable {
		
		SearchPageDetails s = new SearchPageDetails(driver);
		s.getSearch().sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
	}

	@And("^verify the product price$")
	public void verify_the_product_price() throws Throwable {
		Thread.sleep(3000);
		String a = driver.findElement(By.xpath("//*[@id=\"price-field\"]/span")).getText();
		

		Assert.assertEquals(a, "Rs. 699");

	}

	@And("^check the COD availability$")
	public void check_the_cod_availability() throws Throwable {
		
		Thread.sleep(3000);

		System.out.println(driver.findElement(By.xpath("//*[@id=\"PostalCodeCheckerAvailability\"]")).getText());
		log.info("COD Availability checked successfully");
	}
	@And("^click on Rakhi$")
    public void click_on_rakhi() throws Throwable {
		driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/footer[1]/div[1]/div[2]/div[4]/ul/li[1]/a")).click();
    }

    @Then("^click on Readmore$")
    public void click_on_readmore() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"more\"]")).click();
    }

    @Then("^Navigatetohomepage$")
    public void navigatetohomepage() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"shopify-section-footer\"]/footer[1]/div[1]/div[1]/div[1]/p/a[3]")).click();
    }
    
    @Then("^click on top50$")
    public void click_on_top50() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"myheader\"]/div[1]/div/div/ul/li[6]/a")).click();
    }

    @Then("^click on moon lamp$")
    public void click_on_moon_lamp() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[1]/div[23]/div/a/div[2]/div[1]")).click();
    	Thread.sleep(3000);
    }

 
    @And("^click on Add wishlist$")
    public void click_on_add_wishlist() throws Throwable {
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("//*[@id=\"ProductSection-4648501149784\"]/div/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div/button")).click(); 
    }
    
  
    @Then("^choose ShopbyCategory and click Travel Acccessories$")
    public void choose_shopbycategory_and_click_travel_acccessories() throws Throwable {
        Actions mouse=new Actions(driver);
        mouse.moveToElement(driver.findElement(By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[9]/a"))).perform();
        driver.findElement(By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[9]/ul/li[13]/a")).click();
        
        
    }


    @And("^select key chain and add to cart$")
    public void select_key_chain_and_add_to_cart() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"CollectionAjaxContent\"]/div[1]/div[20]/div/a/div[2]/div[1]")).click();
    	driver.findElement(By.xpath("//*[@id=\"AddToCartForm-4764077457496\"]/div[4]/div/span[1]")).click();
    	driver.findElement(By.xpath("//*[@id=\"AddToCartForm-4764077457496\"]/button")).click();
    	
    	
    }
    
    
    @Then("^Click on santa gifts$")
    public void click_on_santa_gifts() throws Throwable {
    	
    	driver.findElement(By.xpath("//*[@id='myheader']/div[1]/div/div/ul/li[5]/a")).click();
      
    }

    @And("^click on santa earrings$")
    public void click_on_santa_earrings() throws Throwable {
    	driver.findElement(By.xpath("//*[@id='CollectionAjaxContent']/div[1]/div[3]/div/a/div[2]/div[1]")).click();
      
    }

    @And("^click on click here$")
    public void click_on_click_here() throws Throwable {
    	driver.findElement(By.xpath("//*[@id=\"myownreturntext\"]/a")).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
log.info("clicking on click here");
		
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		log.info("switching to child window");
		driver.close();
		driver.switchTo().window(parentId);
		log.info("switching to parent window");
    }
    
    

}