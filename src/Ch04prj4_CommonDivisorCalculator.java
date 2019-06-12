import java.util.Scanner;

public class Ch04prj4_CommonDivisorCalculator {

	public static void main(String[] args) {

		System.out.println("Greatest Common Divisor Finder");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		
		System.out.println("Enter First Number: ");
		int x = sc.nextInt();
		System.out.println("Enter Second Number: ");
		int y = sc.nextInt();
		
		while (choice.equalsIgnoreCase("y")) {	

			while (x != 0) {	
				
				while (y >= x) {				
					y -= x;
				}
				
				int div = x;
				x = y;
				y = div;			
			
			}
			System.out.println("Greatest Common Divisor: " + y);
			
			System.out.println("Continue? (y/n):");
			choice = sc.next();
			
			if (!choice.equalsIgnoreCase("y")) {
				System.out.println("Bye");
				break;
			}
			
			System.out.println("Enter First Number: ");
			 x = sc.nextInt();
			System.out.println("Enter Second Number: ");
			 y = sc.nextInt();
		}
		
//		System.out.println("Greatest Common Divisor: " + y);
//		
//		System.out.println("Continue? (y/n):");
//		choice = sc.next();
//		System.out.println("Bye");

	}
}


//2nd attempt
//import java.util.Scanner;
//
//public class Ch04prj4_CommonDivisorCalculator {
//
//	public static void main(String[] args) {
//
//		System.out.println("Greatest Common Divisor Finder");
//		Scanner sc = new Scanner(System.in);
//		String choice = "y";
//		
//		System.out.println("Enter First Number: ");
//		int x = sc.nextInt();
//		System.out.println("Enter Second Number: ");
//		int y = sc.nextInt();
//		
//		while (choice.equalsIgnoreCase("y")) {	
//
//			while (x != 0) {						
//				while (y >= x) {				
//					y -= x;
//				}
//			int sy = x;
//			int sx = y;
//			x = sx;
//			y = sy;
//			
//			
//			}
//			//System.out.println("Greatest Common Divisor: " + y);
//		}
//		
//		
//		System.out.println("Continue? (y/n):");
//		choice = sc.next();
//		System.out.println("Bye");
//
//	}
//}


// 1st attempt
//import java.util.Scanner;
//
//public class Ch04prj4_CommonDivisorCalculator {
//
//	public static void main(String[] args) {
//
//		System.out.println("Greatest Common Divisor Finder");
//		Scanner sc = new Scanner(System.in);
//		String choice = "y";
//
////		while (choice.equalsIgnoreCase("y")) {
////			System.out.println("Enter First Number: ");
////			int x = sc.nextInt();
////			System.out.println("Enter Second Number: ");
////			int y = sc.nextInt();
////			
////
////			for (int i = 1; x != 0; i++) {						
////				for (int c = 1; y >= x; c++) {				
////					y = y - x;
////				}
////				int sy = x;
////				int sx = y;
////				x = sx;
////				y = sy;
//				
//			}
//			System.out.println("Greatest Common Divisor: " + y);
//		}
//
//		System.out.println("Continue? (y/n):");
//		choice = sc.next();
//		System.out.println("Bye");
//
//	}
//}