import java.util.Random;
import java.util.ArrayList;
    
// To use methods from the Random library you will need to create an instance of Random
// From there you can use any of the methods listed in the documentation. For example:
// <--- you won't need to use this method.

public class PuzzleJava {

    public ArrayList<Integer> getTenRolls() {

        ArrayList<Integer> randomArr = new ArrayList<Integer>();
        Random rd = new Random(); // creating Random object
        
        for (int i = 0; i <=10; i++) {
            randomArr.add(rd.nextInt(20) + 1);
        }
        return randomArr;
    }

    public char getRandomLetter() {
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        Random rd = new Random();
        int choice = rd.nextInt(26);
        return alphabet[choice];
    }

    public String generatePassword() {
        Random rd = new Random(); // creating Random object
        String password = "";
        for (int i = 0; i <=8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int num) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i = 0; i <= num; i ++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

    
}