import java.util.Scanner;

// Check if a year is a leap year (A leap year is divisible by 4).
public class checkLeapYear {
    public static void main(String[]args){
        System.out.println("Please enter the year you want to check for leap year: ");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        boolean isLeapYear = checkLeapYear(year);
        if(isLeapYear){
            System.out.println(year + " is a leap year!");
        }else{
            System.out.println(year + " is not a leap year.");
        }

        input.close();
    }

    public static boolean checkLeapYear(int yr){
        boolean isLeapYear = false;
        if(yr%4==0){
            isLeapYear = true;
        }
        return isLeapYear;
    }
}
