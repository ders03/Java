public class DiceRollem {
	public static void main(String[] args) {
		// loop counter and final result vars
		int result = 0; 
		int counter = 0; 
		// Dice init
		Dice one = new Dice(); 
		Dice two = new Dice(); 
		Dice three = new Dice(); 
		Dice four = new Dice(); 
		Dice five = new Dice(); 
		// Loop 1000 times, if Dice same +1 to result, print roll num and val 
		// Print how many times dice same (result) when loop ends
		for (int i = 0; i < 1000; i++) {
			counter += 1;
			one.roll(); 
			two.roll(); 
			three.roll(); 
			four.roll(); 
			five.roll();
			// If a = b, b = c, c = d, d = e, then a = b = c = d = e, all dice same
			if (one.diceVal==two.diceVal && two.diceVal==three.diceVal && three.diceVal==four.diceVal && four.diceVal==five.diceVal) {
				result += 1;
				System.out.println("Roll number " + counter + " all dice show " + one.diceVal + ".");
			}
			
		} 
		System.out.println("A total of " + result + " tosses were the same.");
	}

}
