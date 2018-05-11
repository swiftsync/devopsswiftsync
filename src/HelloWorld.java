import java.util.Date;

publi class HelloWorld
{
	public static void main(String[] args) 
	{
		 System.out.println(getLocalCurrentDate());
	}
	private static Date getLocalCurrentDate()
	{
		return new Date();	
	}
}