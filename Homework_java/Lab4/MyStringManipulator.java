import java.util.Scanner;

public class MyStringManipulator {

  public static void main(String[] args) {
    String operation = " ";
    char toReplace;
    char newChar;
    boolean run = true;
    StringBuilder userString = new StringBuilder();
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the string to be manipulated: ");
    userString.append(inp.nextLine());
    while (run) {
      System.out.println("Enter your command (quit, print reverse, replace all, replace single, remove) ");
      operation = inp.nextLine();
      // handle input, put functions in logic controls
      switch (operation.toLowerCase()) {
        
        case "print reverse":
          System.out.print("Your new sentence is: ");
          printReverse(userString);
          break;

        case "replace all":
          System.out.println("Enter character to replace: ");
          toReplace = inp.nextLine().charAt(0); // takes line as string, reads first char from it
          // check if toReplace is in String
          // -1 means loop completed and returned to start of string, no match
          if (userString.toString().indexOf(toReplace) != -1) {
            System.out.print("Enter new character: ");
            newChar = inp.next().charAt(0);
            replaceAll(userString, toReplace, newChar);
            System.out.println("Your new sentence is: " + userString);
            inp.nextLine(); // every time you see this, its resetting the buffer for next loop
            break;
          }
          else {
            System.out.println("The string does not contain " + toReplace);
            break;
          }

        case "remove":
          System.out.println("Enter the character to remove: ");
          toReplace = inp.nextLine().charAt(0);
          if (userString.toString().indexOf(toReplace) != -1) {
            remove(userString, toReplace);
            System.out.println("Your new sentence is: " + userString);
            break;
          }
          else {
            System.out.println("Error: The string does not contain the given character");
            break;
          }

        case "replace single":
          operation = " ";
          System.out.print("Enter the character to replace: ");
          toReplace = inp.next().charAt(0);
          if (userString.toString().indexOf(toReplace) != -1) {
            System.out.print("Enter new character: ");
            newChar = inp.next().charAt(0);
            replaceSingle(userString, toReplace, newChar);
            System.out.println("Your new sentence is: " + userString);
            inp.nextLine();
            break;
          }
          else {
            System.out.println("String does not contain " + toReplace);
            inp.nextLine();
            break;
          }

        case "quit":
          quit();
          run = false;
          break;

        default:
          System.out.println("Invalid input");

      }
    }
  }


  static void printReverse(StringBuilder userString) {
    for (int i = userString.length() - 1; i >= 0; i--) {
      System.out.print(userString.charAt(i));
    }
    System.out.println();
  }

  static String replaceAll(StringBuilder userString, char toReplace, char newChar) {
    for (int i = 0; i < userString.length(); i++) {
      if (userString.charAt(i) == toReplace) {
        userString.setCharAt(i, newChar);
      }
    }
    return userString.toString();
  }

  // while this may or may not be recursive, its a simple well known case running validated values
  // loop through and remove match, send it back through to make sure
  static String remove(StringBuilder userString, char toReplace) {
    for (int i = 0; i < userString.length(); i++) {
      if (userString.charAt(i) == toReplace) {
        userString.deleteCharAt(i);

         remove(userString, toReplace);
      }
    }
    return userString.toString();
  }

  static String replaceSingle(StringBuilder userString, char toReplace, char newChar) {
    for (int i = 0; i < userString.length(); i++) {
      if (userString.charAt(i) == toReplace) {
        userString.setCharAt(i, newChar);
        i = userString.length() + 1;
      }
    }
    return userString.toString();
  }

  static void quit() {
    System.out.println("Goodbye...");
  }
}
