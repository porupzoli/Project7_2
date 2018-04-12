package colorable.point;

import java.awt.Color;

import colorable.Colorable;

public class ColorablePoint extends Point implements Colorable{
	private Color color;
	
	public ColorablePoint(int x, int y, Color color) {
		super(x, y);
		this.color=color;
	}

	public String toString() {
		return "ColorablePoint [color=" + color + "]";
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setColor(Color color) {
		this.color=color;
		// TODO Auto-generated method stub
		
	}
	
	

}
