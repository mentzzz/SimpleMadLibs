import java.util.Scanner;

public class madlibs {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Choose a color: ");
		String color = userInput.nextLine();
		System.out.println("Choose a plural noun: ");
		String noun = userInput.nextLine();
		System.out.println("Finally, choose a celebrity: ");
		String celebrity = userInput.nextLine();
		
		
		System.out.println("Roses are "
				+ color + ", \n"
				+ noun + " are blue, \n"
				+ "I love " + celebrity );
	}
}
