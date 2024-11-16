// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    // Get seed + mood
		int highestSeed = Integer.parseInt(args[0]);
		String mood = args[1];
		// calc hailstone sequence 
		for (int seed = 1; seed <= highestSeed; seed++){
			int lastRun = 0;
			int runCount = 0;
			int changedSeed = seed;
			while (lastRun<1){
				runCount = runCount + 1;
				if (mood == "v") {
					System.out.print(changedSeed + " ");
				}
				if (changedSeed%2 == 0) {
					changedSeed = changedSeed/2;
				} else {
					changedSeed = (changedSeed * 3) + 1;
				}
				if (changedSeed == 1){
					lastRun = 1;
					if (mood == "v") {
						System.out.print(1 + " " + "(" + (runCount + 1) + ")");
						System.out.println("");
					}
				}
			}
		}
		System.out.println("");
		System.out.println("Every one of the first " + highestSeed + " hailstone sequences reached 1.");

	}
}
