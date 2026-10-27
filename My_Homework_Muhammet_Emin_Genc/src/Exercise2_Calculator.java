
public class Exercise2_Calculator {
	
	
	// 1. Method
	
	public int max(int a , int b) {
		
		if (a < b) {
			return b;
		}else {
			return a;
		}
		
		// or we use it; return Math.max(a, b);
		
	}
	
	
	// 2. Method
	
	public double max(double a , double b) {
		
		if (a < b) {
			return b;
		}else {
			return a;
		}
		
		// or we use it; return Math.max(a, b);
	}
	
	
	// 3. Method 
	
	public int max(int a , int b , int c) {
		
		if (a < b) {
			if (c < b) {
				return b;
			}else {
				return c;
			}
		}else if (a < c) {
			return c ;
		}else {
			return a;
		}
		
		// or we use it; return Math.max(max(a, b) , c);
	}
	
	
	// Main Method
	
	public static void main(String[] args) {
		
		Exercise2_Calculator calc = new Exercise2_Calculator();
		
		System.out.println("--- Method Overloading ---\n");
		
		System.out.print("max(10 , 15)\t\t->" + "\t"+calc.max(10, 15) +"\nmax(5.5 , 2.3)\t\t->" + "\t" + calc.max(5.5, 2.3) + "\nmax(10 , 15 , 20)\t->\t" + calc.max(10, 15, 20) );
		
	}
	
	/* output:
	  
	  	--- Method Overloading ---
	  	
		max(10 , 15)		->	15
		max(5.5 , 2.3)		->	5.5
		max(10 , 15 , 20)	->	20


	 */
	

}
