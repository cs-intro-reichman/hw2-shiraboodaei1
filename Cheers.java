// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Get user input
            String cheerWord = args[0].toUpperCase();
            int numOfPrints = Integer.parseInt(args[1]);
            // Define anLetters 
            String anLetters = "AEFHILMNORSX";
            // Set conditions
            for (int i = 0; i < cheerWord.length(); i++) {
                if (anLetters.indexOf(cheerWord.charAt(i)) >= 0){
                        System.out.println("Give me an " + cheerWord.charAt(i) + ": " + cheerWord.charAt(i) + "!");
                } else {
                        System.out.println("Give me a " + cheerWord.charAt(i) + ": " + cheerWord.charAt(i) + "!");
                }
            }
            System.out.println("What does that spell?");
            for (int i = 0; i < numOfPrints; i++) {
                System.out.println(cheerWord + "!!!");
            }
        }
}
