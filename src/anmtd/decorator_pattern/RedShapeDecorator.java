package anmtd.decorator_pattern;

public class RedShapeDecorator extends ShapeDecorator {
	
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
	}
	
	@Override 
	public void draw() {
		decoratorShape.draw();
		setRedBorder(decoratorShape);
	}

	private void setRedBorder(Shape decoratorShape) {
		System.out.println("Border Color : Red");
	}
}
