/*
Get 5 letters from the user, output them sorted
(Hint: Use ArrayList and Collections.sort())
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sortFiveLetters {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter five letters");
        char letter;
        ArrayList<Character> letters = new ArrayList<>();

        for(int i=0; i<5; i++){
            String temp = keyboard.nextLine().toUpperCase();
            letter = temp.charAt(0);
            letters.add(letter);
        }

        System.out.println("Before sort: " + letters);

        // Sort using Collections class
        sortLetters(letters);
        System.out.println("After sort: " + letters);

        keyboard.close();

    }

    public static ArrayList<Character> sortLetters(ArrayList<Character> ar){
        Collections.sort(ar);
        return ar;

    }
}
