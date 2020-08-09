public class Calculate
{
	int num1;
	int num2;
	
	public void add()
	{
		num1 = 20;
		num2 = 30;
		int sum=num1 + num2;
		System.out.println("Result is " + sum);
		
		int mul=num1 * num2;
		System.out.println("Result is " + mul);
		
	}
	
	public static void main(String arg[])
	{
		Calculate c1;
		c1=new Calculate();
		c1.add();
		
	}
}