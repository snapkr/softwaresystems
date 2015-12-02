package ss.week2;

public class Rectangle {
	/*@ spec_public */ private int length;
	/*@ spec_public */ private int width;
	
	//@ invariant length() >= 0;
	//@ invariant width() >= 0;
	//@ invariant area() >= 0;
	//@ invariant perimeter() >= 0;

	/**
	 * Model of an Rectangle. 
	 * @param length - the length of the rectangle.
	 * @param width - the width of the rectangle.
	 */
	//@ requires length >= 0;
	//@ requires width >= 0;
	public Rectangle(int length, int width) {
		assert length >= 0 : "Length is negative";
		assert width >= 0 : "Width is negative";
		this.length = length;
		this.width = width;
	}
	/**
	 * Returns the length.
	 */
	//@ ensures \result == this.length;
	/*@ pure */ public int length() {
		return length;
	}
	/**
	 * Returns the width.
	 */
	//@ ensures \result == this.width;
	/*@ pure */ public int width() {
		return width;
	}
	
	/**
	 * Returns the area.
	 */
	//@ ensures \result == length*width;
	/*@ pure */ public int area() {
		return length * width;
	}
	/**
	 * Return the perimeter.
	 */
	//@ ensures \result == 2*(this.length() + this.width());
	/*@ pure */ public int perimeter() {
		return 2 * (this.length() + this.width());
	}
	
}
