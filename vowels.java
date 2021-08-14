//Given vowels = ("a, e, i, o, u, y, A, E, I, O, U"), remove vowels from a string given by user input

import java.util.*;
import java.io.*;

public class Test {
    public static List<String> vowels = Arrays.asList("a", "e", "i", "o", "u", "A", "E", "I", "O", "U");

    public static String input() {
	Scanner getinp = new Scanner(System.in);
	System.out.println("Input a word: ");
	String inp = getinp.nextLine();
	return inp;
    }

    public static String replace(String i) {
	for (String s: vowels) {
	    if (i.contains(s)) {
		i = i.replaceAll(s , " ");
		return replace(i);
	    }
	}
	return i;
    }


    public static void main (String[] args) {
	//System.out.println(input());
	String i = input();
	System.out.println(replace(i));

    }

}
	    

		
	
	    
