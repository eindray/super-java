public class OverloadDemo {
	private int x;
	private int y;
	private int z;
	
	public void add(int x,int y)
	{
		int result=x+y;
		System.out.println("Result is "+result);
	}
		
	public void add(int x,int y,int z)
	{
		
		int res=x+y+z;
		System.out.println("Resut is "+res);
		
	}
	
	public static void main(String arg[])
	{
		OverloadDemo o=new OverloadDemo();
		o.add(39, 89);
		o.add(79, 22,22);
	}

}
