import java.util.Scanner;

public class Summation {
    public static void main(String[] args) {
	sumIntegers();
    }
    public static void sumIntegers() {
	Scanner inp = new Scanner(System.in);
	int to_sum;
	int sum = 0;
	int i = 0;
	System.out.print("How many integers will be summed? ");
	to_sum = inp.nextInt();
	while (i < to_sum) {
	    i += 1;
	    System.out.print("Enter an integer: ");
	    sum += inp.nextInt();
	}
	System.out.println("The Summation is: " + sum);
    }
}
