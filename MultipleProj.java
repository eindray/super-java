import java.util.Scanner;

public class MultipleProj {
	private int projectCode;
	private String projectName;
	private int duration;
	private Scanner sc;
	
	public void writeLine()
	{
		sc=new Scanner(System.in);
		System.out.println("What is the project code: ");
		projectCode=sc.nextInt();
		System.out.println("Please type the project name: ");
		projectName=sc.next();
		System.out.println("What is the duration?: ");
		duration=sc.nextInt();
	}
	
	public void showAll()
	{
		System.out.println("Details are as follows ");
		System.out.println(projectCode +"  " + projectName + " "+ duration);
	}
}
