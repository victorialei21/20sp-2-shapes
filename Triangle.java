
public class Triangle extends Shape {

	private double sideA;
	private double sideB;
	private double sideC;
	
	Triangle(ShapeDescription description) {
		super(description);
		sideA = description.getDoubles().elementAt(0);
		sideB = description.getDoubles().elementAt(1);
		sideC = description.getDoubles().elementAt(2);

	}

	@Override
	public double getArea() {
		double semi = this.getPerimeter()/2;
		double triArea = Math.sqrt(semi*(semi - sideA)*(semi - sideB)*(semi - sideC));
		return triArea;
	}

	@Override
	public double getPerimeter() {
		double triPerim = this.sideA + this.sideB + this.sideC;
		return triPerim;
	}

}
