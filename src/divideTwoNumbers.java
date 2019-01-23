import java.util.ArrayList;
import java.util.Scanner;

public class divideTwoNumbers {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        // Get two numbers from the user
        System.out.println("Please enter two numbers: ");
        for(int i=0; i<2; i++){
//            System.out.println("Please enter a number: ");
            int temp = keyboard.nextInt();
            numbers.add(temp);
        }
        // Print the numbers entered
        System.out.println("The numbers you entered are: " + numbers);

        // Print result accordingly
        System.out.print("The result is ");
        if(numbers.get(1)==0){
            System.out.println("Undefined");
        }else{
            double result = divideTwoNumbers(numbers.get(0),numbers.get(1));
            System.out.println(result);
        }
        keyboard.close();
    }

    public static double divideTwoNumbers(double a, int b){
        double result = a/b;
        return result;

    }
}
