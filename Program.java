import java.util.HashMap;
import java.util.Scanner;

public class Program {

	
	public static void main(String[] args) {
		
		
		Model cashMinne = new Model();
		Scanner sc = new Scanner(System.in);
		int input = 0;
								
		while (input != -2) {
			System.out.println();
			System.out.println("Input a positive number!"); 
			System.out.println("-1  for clear memory, -2 for quite ");
			input = sc.nextInt();
			if (input == -2) {
				cashMinne.clearMemory();
				System.out.println("Memory cleard");
				System.out.println("Program quites.");				
				continue;
			}else if (input == -1) {
				cashMinne.clearMemory();
				System.out.println("Memory cleard");
			} else {
				try {
					System.out.println("Result of raising 2 to the power of "+input+" is "+cashMinne.compute2Power(input));
				} catch (IllegalArgumentException e) {
					System.out.println("Invalid input!");
										
				}
				
			}
		}
		System.exit(0);
		
	}
}		
	

