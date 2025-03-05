package interviewPrepByPriyanka.javaCoding;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class variablesNMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Response response = RestAssured.get("https://api.example.com/user");
		Assert.assertEquals(response.getStatusCode(), 200, "Incorrect Status Code");
		Assert.assertTrue(response.asString().contains("username"), "Username not found");

	}

}
