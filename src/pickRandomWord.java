import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Given the array list, print a random word from the list: (module, class, implement).
public class pickRandomWord {
    public static void main(String[]args){
        ArrayList<String> words = new ArrayList<>();
        words.add("module");
        words.add("class");
        words.add("implement");

        Scanner input = new Scanner(System.in);
        String answer = "";

        // pick a random number between 0 and 2
        // that will correspond to the word in the list
        do {
            int num = generateRandomNumber(words.size());
            System.out.println("I'm going to choose a word at random from my list, and it is...");
            System.out.println("'" + words.get(num) + "'!");
            System.out.println("Would you like me to choose again?: Y or N");
            answer = input.nextLine();
        }while(! answer.equalsIgnoreCase("n"));
        System.out.println("Thanks for playing. Toodle-loo!");
        input.close();

    }

    public static int generateRandomNumber(int a){
        Random rnd = new Random();
        int n = rnd.nextInt(a);
        return n;
    }

}
