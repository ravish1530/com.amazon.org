package dataprovider_testNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
 
	@Test(dataProvider="logindataprovider",dataProviderClass=customdataprovider.class)
	public void login(String email, String pass) {
		
		System.out.println(email+"  "+pass);
	}
	
	
	
	
	/*@DataProvider(name="logindataprovider")
	public Object[][] getdata(){
		Object[][] data= {{"abs@gmail.com","abs"},{"pqr@gmail.com","pqr"},{"ravi@gmail.com","ravi@12"}};
		
		return data;
	}*/
	
}
