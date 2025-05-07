package calci;

import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		System.out.println("Calci");
		Scanner sc = new Scanner(System.in);
		calculator(sc);

	}

	public static void calculator(Scanner sc) {
		
		while (true) {
			System.out.println("for adding enter 1");
			System.out.println("for subtracting enter 2");
			System.out.println("for multiple enter 3");
			System.out.println("for divide enter 4");
			System.out.println("Exit");
			String m = sc.next();
			if (m.equals("Exit")) {
				System.out.println("Terminated");
				break;
			}
			int n = Integer.parseInt(m);
//			if ((n > 4) || (n <= 0)) {
//				System.out.println("Pls enter again(1-4)");
//				calculator(sc);
//			}
			while (true) {
				int result;
				System.out.println("do you want to exit ");
				String c = sc.next();
				boolean decision = true;
				switch (c) {
				case "yes":
					decision = false;
					break;
				case "no":
					decision = true;
					break;
				default:
					System.out.println("Pls enter again");
					break;
				}
				try {
				if (decision == false) {
//					calculator(sc);
					break;
				} 
				else if(decision == true) {
					
					if (n == 1) {
						System.out.println("Enter total numbers");
						int a = sc.nextInt();
						System.out.println("The Total is " + add(a, sc));
						;
//				System.out.println("Two Numbers are added and the result is " + result);
					} else if (n == 2) {

						System.out.println("Enter two numbers");

						int a = sc.nextInt();
						int b = sc.nextInt();
						System.out.println(sub(a, b));
//						System.out.println("Two Numbers are subtracted and the result is " + result);
					} else if (n == 3) {

						System.out.println("Enter total numbers");
						double a = sc.nextDouble();
//						double b = sc.nextDouble();
						System.out.println("Multiple of all the numbers are " + multi(a, sc));
//						System.out.println("Two Numbers are multipled and the result is " + result);
					} else if (n == 4) {

						System.out.println("Enter two numbers");
						double a = sc.nextDouble();
						double b = sc.nextDouble();
						System.out.println(divide(a, b));

//						System.out.println("Two Numbers are divided and the result is " + result);
					} else {
						System.out.println("Invalid");
					}
				}
				else {
					System.out.println("Invalid");
					break;
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}

		}

	}

	public static int add(int a, Scanner sc) {
//		System.out.println(a + b);
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			System.out.println("Enter a number " + i + ":");
			int c = sc.nextInt();
			sum += c;
		}
		return sum;
	}

	public static int sub(int a, int b) {
//		System.out.println(a - b);
		int sum = a - b;
		return sum;
	}

	public static double multi(double a, Scanner sc) {
//		System.out.printf(a+b);
		double sum = 1;
		for (int i = 1; i <= a; i++) {
			System.out.println("Enter a number " + i + ":");
			double s = sc.nextInt();
			sum = sum * s;

		}
		return sum;
	}

	public static double divide(double a, double b) {
		double sum = a / b;
		return sum;
	}
	public void ss(Scanner sc)
	{
		calculator(sc);
	}
}
