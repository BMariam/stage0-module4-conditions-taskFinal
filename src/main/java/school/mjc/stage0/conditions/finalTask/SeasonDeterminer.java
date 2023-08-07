package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
		if (1 == monthNumber || 2 == monthNumber || 12 == monthNumber) {
			System.out.println("Winter");
		} else if (3 == monthNumber || 4 == monthNumber || 5 == monthNumber) {
			System.out.println("Spring");
		} else if (6 == monthNumber || 7 == monthNumber || 8 == monthNumber) {
			System.out.println("Summer");
		} else if (9 == monthNumber || 10 == monthNumber || 11 == monthNumber) {
			System.out.println("Fall");
		} else {
			System.out.println("Wrong month number");
		}
    }
}
