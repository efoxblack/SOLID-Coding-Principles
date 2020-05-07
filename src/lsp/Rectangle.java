package lsp;

// Third principle of SOLID is Liskov Substitution Principle (LSP)

/*
 * This principle applies to inheritance hierarchies, specifying that you should
 * design your classes so that client dependencies can be substituted with
 * subclasses without noticing a change.
 * In that case all subclasses must operate in the same way as their base (super) classes.
 * The specific functionality of the subclass may be different but must conform to the
 * expected behavior of the super class. 
 * Our example is a typical one, a square class that derives from a rectangle class. 
 * Since squares are how they are you cannot modify the height without modifying the width.
 * If a square is used in a context where a rectangle is expected, unexpected behavior may
 * occur.
 * This problem cannot be easily fixed if we modify the setter methods in the square classes
 * in a way that the dimensions are kept equal, the methods will violate the post-conditions
 * for the rectangle setters which run on the idea that they can be set independently.
 */

public class Rectangle {
	
	private double height;
	private double width;
	
	public double area() {
		return height * width;
		
	}
	
	public void setHeight(double height) {
	}
	
	public void setWidth(double width) {
	}

}
