import java.util.Scanner;

public class MultiProjMain {
	private MultipleProj multiarray[];
	private Scanner sc;
	private int projectDetails;
	
	public void takeDetails()
	{
		int count=0;
		sc=new Scanner(System.in);
		
		System.out.println("Enter the project details number here: ");
		
		projectDetails=sc.nextInt();
		multiarray=new MultipleProj[projectDetails];
		while(count<projectDetails)
		{
			MultipleProj m1=new MultipleProj();
			m1.writeLine();
			multiarray[count]=m1;
			count++;
		}
	}
	public void displayDetails()
	{
		for(MultipleProj m:multiarray)
		{
			m.showAll();
		}
	}
	public static void main(String ar[])
	{
		MultiProjMain mulmain=new MultiProjMain();
		mulmain.takeDetails();
		mulmain.displayDetails();
	}
	
}
