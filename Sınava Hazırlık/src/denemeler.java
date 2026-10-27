import java.util.Scanner;

public class denemeler {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("bir sayı girin");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		int sum = a+b+c;
		
		System.out.printf("sayıların toplamı: %d + %d + %d = %d" , a, b, c, sum );
		

	}

}
