public class Greeting
{
	private String message;
	private int id;
	
	public Greeting()
	{
		this.message = "Hello World";
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public String getMessage()
	{
		return this.message;
	}
}