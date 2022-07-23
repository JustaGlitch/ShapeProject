package com.qashapesbridgeattempt.shapes.myshapes;

import com.qashapesbridgeattempt.shapes.Shape;

public class Square extends Shape {
	
	

	@Override
	public void paintShape() {
		colour.Paint();
		
	}

	@Override
	public void makeShape() {
		System.out.println("Square shape was created!");
		
	}

}
