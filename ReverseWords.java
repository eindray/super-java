import java.lang.*;

public class ReverseWords {
	public static void main(String args[])
	{
		StringBuffer sbf = new StringBuffer("Geeksforgeeks!");
		System.out.println("String Buffer = " + sbf);
		
		// Here is the reverse
		
		sbf.reverse();
		System.out.println("After reverse = " + sbf);
	}
}
