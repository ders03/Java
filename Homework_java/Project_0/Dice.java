import java.util.Random;

public class Dice {
    // Using public var diceVal makes rolls easy to compare on execution, this does break encapsulation, 
    // but instructions do not allow for a getter method to be used in this class
    public int diceVal;
    private Random rn = new Random(); 
    // Init dicVal to 0 clearing previous val, assign dicVal to randrnge(1, 7), public to be executable outside class
    public void roll() {
	diceVal = 0;
	// NextInt pulls from 0 to 6, if 0 diceVal will be 1, if 6, diceVal = 7
        diceVal = rn.nextInt(7) + 1;
    }

}
