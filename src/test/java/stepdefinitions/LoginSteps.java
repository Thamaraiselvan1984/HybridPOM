package stepdefinitions;

import org.junit.Assert;
import com.Driverfactory.driverfactory;
import com.PageLayer.Loginpage;
import com.PageLayer.homepage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginSteps {
	private static String title;
	private Loginpage loginpage = new Loginpage(driverfactory.getDriver());
	private homepage homepage = new homepage(driverfactory.getDriver());
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException 
	{
		driverfactory.getDriver().get("https://www.facebook.com");
       Thread.sleep(5000);
	}
	
	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
	 title = loginpage.GetLoginPageTitle();
	 System.out.println("Login page title is:"+title);
	}
	
	@Then("page title should be {string}")
	public void page_title_should_be(String expecteTitleName) {
		String title = loginpage.GetLoginPageTitle();
		System.out.println("The Login Page Title is :" + title);
		Assert.assertTrue(title.contains(expecteTitleName));
		}
	
	@Then("forgotten password link should be displayed")
	public void forgotten_password_link_should_be_displayed() {
	    Assert.assertTrue(loginpage.isForgottenPasswordLinkExist());
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) {
	 loginpage.enterUsername(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
	 loginpage.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() throws InterruptedException  {
	 loginpage.clicklogin();
	 Thread.sleep(5000);
	}
	
	@Then("user gets the title of the home page")
	public void user_gets_the_title_of_the_home_page() {
	title = homepage.GetHomePageTitle();
	System.out.println("Title of the home page: " + title);
	}
		
	@Then("home page title should be {string}")
	public void home_page_title_should_be(String expecteTitleName) {
	
		String title = homepage.GetHomePageTitle();
		System.out.println("The home Page Title is :" + title);
		Assert.assertTrue(title.contains(expecteTitleName));
	}
}

