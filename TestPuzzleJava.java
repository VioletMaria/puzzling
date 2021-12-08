import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);
		char randomLetter = generator.getRandomLetter();
		System.out.println(randomLetter);
    	System.out.println(generator.generatePassword());
		System.out.println(generator.getNewPasswordSet(10));
	}

	
}