public class LabeledContinueDemo {

	public static void main(String[] args) {
		Outer:
			for (int i=0; i<2; i++) {
				inner:
					for(int j=0; j<2; j++) {
						System.out.println("Innter for loop ");
						
						continue Outer;
					}
	                     System.out.println("Outer For Loop");
					}
	                     System.out.println("Loop End");
			}
			
			

	}