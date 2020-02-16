import java.util.Vector;

public class FunWithShapes extends ShapeHandler {

	FunWithShapes() throws ShapeException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void convertDescriptionsToShapes() {
		shapes = new Vector<Shape>();

		for(int i = 0; i < shapeDescriptions.size(); i++) {
			if(shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.CIRCLE) {
				Circle newCirc = new Circle(shapeDescriptions.elementAt(i));
				shapes.add(newCirc);
			}
			else if(shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.SQUARE) {
				Square newSquare = new Square(shapeDescriptions.elementAt(i));
				shapes.add(newSquare);
			}
			else if(shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.TRIANGLE) {
				Triangle newTri = new Triangle(shapeDescriptions.elementAt(i));
				shapes.add(newTri);
			}
			else if(shapeDescriptions.elementAt(i).getShapeType() == ShapeDescription.ShapeTypes.RECTANGLE) {
				Rectangle newRec = new Rectangle(shapeDescriptions.elementAt(i));
				shapes.add(newRec);
			}
		}
		
	}

	@Override
	public double sumOverAreas() {
		double totalArea = 0;
		for(int i = 0; i < shapes.size(); i++) {
			totalArea += shapes.elementAt(i).getArea();	
		}
		return totalArea;
	}

	@Override
	public double sumOverPerimeters() {
		double totalPerim = 0;
		for(int i = 0; i < shapes.size(); i++) {
			totalPerim += shapes.elementAt(i).getArea();
		}
		return totalPerim;
	}
	
	public static void main(String args[]) throws ShapeException{
		
		FunWithShapes shape;
		try {
			shape = new FunWithShapes();
		} catch (ShapeException e) {
			// TODO Auto-generated catch block
			throw new ShapeException("Failed to create FunWithShapes object");
		}
		Double sumArea = shape.sumOverAreas();
		Double sumPerimeter = shape.sumOverPerimeters();
		
		System.out.println(sumArea);
		System.out.println(sumPerimeter);
	}

}
