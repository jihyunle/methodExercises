import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int num1 = keyboard.nextInt();
        System.out.println("Please enter the second number: ");
        int num2 = keyboard.nextInt();
        int sum = addTwoNumbers(num1, num2);
        System.out.println("The sum of the two numbers is " + sum);
        keyboard.close();
    }

    public static int addTwoNumbers(int a, int b){
        int sum = 0;
        sum = a + b;
        return sum;
    }
}
