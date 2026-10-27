
public class Exercise3_Book {
	
	public static class Book {
		
		private String title ;
		private double price ;
	
		
		// 1. Default	constructor	(Unknown,	0)
		
		Book(){ 						// we can put "public", if we want
			
			this("Unknown");
		}
		
		
		// 2. Constructor with title
		
		public Book(String title) {
			
			this(title, 0.0);
		}
		
		
		// 3. Constructor with title and price
		
		public Book(String title , double price) {
			
			this.title = title ;
			this.price = price ;
		}
		
		// output format:
		@Override
		public String toString() {

			return String.format("Tittle: %-15s | Price: %.2f TL" , title , price);
		}
		
	}
	
	// Other solution without Constructors Chaining
	public static class Books {
		
		private String title1 ;
		private double price1 ;
		
		public Books() {
			this.title1 = "Unknown";
			this.price1 = 0.0;
		}
		
		public Books(String title) {
			this.title1 = title;
			this.price1 = 0.0;
		}
		
		public Books(String title, double price) {
			this.title1 = title;
			this.price1 = price;
		}
		
		@Override
		public String toString() {
			return String.format("Title: %-15s | Price: %.2f TL", title1, price1);
		}
		
	}
	
	
	// Main Method
	
	public static void main(String[] args) {
		
		System.out.println("--- Constructors Chaining ---\n");
		
		// For Default
		System.out.println("Default Constructor:");
		Book book1 = new Book();
		System.out.println(book1);

		// Just Title
		System.out.println("Just one parameter Constructor:");
		Book book2 = new Book("Improving OOP");
		System.out.println(book2);
		
		// Title And Price
		System.out.println("Full Parameter Constructor:");
		Book book3 = new Book("Improving" , 499.99);
		System.out.println(book3);
		
		System.out.println("\r---------- Other Method -----------");
		
		// Başlığı güncelledik, çünkü artık Chaining kullanmıyoruz
		
		
		System.out.println("\r--- Constructors (Without Chaining) ---\n");
				
		// 1. Default (Parametresiz)
		System.out.println("Default Constructor:");
		// DİKKAT: Sınıf ismini 'Books' yaptığın için nesneleri de 'Books'tanüretiyoruz.
		Books book101 = new Books();
		System.out.println(book101);

		// 2. Just Title (Sadece Başlık)
		System.out.println("Just one parameter Constructor:");
		Books book202 = new Books("Improving Objeect");
		System.out.println(book202);
				
		// 3. Title And Price (Başlık ve Fiyat)
		System.out.println("Full Parameter Constructor:");
		Books book303 = new Books("Improving Object", 499.99);
		System.out.println(book303);
		
	}
	/* output:
	 
	 --- Constructors Chaining ---

	Default Constructor:
	Tittle: Unknown         | Price: 0,00 TL
	Just one parameter Constructor:
	Tittle: Improving OOP   | Price: 0,00 TL
	Full Parameter Constructor:
	Tittle: Improving       | Price: 499,99 TL
	
	---------- Other Method -----------
	
	--- Constructors (Without Chaining) ---
	
	Default Constructor:
	Title: Unknown         | Price: 0,00 TL
	Just one parameter Constructor:
	Title: Improving Objeect | Price: 0,00 TL
	Full Parameter Constructor:
	Title: Improving Object | Price: 499,99 TL
	 */

}
