package stepdefinitions;

import org.junit.Assert;
import com.Driverfactory.driverfactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class accountpagesteps
{
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		driverfactory.getDriver().get("https://practice.automationtesting.in/my-account/");
       Thread.sleep(5000);
              
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) {
	 
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	 
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException  {
	 
	}

	@When("click on MyAccount")
	public void click_on_my_account() {
	 
	}

	@Then("user gets MyAccount page")
	public void user_gets_my_account_page() {
	 
	}

	
	@Given("user is on Account page")
	public void user_is_on_account_page() {
	   
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	 
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expecteTitleName) {
		}

	@Given("user is on MyAccount page")
	public void user_is_on_myaccount_page() {
	   
	}
		
	@Then("user gets MyAccount section")
	public void user_gets_myaccount_section(DataTable dataTable) {

	}
}
