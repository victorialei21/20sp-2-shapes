
public class Circle extends Shape {

	private double circRadius;
	
	Circle(ShapeDescription description) {
		super(description);
		circRadius = description.getDoubles().elementAt(0);
	}

	@Override
	public double getArea() {
		double circArea = (this.circRadius)*(this.circRadius)*(Math.PI);
		return circArea;
	}

	@Override
	public double getPerimeter() {
		double circPerim = 2*(Math.PI)*(this.circRadius);
		return circPerim;
	}

}
