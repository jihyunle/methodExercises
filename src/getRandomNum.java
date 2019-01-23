import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Print a 5 random numbers given a bound.
public class getRandomNum {

    // Main  - get bound; print selected numbers
    public static void main(String[]args){
        // get bound from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the minimum value of the range: ");
        int min = input.nextInt();
        System.out.println("Enter the maximum value of the range: ");
        int max = input.nextInt();
        input.close();

        // call method to generate random number
        // add that number to list
        // print the list
        ArrayList<Integer> numbers = new ArrayList<>();
        int number = 0;
        for(int i=0; i<5; i++){
            number = generateRandomNum(min, max);
            numbers.add(number);
            System.out.println(numbers.get(i));
        }
    }

    // Random method - generate random numbers within bound
    public static int generateRandomNum(int min, int max){
        Random rnd = new Random();
        int n = rnd.nextInt((max-min)+1) + min;
        return n;

    }
}
