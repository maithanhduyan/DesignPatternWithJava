package anmtd.proxy_pattern;

public class ProxyPatternDemo {
	public static void main(String[] args) {
		Image image = new ProxyImage("test_image.jpg");

		// Image will be loaded from disk
		image.display();
		System.out.println("");

		// image will not be loaded from disk
		
		image.display();
	}
}
