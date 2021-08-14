import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
	int counter = 0;
	String s;
	Scanner inp = new Scanner(System.in);
	System.out.println("Input a string: ");
	s = inp.nextLine();
	for (char c: s.toCharArray()) {
	    if (c >= 'a' && c <= 'z') {
		counter += 1;
	    }
	}
	System.out.println("There are " + counter + " lowercase in " + s);
    }
}
