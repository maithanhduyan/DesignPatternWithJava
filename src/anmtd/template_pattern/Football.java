package anmtd.template_pattern;

public class Football extends Game{

	@Override
	void initialize() {
		System.out.println("Football Game Initialize ! Start playing.");
	}

	@Override
	void startPlay() {
		System.out.println("Football Game started. Enjoy the game.");
	}

	@Override
	void endPlay() {
		System.out.println("Football Game finished!");
	}

}
