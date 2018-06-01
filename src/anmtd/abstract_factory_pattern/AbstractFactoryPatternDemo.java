package anmtd.abstract_factory_pattern;

public class AbstractFactoryPatternDemo {
	public static void main(String[] agrs) {
		// get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

		// get an object of Shape Circle
		Shape circle = shapeFactory.getShape("CIRCLE");

		// call draw() method of Shape Circle
		circle.draw();
		
		//get an object of Shape Rectangle
		Shape rectangle = shapeFactory.getShape("RECTANGLE");
		
		//call draw() method of Shape Rectangle
		rectangle.draw();
		
		//get an object of Shape Square
		Shape square = shapeFactory.getShape("SQUARE");
		
		//call draw() method of Shape SQUARE
		square.draw();
		
		//get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		
		//get an object of Color Red
		Color red = colorFactory.getColor("RED");
		
		//call fill() method of Color Red
		red.fill();
		//get an object of Color Red
		Color green = colorFactory.getColor("GREEN");
		
		//call fill() method of Color Red
		green.fill();
		
		//get an object of Color Red
		Color blue = colorFactory.getColor("BLUE");
		
		//call fill() method of Color Red
		blue.fill();
	}
}
