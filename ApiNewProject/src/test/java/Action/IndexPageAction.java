package Action;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.IndexPage;
import utils.WebTestBase;

public class IndexPageAction 
{
	    WebDriver driver;
	    IndexPage indexpage;

	    public IndexPageAction(WebDriver driver) {
	        this.driver = driver;
	        indexpage = new IndexPage(driver);
	    }
	    
	    
	    public void CheckTitleClickDress()
	    {
	    	indexpage.openURL();
	    	indexpage.VerifyTitle();
	    	indexpage.ClickDressSection();
	    }
	    
	    
	    public void CheckTitleClickWomen()
	    {
	    	indexpage.openURL();
	    	indexpage.VerifyTitle();
	    	indexpage.ClickWomenSection();
	    }
	    
	    
	    public void CheckTitleClickTshirt()
	    {
	    	indexpage.openURL();
	    	indexpage.VerifyTitle();
	    	indexpage.ClickTshirtSection();
	    }
	    
	

}
