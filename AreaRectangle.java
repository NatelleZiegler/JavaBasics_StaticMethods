import java.util.*;
public class AreaRectangle {
	public static void main(String[] args) {
		double recLength = getLength();
		double recWidth = getWidth();
		double recArea = getArea(recLength, recWidth);
		displayData(recLength, recWidth, recArea);
		
	}
	
	/**
		The getLength method asks the user to enter the rectangle's length and then returns
		that value as a double.
		
		@return length The length of the rectangle
	*/
		
	public static double getLength() {
		Scanner scan = new Scanner(System.in);
		double length;
		System.out.print("Please enter the rectangle's length: ");
		length = scan.nextDouble();
		scan.nextLine();
		
		while (length <= 0) {
			System.out.println("The value of the length must be greater than zero."); 
			System.out.print("Please enter the rectangle's length: ");
			length = scan.nextDouble();
			scan.nextLine();
		}
		
		return length;
	}
	
	/**
		The getWidth method asks the user to enter the rectangle's width and then returns
		that value as a double.
		
		@return width The width of the rectangle
	*/
		
	
	public static double getWidth() {
		Scanner scan = new Scanner(System.in);
		double width;
		System.out.print("Please enter the rectangle's width: ");
		width = scan.nextDouble();
		scan.nextLine();
		
		while (width <= 0) {
			System.out.println("The value of the width must be greater than zero.");
			System.out.print("Please enter the rectangle's length: ");
			width = scan.nextDouble();
			scan.nextLine();
		}
		
		return width;
	}
	
	/**
		The getArea method accepts the rectangle's length and width as arguments and returns the 
		rectangle's area. The area is calculated by multiplying the length by the width.
		
		@param length The length of the rectangle
		@param width The width of the rectangle		
		@return area The area of the rectangle
		
	*/
	
	public static double getArea(double length, double width) {
		double area = length * width;
		return area;
	}
	
	/**
		The displayData method accepts the rectangle's length, width, and area as arguments and
		displays them as a message onscreen.
		
		@param length The length of the rectangle
		@param width The width of the rectangle
		@param area The area of the rectangle
		
	*/
	
	public static void displayData(double length, double width, double area) {
		System.out.printf("Your rectangle has a length of %.0f, a width of %.0f and an area of %.0f.", length, width, area);
		System.out.println();
	}
	
} //close AreaRectangle class