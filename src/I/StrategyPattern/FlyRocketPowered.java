package I.StrategyPattern;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("I am a flying rocket!");
	}

}
