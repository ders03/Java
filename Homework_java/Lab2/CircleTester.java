//*******************************************************
// CircleTester.java
//
//
//  A client to test the functionality of objects
//  of the class Circle
// 
//*******************************************************
public class CircleTester{
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		Circle test1 = new Circle();
		Circle test2 = new Circle();
		test1.setCenter_x(1.0);
		test1.setCenter_y(1.0);
		test1.setRadius(1);
		test2.setCenter_x(0.0);
		test2.setCenter_y(0.0);
		test2.setRadius(1);
		circle1.setCenter_x(0.0);
		circle1.setCenter_y(0.0);
		circle1.setRadius(2);
		circle2.setCenter_x(12.0);
		circle2.setCenter_y(11.0);
		circle2.setRadius(1);
		System.out.println("circle1\n"+circle1);
		System.out.println("circle2\n"+circle2);
		
		
		// If the method setRadius is implemented correctly,
		// a call to setRadius with a negative number
		// will not change the value of the circle's radius.
		//
		circle1.setRadius(-2.0); 
		
		//
		// Reset the center of circle1 (-3.0,4.0)
		//
		circle1.setCenter_x(-3.0);
		circle1.setCenter_y(4.0);
				
		// print circle1 characteristics (center and radius), use a statement similar 
		// to the previous println statements. Note that is not necessary to call
		//the method toString, why?
		// the toString method is default to the object, we overrode it to this specific string output.
		System.out.println("circle1\n" + circle1);
		
		// set the circle2 radius to 5.3
		circle2.setRadius(5.3);
		test1.setRadius(4.0);
		test2.setRadius(1.3);
		
		// print circle2 characteristics (center and radius), use a statement similar to the first and
		// second println statements
		System.out.println("circle2\n" + circle2);

		// print circle2, circle1, and test1 diameter area and perimeter, values validated manually
		System.out.println("circle1 diameter: " + circle1.diameter() + ", area: " + circle1.area()
				   + ", perimeter: " + circle1.perimeter());
		System.out.println("test1 diameter: " + test1.diameter() + ", area: " + test1.area()
				   + ", perimeter: " + test1.perimeter());
		System.out.println("circle2 diameter: " + circle2.diameter() + ", area: " + circle2.area()
				   + ", perimeter: " + circle2.perimeter() + "\n");
	   
		// display whether circle2, circle1, or test2 is a unit circle, validated by observation
		System.out.println("circle1 is a unit circle: " + circle1.isUnitCircle());
		System.out.println("test2 is a unit circle: " + test2.isUnitCircle());
		System.out.println("circle2 is a unit circle: " + circle2.isUnitCircle() + "\n");
		
		// your additional tests should be placed below here

		// getCenter() validated by observation
		System.out.println(circle1.getCenter_x());
		System.out.println(test2.getCenter_x());
		System.out.println(test1.getCenter_x());
		System.out.println(circle1.getCenter_y());
		System.out.println(test2.getCenter_y());
		System.out.println(test1.getCenter_y() + "\n");

		// getRadius() validated by observation
		System.out.println(circle1.getRadius());
		System.out.println(circle2.getRadius());
		System.out.println(test1.getRadius() + "\n");

		// equals() test validated by observation
		System.out.println("test1 equals circle2: " + test1.equals(circle2));
		System.out.println("test1 equals test1: " + test1.equals(test1));
		System.out.println("circle1 equals circle2: " + circle1.equals(circle2) + "\n");

		// isConcentric() test validated by manual calculation
		System.out.println("test1 is concentric with circle2: " + test1.isConcentric(circle2));
		System.out.println("test1 is concentric with test2: " + test1.isConcentric(test2));
		System.out.println("circle1 is concentric with circle2: " + circle1.isConcentric(circle2) + "\n");

		// distance() test validated by manual calculation
		System.out.println("the distance between test1 and test2 is: " + test1.distance(test2));
		System.out.println("the distance between test1 and circle2 is: " + test1.distance(circle2));
		System.out.println("the distance between circle1 and test2 is: " + circle1.distance(test2) + "\n");

		// intersects() test validated by manual calculation
		System.out.println("circle1 intersects with test1: " + circle1.intersects(test1));
		System.out.println("circle1 intersects with test2: " + circle1.intersects(test2));
		System.out.println("circle1 intersects with circle1: " + circle1.intersects(circle1));
				   
	} 
	
}
