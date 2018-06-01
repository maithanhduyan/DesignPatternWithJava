package anmtd.decorator_pattern;

public class ShapeDecorator implements Shape {

	protected Shape decoratorShape;

	public ShapeDecorator(Shape decoratorShape) {
		this.decoratorShape = decoratorShape;
	}

	@Override
	public void draw() {
		decoratorShape.draw();
	}

}
