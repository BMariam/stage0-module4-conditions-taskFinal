package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
		if (1 == month || 3 == month || 5 == month || 7 == month || 8 == month
				|| 10 == month || 12 == month) {
			System.out.println(31);
		} else if (4 == month || 6 == month || 9 == month || 11 == month) {
			System.out.println(30);
		} else if (2 == month) {
			if ((0 == year % 400) || (0 == year % 4 && 0 != year % 100)) {
				System.out.println(29);
			} else {
				System.out.println(28);
			}
		} else {
			System.out.println("invalid date");
		}
    }
}
