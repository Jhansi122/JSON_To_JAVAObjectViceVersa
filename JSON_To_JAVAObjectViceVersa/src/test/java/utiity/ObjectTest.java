package utiity;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class ObjectTest 
{
  private static ObjectMapper mapper;
  static 
  {
	mapper=new ObjectMapper();  
  }
  public static String ConvertJavaToJson(Object obj)
  {
	  String JsonMessage = null;
	try {
		JsonMessage = mapper.writeValueAsString(obj);
	} catch (JsonGenerationException e) {
		
		e.printStackTrace();
	} catch (JsonMappingException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	return JsonMessage;
	  
  }
  public static <T> T ConvertJSonToJava(String JsonString, Class<T> cls)
  {
	  T JavaObject=null;
	  try {
		JavaObject = mapper.readValue(JsonString,cls);
	} catch (JsonParseException e) {
		
		e.printStackTrace();
	} catch (JsonMappingException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	  return JavaObject;
  }
}
