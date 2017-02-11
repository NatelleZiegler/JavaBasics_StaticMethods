import javax.swing.*;
public class Checkpoint {
	public static void main(String[] args) {
		String input;
		int number;
		
		input = JOptionPane.showInputDialog("Enter a number.");
		number = Integer.parseInt(input);
		
		if (number < 10)
			method1();
		else
			method2();
			
		System.exit(0);
		
	}
	
	public static void method1() {
		JOptionPane.showMessageDialog(null, "Able was I.");
	}
	
	public static void method2() {
		JOptionPane.showMessageDialog(null, "I saw Elba.");
	}
	
}