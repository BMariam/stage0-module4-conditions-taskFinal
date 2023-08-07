package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
		if (0 == divider) {
			System.out.println("division by zero");
		} else {
			int result = dividend / divider;
			if (dividend == divider * result) {
				System.out.println("can be divided completely");
			} else {
				System.out.println("cannot be divided completely");
			}
		}
    }
}
