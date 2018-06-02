package anmtd.strategy_pattern;

public class Context {
	private Strategy stategy;

	public Context(Strategy strategy) {
		this.stategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return stategy.doOperation(num1, num2);
	}

}
