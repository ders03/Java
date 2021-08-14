import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	String operation;
	double x, y;
	System.out.print("Please select an operation { (A)ddition}; (S)ubtraction; (M)ultiplication; (D)ivision; (Q)uit: ");
	operation = inp.nextLine();
	if (operation.matches("a|s|m|d|A|S|M|D")) {
		System.out.print("Enter the first operand: ");
		x = inp.nextDouble();
		System.out.print("Enter the second operand: ");
		y = inp.nextDouble();
		if (operation.equalsIgnoreCase("A")) {
		    add(x, y);
		}
		else if (operation.equalsIgnoreCase("S")) {
		    subtract(x, y);
		}
		else if (operation.equalsIgnoreCase("M")) {
		    multiply(x, y);
		}
		else if (operation.equalsIgnoreCase("D")) {
		    divide(x, y);
		}
	}
	else if (operation.equalsIgnoreCase("Q")) {
	    System.out.println("Goodbye...");
	}
	else {
	    System.out.println("Invalid input");
	}
	
    }

    public static void add(double x, double y) {
	System.out.println(x + " + " + y + " = " + (x + y));
    }

    public static void subtract(double x, double y) {
	System.out.println(x + " - " + y + " = " + (x - y));
    }

    public static void multiply(double x, double y) {
	System.out.println(x + " * " + y + " = " + (x * y));
    }

    public static void divide(double x, double y) {
	System.out.println(x + " / " + y + " = " + (x / y));
    }

}
