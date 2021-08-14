//*******************************************************
// Circle.java
// Anders Krig 20JAN2021
// fam for access modifiers, instance vars, method types, calling a method in a method,
// and accessor/mutator methods
// ACADEMIC HONESTY: I affirm that I have not given or received any unauthorized help on this assignment, and that this work is my own. Anders P Krig
//*******************************************************
public class Circle {


    private double r;            // declare the private double instance  radius
    private double x;            // declare the private double instance  x
    private double y;            // declare the private double instance  y


	//----------------------------------------------
	// getX - returns the value of x
	//----------------------------------------------
	public double getCenter_x() {
	    return x;

	}

	//----------------------------------------------
	// getY - returns the value of y
	//----------------------------------------------
	public double getCenter_y() {
	    return y;

	}

	//----------------------------------------------
	// getRadius - returns the value of radius
	//----------------------------------------------
	public double getRadius() {
	    return r;

	}

	//----------------------------------------------
	// setX - assigns a new value to x
	//----------------------------------------------
	public void setCenter_x(double i) {
	    x = i;

	}

	//----------------------------------------------
	// setY - assigns a new value to y
	//----------------------------------------------
	public void setCenter_y(double j) {
	    y = j;

	}

	//----------------------------------------------
	// setRadius - assigns a new value to radius
	//----------------------------------------------
	public void setRadius(double k) {
	    if (k >= 0) {
				r = k;

	    }

	}

	//--------------------------------------------------------
	// diameter - calculates the diameter of the circle
	//--------------------------------------------------------
	public double diameter() {
	    return 2 * r;

	}

	//--------------------------------------------------------
	// area - returns the area of the circle
	//--------------------------------------------------------
  public double area() {
	    return Math.PI * Math.pow(r, 2);

	}

	//--------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	//--------------------------------------------------------
	public double perimeter() {
	    return 2 * Math.PI * r;

	}

	//--------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	//                is 1 and its center is (0,0) and false
	//      	      otherwise.
	//--------------------------------------------------------
	public boolean isUnitCircle() {
	    if ( this.r == 1 && this.x == 0 && this.y == 0) {
				return true;

	    }
	    else {
				return false;

	    }
	}

	//--------------------------------------------------------
	// toString - return a String representation of
	//            this circle in the following format:
	//            center:(x,y)
	//            radius: r
	//--------------------------------------------------------
	public String toString() {
	    return "center: (" + x + "," + y + ")\n" + "radius: " + r + "\n";

	}

        // equals - return true if r and center of two circles same
  public boolean equals(Circle anotherCircle) {
	    return this.getCenter_x() == anotherCircle.getCenter_x() && this.getCenter_y() == anotherCircle.getCenter_y() && this.getRadius() == anotherCircle.getRadius();
	}

        // isConcentric - returns true if centers of two circles are same
  public boolean isConcentric(Circle anotherCircle) {
	    if (this.getCenter_x() == anotherCircle.getCenter_x() && this.getCenter_y() == anotherCircle.getCenter_y() && this.getRadius() != anotherCircle.getRadius()) {
				return true;
	    }
	    else {
				return false;
	    }
    }

        // distance - returns distance between two circle centers
  public double distance(Circle anotherCircle ) {
	    return Math.sqrt(Math.pow(this.getCenter_x() - anotherCircle.getCenter_x(), 2)
			     + Math.pow(this.getCenter_y() - anotherCircle.getCenter_y(), 2));
	}

        // intersects - return true if circle and another have intersection
  public boolean intersects(Circle anotherCircle) {
	    if (this.distance(anotherCircle) < this.getRadius() + anotherCircle.getRadius()) {
				return true;
	    }
	    else {
				return false;

			}
  	}
}
