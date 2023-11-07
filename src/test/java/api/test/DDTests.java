package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {

	@Test(priority=1,dataProvider = "Data",dataProviderClass = DataProviders.class)
	public void testPostUser(String UserID, String UserName, String LastName, String Email, String Password, String Phone) {
		
		User userpayload = new User();
		userpayload.setId(Integer.parseInt(UserID));
		userpayload.setUsername(UserName);
		userpayload.setLastname(LastName);
		userpayload.setEmail(Email);
		userpayload.setPassword(Password);
		userpayload.setPhone(Phone);
		
		Response response = UserEndPoints.createUser(userpayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	
	@Test(priority =2, dataProvider = "UserNames", dataProviderClass = DataProviders.class)
	public void deletePostUser(String UserName) {
		
		Response response = UserEndPoints.deleteUser(UserName);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
}
