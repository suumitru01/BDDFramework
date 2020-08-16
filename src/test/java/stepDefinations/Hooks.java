package stepDefinations;



import cucumber.Options.Base;
import io.cucumber.java.After;


public class Hooks extends Base
	{
	@After("@SelTest")
	public void afterSelTest() 
		{
		driver.close();
		}
	}
