//replace middle char with 5 

public class Replace {
	public static void main(String[] args) {
		String s = ""; 
		if (s.length()%2 == 0) {
			return s.substring(0, s.length/2 + 1) + "5" + s.substring(s.length/2 + 1, s.length()-1));
		} 
		else {
			return s.substring(1, s.length/2) + "5" + s.substring(s.length();
		}
	}
}
