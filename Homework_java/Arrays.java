public class Arrays {
  public static void main(String[] args) {
	   int[] inp1 = {1, 2, 3};
	   int[] inp2 = {2, 9};
     int[] result = new int[inp1.length];
     int counter = inp2.length;
     int counter2 = inp1.length;
     while (counter > 0) {
       counter -=1;
       counter2 -= 1;
       result[counter2] = inp1[counter2] + inp2[counter];
     }
     while (counter2 > 0 && counter == 0) {
       counter2 -=1;
       result[counter2] = inp1[counter2];
     }
     for (int i: result) {
       System.out.println(i);
     }
   }
 }
