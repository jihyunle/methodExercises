import java.util.Scanner;

// Take integer input from the user, output whether it's odd or even.
public class checkEvenOdd {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        int num = input.nextInt();
        boolean isEven = checkEvenOdd(num);
        if(isEven){
            System.out.println("The number you entered is even.");
        }else{
            System.out.println("The number you entered is odd.");
        }
        input.close();

    }

    public static boolean checkEvenOdd(int n){
        boolean isEven = true;
        if(n%2!=0){
            isEven = false;
        }
        return isEven;
    }

}
