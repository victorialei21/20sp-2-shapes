
public class Rectangle extends Shape {

	private double rectHeight;
	private double rectWidth;
	
	Rectangle(ShapeDescription description) {
		super(description);
		rectWidth = description.getDoubles().elementAt(0);
		rectHeight = description.getDoubles().elementAt(1);
	}

	@Override
	public double getArea() {
		double rectArea = (this.rectHeight)*(this.rectWidth);
		return rectArea;
	}

	@Override
	public double getPerimeter() {
		double rectPerim = (this.rectHeight*2) + (this.rectWidth*2);
		return rectPerim;
	}

}
