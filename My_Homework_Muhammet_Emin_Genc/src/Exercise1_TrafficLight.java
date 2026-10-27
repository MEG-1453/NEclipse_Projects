import java.util.Iterator;

public class Exercise1_TrafficLight {

	public enum TrafficLight {
		
		RED , 
		GREEN ,				// or => RED , GREEN , YELLOW  
		YELLOW 
		
	}
	
	
	// create a class 
	
	public static class TrafficTest{
		
		
		// Method that does the switch-case operation
		
		public static void checkLight(TrafficLight light) {
				
			// switch-case used
			
			switch (light) {
				
				case RED :
					System.out.println("RED \t-> Stop");
					break;
				case YELLOW :	
					System.out.println("YELLOW \t-> Ready");
					break;
				case GREEN :	
					System.out.println("GREEN \t-> Go");
					break;
			}
			
		}
		
		
		// main method
		
		public static void main(String[] args) {
			
			System.out.println("--- Traffic Light (Switch - Case) ---\n");
			

			//We create an object of the TrafficTest class
			
			TrafficTest s1 = new TrafficTest();
			
			
			// We send the enum values to the test class with a loop
			
			for (TrafficLight light : TrafficLight.values()) {    //here I got the output using this, 
				s1.checkLight(light);							 // but I could also get output individually with s1.checkLight(TrafficLight.RED);
			}
			
			
			System.out.println("-----------------------------------");
			s1.checkLight(TrafficLight.RED);
			s1.checkLight(TrafficLight.GREEN);
			s1.checkLight(TrafficLight.YELLOW);
			
		}
		
		
	}
	
		/* output :
		   
	 	--- Traffic Light ---
	
		RED 	-> Stop
		GREEN 	-> Go
		YELLOW 	-> Ready
	
	    */
	
	
}
