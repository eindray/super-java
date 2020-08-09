import java.util.*;
class Emp
{
	private Scanner sc;
	private int houseNumber;
	private String ciityName;
	private String stateName;


	public void address()
	{
		sc=new Scanner(System.in);
		System.out.println("Please Enter your House Number ");
		houseNumber=sc.nextInt();
		System.out.println("Please Enter City ");
		ciityName=sc.next();
		System.out.println("Please Enter State");
		stateName=sc.next();
		
	}
	public void display()
	{
		System.out.println("House Number  is "+houseNumber);
		System.out.println("The City Name is "+ciityName);
		System.out.println("State Name is "+stateName);
	}

}
public class Customer
{
	public static void main(String args[])
	{
		Cus e1=new Cus();
		e1.address();
		e1.display();	
	}
}