public class IfConditionConstExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* int a=5;
		int b=10;
		if (a >10)
			System.out.println(a + " is greater than " + b);
		else 
			System.out.println(b + " is greater than " + a);
			
	} 
		
		int a=12;
		if(a>=10)
		{
		if(a<=20)
		System.out.println("value of a is in range: 10 to 20");
		} */
		int month = 4;
		String season;
		if(month==12||month==1||month==2)
			season = "Winter";
		else if(month==3||month == 4|| month == 5)
			season = "Spring";
		else
			season = "bougus one Ahhhh";
		System.out.println("April is the : " + season);
	}
}
