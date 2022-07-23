package com.qashapesbridgeattempt.shapes;

import com.qashapesbridgeattempt.shapes.myshapes.Circle;
import com.qashapesbridgeattempt.shapes.myshapes.Square;
import com.qashapesbridgeattempt.shapes.shapepainter.PaintBlue;
import com.qashapesbridgeattempt.shapes.shapepainter.PaintRed;

public class Runner {

	public static void main(String[] args) {
	   
		Shape circle = new Circle(); // Making a new circle shape
		circle.setColour(new PaintRed()); // Setting colour to red
		circle.makeShape(); //using the make shape method to print the shape
		circle.paintShape(); //using the paintshape method to paint the shape
		
		
		Shape circle2 = new Circle(); //Same process, but making sure blue implementation works
		circle2.setColour(new PaintBlue());
		circle2.makeShape();
		circle2.paintShape();
		
		Square square = new Square(); //Same process, for square blue
		square.setColour(new PaintBlue());
		square.makeShape();
		square.paintShape();
		
		Square square2 = new Square();//Same process, for square red
		square2.setColour(new PaintRed());
		square2.makeShape();
		square2.paintShape();
	

	}

}
