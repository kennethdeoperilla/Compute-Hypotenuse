import java.util.Scanner;


public class Main {

	public static void main(String Arg[]) {
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter Side y: ");
		y = scanner.nextDouble();	
		
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("The value of the hypotenuse is " + z);
		
		scanner.close();
	}

}

