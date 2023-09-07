package er001;

public class MyRectangle {
	private double width = 10;
	private double depth = 20;
	
	public MyRectangle() {
		
	}
	public MyRectangle(double width,double depth) {
		super();
		this.width = width;
		this.depth = depth;
	}
	
	void setWidth(double width) {
		this.width = width;
	}
	void setDepth(double depth) {
		this.depth=depth;
	}
	double getArea() {
		return width*depth;
	}
}
