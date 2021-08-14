import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner inp = new Scanner(System.in);
	int counter = 0;
	String username = "AAA";
	String password = "111";
	String username_inp;
	String password_inp;
	while (counter < 5) {
	    System.out.println("Enter username");
	    username_inp = inp.nextLine();
	    if (!username_inp.equals(username)) {
		System.out.println("Invalid username");
		counter += 1; 
		if (username_inp.equals("quit")) {
			counter = 10;
		}
	    }
	    else if (username_inp.equals(username)) {
		counter = 0;
		} 
	    while (username_inp.equals(username) && counter < 5) {
		System.out.println("Enter password");
		password_inp = inp.nextLine();
		if (password.equals(password_inp)) {
		    System.out.println("Welcome user");
		    counter = 10;
		}
		else {
		    System.out.println("Invalid password");
		    counter += 1; 
		    if (password_inp.equals("quit")) {
			counter = 10;
			}
		} 
	    }
	}
    }
}
