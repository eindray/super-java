public class ConstructorDemo {
	
	private int x;
	
	public ConstructorDemo(int x) 
	{
		this.x=x;
	}
	
	public void add()
	{
		int res=x;
		System.out.println("Display: " + res);

	}
	
	public static void main (String args[]) {
		ConstructorDemo cdObj=new ConstructorDemo (10);
		cdObj.add();
	}

}