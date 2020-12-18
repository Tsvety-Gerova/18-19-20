package project18;

import java.util.Scanner;

public class TriangleTest extends Triangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Triangle t1 = new Triangle();
		
		System.out.println("Enter side 1: ");
		t1.setSide1(sc.nextDouble());
		System.out.println("Enter side 2: ");
		t1.setSide2(sc.nextDouble());
		System.out.println("Enter side 3: ");
		t1.setSide3(sc.nextDouble());
		
		System.out.println("Enter the color of the triangle: ");
		t1.setColor(sc.nextLine());
		
		System.out.println("Is ít filled (true or false)?");
		sc.nextLine().toString();
		if ( sc.nextLine() == "true") {
		t1.setFilled(true);		
			}else {
				t1.setFilled(false);
			}
		
		System.out.println("The area is " + t1.getArea() 
		+ ", the perimeter is " + t1.getPerimeter() + "\n" +
		t1.printTriangle());
//		+ ", the color is " + t1.getColor() 
//		+ " and isFilled is " + t1.isFilled());
//		
	}

}
