
public class Square extends Shape {

	private double sqSide;

	Square(ShapeDescription description) {
		super(description);
		sqSide = description.getDoubles().elementAt(0);
		
	}

	@Override
	public double getArea() {
		double sqArea = (this.sqSide)*(this.sqSide);
		return sqArea;
	}

	@Override
	public double getPerimeter() {
		double sqPerim = (this.sqSide)*4;
		return sqPerim;
	}

}
