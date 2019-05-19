package POJO;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonPropertyOrder;
@JsonPropertyOrder(value =
{"message",
  "type",
  "code",
	"trace_id"
	})
public class ElementsTest implements Serializable
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private String message;
  private String type;
  private int code;
  private String trace_id;
  
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public int getCode() {
	return code;
}
public void setCode(int code) {
	this.code = code;
}
public String getTrace_id() {
	return trace_id;
}
public void setTrace_id(String trace_id) {
	this.trace_id = trace_id;
}
  
}
