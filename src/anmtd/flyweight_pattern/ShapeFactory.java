package anmtd.flyweight_pattern;

import java.util.HashMap;

public class ShapeFactory {
	// Uncomment the compiler directive line and
	// javac *.java will compile properly
	// @SuppressWarnings("unchecked")

	@SuppressWarnings("rawtypes")
	private static final HashMap circleMap = new HashMap();

	@SuppressWarnings("unchecked")
	public static Shape getCircle(String color) {
		Circle circle = (Circle) circleMap.get(color);

		if (circle == null) {
			circle = new Circle(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color: " + color);
			System.out.println();
		}
		return circle;
	}
}
