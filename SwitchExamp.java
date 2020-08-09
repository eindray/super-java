public class SwitchExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchExamp cast = new SwitchExamp();
		cast.num1();
		cast.num2();
	}
		public void num1()
		{
		for(int i=0; i< 6; i++)
			switch (i){
			case 0:
				System.out.println("This is i and the value is " + 1);
			break;
			
			case 1 :
			    System.out.println("This is i and the value is " + 1);
			    break;
			    
			case 2 :
			    System.out.println("This is i and the value is " + 2);
			    break;
			    
			default :
			    System.out.println("Done");
		       }
		}
		
		public void num2()
		{
			char cVal='a';
			switch(cVal){
			case 'a':
			case 'e':
			case 'i':
			case 'o':				
			case 'u':
				System.out.println("Vowles");
			break;
			default:
				System.out.println("Consonant");
			break;
			}
		}
		
		

	}

