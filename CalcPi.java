// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Get user input 
		int numOfTerms = Integer.parseInt(args[0]);
		// calc 
		double denominator = 3;
		double finalSum = 1;
		for (int i = 0; i < numOfTerms - 1; i++) {
				if (i%2 == 0) {
					finalSum = finalSum - (1/denominator);
				} else {
					finalSum = finalSum + (1/denominator);
				}
				denominator = denominator + 2;
		}
		double piAccordingToJava = 4 * (finalSum);
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + piAccordingToJava);
	}
}
