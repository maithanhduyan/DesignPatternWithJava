package anmtd.singleton_pattern;

public class SingleObject {
	
	//create an object of SingletObject
	private static SingleObject instance = new SingleObject();
	
	//make the constructor private so that this class cannot be 
	//instantiated
	private SingleObject() {
		
	}
	
	//Get the only object available
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Hello Singleton Pattern!");
	}
}
