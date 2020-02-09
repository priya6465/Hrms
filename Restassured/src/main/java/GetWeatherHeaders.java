import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class GetWeatherHeaders {
@Test
public void GetWeatherDetails()
{
	RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
	RequestSpecification httpRequest = RestAssured.given();
	Response response = httpRequest.get("/Hyderabad");
	
	String ResponseBody = response.getBody().asString();
	System.out.println("Response Body is: " + ResponseBody);
    
	String contentType=response.header("ContentType");
	System.out.println("Contents-Type value: " + contentType);
	
	String serverType =  response.header("Server");
	System.out.println("Server value: " + serverType);
	
	String acceptLanguage = response.header("Content-Encoding");
	System.out.println("Content-Encoding: " + acceptLanguage);
}
	
}
