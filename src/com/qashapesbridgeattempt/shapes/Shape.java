package com.qashapesbridgeattempt.shapes;

import com.qashapesbridgeattempt.shapes.shapepainter.shapePainter;

public abstract class Shape {
	
	protected shapePainter colour;
	
	
	public shapePainter getColour() {
		return colour;
	}

	public void setColour(shapePainter colour) {
		this.colour = colour;
	}

	abstract public void paintShape();
	
	abstract public void makeShape();

}
