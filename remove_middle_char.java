//Given an array a, b, c  remove the middle element. Give cases for even, odd,
//and input control

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
	ArrayList<String> z = new ArrayList<String>();
	z.add("one");
	z.add("two");
	z.add("three");
	int mid = z.size()/2;
	z.remove(mid);
	System.out.println(z);

    }
}
