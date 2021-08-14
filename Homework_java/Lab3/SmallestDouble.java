import java.util.Scanner;

public class SmallestDouble {
    public static void main(String[] args) {
	findSmallestDouble();
    }

    public static void findSmallestDouble() {
	Scanner inp = new Scanner(System.in);
	int to_compare;
	int i = 1;
	double compare;
	double result;

	try {
	    System.out.print("How many doubles will be entered? ");
	    to_compare = inp.nextInt();
	    System.out.print("Enter a double: ");
	    compare = inp.nextDouble();
	    while (i < to_compare) {
		i += 1;
		System.out.print("Enter a double: ");
	        result = inp.nextDouble();
	        if (compare > result) {
	            compare = result;
	        }
	    }
	    System.out.println("The smallest double is : " + compare);
	}
	catch (Exception e) {
	    System.out.println("Invalid input");
	}
    }
}
