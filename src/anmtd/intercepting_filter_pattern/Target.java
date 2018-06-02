package anmtd.intercepting_filter_pattern;

public class Target {
	
	public void execute(String request) {
		System.out.println("Executing request: " + request);
	}
}