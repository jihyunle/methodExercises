import java.util.ArrayList;
import java.util.Scanner;

// Get the average of 3 numbers.
public class getAverage {
    public static void main(String[]args){
        System.out.println("Please enter 3 numbers");
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i<3; i++){
            int temp = input.nextInt();
            numbers.add(temp);
        }

        double average = getAverage(numbers.get(0), numbers.get(1), numbers.get(2));
        System.out.println("The average of 3 numbers is " + average);

        input.close();

    }

    public static double getAverage(int a, int b, int c){
        double avg = 0.0;
        avg = (a+b+c)/3.0;
        return avg;
    }
}
