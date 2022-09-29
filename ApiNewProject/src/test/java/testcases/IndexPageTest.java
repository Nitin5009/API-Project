package testcases;

import static reporting.ComplexReportFactory.getTest;


import org.testng.annotations.Test;

import Action.IndexPageAction;
import Action.SignupAction;
import utils.DataProviderClass;
import utils.WebTestBase;

public class IndexPageTest extends WebTestBase {
	
	
	@Test(dataProvider= "excel", dataProviderClass = utils.DataProviderClass.class)
	public void SignIn(String emailid , String Password)
	{
		test = getTest(" Sign In");
		SignupAction  signupaction = new SignupAction(driver);
		signupaction.enterSignUpDetails(emailid ,Password);
	}
	
	

	@Test
	public void DressSection()
	{
		test = getTest("TC_Client_Storage_001");
		IndexPageAction indexpageaction = new IndexPageAction(driver);
		indexpageaction.CheckTitleClickDress();		
	}
	
	
	@Test
	public void WomenSection()
	{
		test = getTest("TC_Client_Storage_001");
		IndexPageAction indexpageaction = new IndexPageAction(driver);
		indexpageaction.CheckTitleClickWomen();		
	}
	
	@Test
	public void TShirtsSection()
	{
		test = getTest("TC_Client_Storage_001");
		IndexPageAction indexpageaction = new IndexPageAction(driver);
		indexpageaction.CheckTitleClickTshirt();		
	}
	
}	
