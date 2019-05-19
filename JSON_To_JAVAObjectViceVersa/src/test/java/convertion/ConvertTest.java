package convertion;

import org.testng.annotations.Test;

import POJO.ElementsTest;
import utiity.ObjectTest;

public class ConvertTest 
{
	@Test
	public void Convert()
	{
   ElementsTest ele = new ElementsTest();
   ele.setMessage("An access token is required to request this resource");
   ele.setCode(104);
   ele.setTrace_id("B7zb0a2dt1A");
   ele.setType("OAuthException");
   
   String Json=ObjectTest.ConvertJavaToJson(ele);
   System.out.println("Converted String from JavaObject to Json is "+Json);
   
   
  ElementsTest el= ObjectTest.ConvertJSonToJava(Json, ElementsTest.class);
   
	   
   System.out.println("..................................................");
   System.out.println("Converted String from Json to JavaObject is " 
	+el.getMessage() +" ," +el.getCode() +", " +el.getTrace_id() + ", " +el.getType());
   
   
}
}
