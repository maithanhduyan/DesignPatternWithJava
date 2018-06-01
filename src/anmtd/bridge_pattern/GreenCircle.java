package anmtd.bridge_pattern;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {
		System.out.println("Drawing Cicle[ color: green, radius: " + radius + ", x: " + x + ", y: " + y + " ]");
	}

}
