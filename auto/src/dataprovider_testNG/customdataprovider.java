package dataprovider_testNG;

import org.testng.annotations.DataProvider;

public class customdataprovider {

	
	@DataProvider(name="logindataprovider")
	public Object[][] getdata(){
		Object[][] data= {{"swati@gmail.com","abs"},{"yogita@gmail.com","pqr"},{"ravi@gmail.com","ravi@12"}};
		
		return data;
	}
}
