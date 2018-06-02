package anmtd.front_controller_pattern;

public class FrontControllerPatternDemo {
	public static void main(String[] args) {

		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
