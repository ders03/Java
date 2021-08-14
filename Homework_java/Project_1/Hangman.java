// Input handling can accept any character and is case sensitive, this is done to allow changes to RandomWord wordbank
// and this program will still function. if (Character.isLetter(inp.nextline().charAt(0)) {//} would validate if letter.
import java.util.Scanner;
public class Hangman {

  private static final boolean testingMode = true;
  static int guessesRemaining = 0;
  static int spaces = 0;
  static char difficulty = ' ';
  static String toSolve = RandomWord.newWord();
  static boolean solved = false;

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    char[] display = new char[toSolve.length()];
    String guessOrSolve = "";
    char guess = ' ';
    String guessIndex = "";
    boolean continuePlaying = true;
    boolean phaseOne = false; // trigger for print logic
    //set display to ---- with proper length
    formatDisplay(display);
    while (continuePlaying) {
      // get difficulty from user and set up difficulty parameters
      if (difficulty != 'e' && difficulty != 'i' && difficulty != 'h' && guessesRemaining == 0) {
        System.out.print("Enter your difficulty: Easy (e), Intermediate (i), or Hard (h)\n");
        try {
          difficulty = inp.nextLine().charAt(0);
          setDifficulty(difficulty);
        }
        catch (Exception e) {
          System.out.println("Invalid difficulty.   Try again...");
        }
      }
      // after difficulty has been set, implement logic controls
      else {
        // begin new game after solved by guess or guessesRemaining == 0
        if (guessesRemaining == 0 && phaseOne == true) {
          System.out.println("You have failed to guess the word...  :(");
          //System.out.println("The word was: " + toSolve);
          display = toSolve.toCharArray();
        }
        // best way to compare char array and String so far, check values with no for loop
        if (String.valueOf(display).equals(toSolve)) {
          if (guessesRemaining != 0) {
            System.out.println("You have guessed the word!  Congratulations");
          }
          System.out.println("Would you like to play again? Yes(y) or No(n)");
          guessOrSolve = inp.nextLine();
          if (guessOrSolve.charAt(0) == 'n') {
            System.out.println("Goodbye...");
            continuePlaying = false;
            break;
          }
          else if (guessOrSolve.charAt(0) == 'y') {
            toSolve = RandomWord.newWord();
            display = new char[toSolve.length()];
            formatDisplay(display);
            guessOrSolve = "";
            difficulty = ' ';
            guessesRemaining = 0;
            phaseOne = false;
            continue;
          }
          else {
            System.out.println("Your input is not valid.   Try again.");
          }

        }
        // print display depending on if testing or guessing
        if (testingMode == true && phaseOne == false) {
          System.out.print("The secret word is: ");
          System.out.println(toSolve);
        }
        if (phaseOne == false) {
          System.out.print("The word is: ");
          System.out.println(display);
        }
        // begin taking guess input, check if complete solve is attempted
        System.out.print("Please enter the letter you want to guess: ");
        try {
          guessOrSolve = inp.nextLine();
          if (guessOrSolve.equals("solve")) {
            System.out.print("Please solve the word: ");
            guessOrSolve = inp.nextLine();
            checkSolve(guessOrSolve, display);
            guessesRemaining -= 1;
            if (solved) {
              System.out.println("Would you like to play again? Yes(y) or No(n)");
              guessOrSolve = inp.nextLine();
              if (guessOrSolve.charAt(0) == 'n') {
                System.out.println("Goodbye...");
                continuePlaying = false;
                break;
              }
              else if (guessOrSolve.charAt(0) == 'y') {
                toSolve = RandomWord.newWord();
                display = new char[toSolve.length()];
                formatDisplay(display);
                guessOrSolve = "";
                difficulty = ' ';
                guessesRemaining = 0;
                phaseOne = false;
                continue;
              }
              else {
                System.out.println("Your input is not valid.   Try again.");
              }
            }
            else {
              guessOrSolve = "";
              phaseOne = true;
              continue;
            }
          }
          // this sets guess to be put into check logic, default state, isLetter() validation goes here if want
          else {
            guess = guessOrSolve.charAt(0);
          }
        }
        catch (Exception e) {
          System.out.println("Your input is not valid.   Try again.");
          continue;
        }
        // guess route has been taken
        // take guessIndex input and check guess
        if (guessIndex.length() != spaces && guess != ' ') {
          phaseOne = true; // prevent multiple printouts by switching off phase 0
          System.out.print("Please enter the spaces you want to check (seperated by spaces): \n");
          guessIndex = inp.useDelimiter(" ").nextLine(); // take white space in input string
          // validate input, I chose to allow any index input to be checked as long as the correct number of spaces are specified
          if (guessIndex.split(" ").length != spaces) {
            System.out.println("Your input is not valid.   Try again.");
            guessIndex = ""; // reset guessIndex to properly reenter loop
	        }
          // check validated input
          else {
            try {
                checkGuess(guess, guessIndex, display);
                guessIndex = "";  // reset guessIndex to properly reenter loop
            }
	          catch (Exception e) {
	             System.out.println("Your input is not valid.   Try again.");
	              guessIndex = "";
            }
          }
        }
      }
    }
  }

  // phase 0 - take validated input and sort it
  static void setDifficulty(char difficulty) {

    if (difficulty == 'e') {
      guessesRemaining = 15;
      spaces = 4;
    }
    else if (difficulty == 'i') {
      guessesRemaining = 12;
      spaces = 3;
    }
    else if (difficulty == 'h') {
      guessesRemaining = 10;
      spaces = 2;
    }
    else {
      difficulty = ' ';
      System.out.println("Invalid difficulty.   Try Again...");
    }
  }

  // phase 0 - this sets the display object to "----", it is initialized to the proper size
  static void formatDisplay(char[] display){

    for (int i = 0; i < display.length; i++) {
      display[i] = '-';
    }
  }

  /* phase 1 -
  split guessIndex string to array of int strings
    validate guessIndex values within string bounds
      loop through toSolve string checking string.charAt() values for guess match
        update display object and pass args to print statement
  print statement
  */
  static void checkGuess(char guess, String guessIndex, char[] display) {
    // local variables for local logic
    String[] guessIndexFormat = guessIndex.split(" ");
    boolean match = false; // trigger to pass args to end print statment
    for (String s: guessIndexFormat) {
      int check = Integer.parseInt(s); // pull int value from string
      if (check < toSolve.length()) {
        if (toSolve.charAt(check) == guess && display[check] == '-') {
          match = true;
          display[check] = guess;
        }
        else if (display[check] == (toSolve.charAt(check))) {
          match = true;
          continue;
        }
        else if (toSolve.charAt(check) == guess && display[check] != '-') {
          guessesRemaining -= 1;
        }
      }
    }
    if (match == true) {
      System.out.println("Your guess is in the word!");
      System.out.print("The updated word is: ");
      System.out.println(display);
      System.out.println("Guesses Remaining: " + guessesRemaining);
    }
    else {
      guessesRemaining -= 1;
      System.out.println("Your letter was not found in the spaces you provided.");
      System.out.println("Guesses Remaining: " + guessesRemaining);
      //System.out.print("The word is: ");
      //System.out.println(display);
    }
  }
  // check if string value of solve attempt equals toSolve, decrement guesses, print result of check
  static void checkSolve(String guessOrSolve,char[] display) {

    guessesRemaining -= 1;
    if (guessOrSolve.equals(toSolve)) {
      System.out.println("You win!");
      System.out.println("You have guessed the word!  Congratulations");
      solved = true;
    }
    else {
      System.out.println("Your guess to solve was incorrect");
      System.out.print("The word is: ");
      System.out.println(display);
      System.out.println("Guesses Remaining: " + guessesRemaining);
    }
  }
}
