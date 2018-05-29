package java_example_180528;

public class Ch7_04_SuperSonicAirplaneExample {

	public static void main(String[] args) {
		Ch7_04_SuperSonicAirplane sa = new Ch7_04_SuperSonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flymod=Ch7_04_SuperSonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flymod=Ch7_04_SuperSonicAirplane.NOMAL;
		sa.fly();
		sa.land();
		

	}

}
