import java.util.Scanner;

// Get the length of a string.
public class getStringLength {
    public static void main(String[]args){
        System.out.println("Please type a sentence: ");
        Scanner keyboard = new Scanner(System.in);
        String str = keyboard.nextLine();
        int strLength = getStringLength(str);
        System.out.println("The sentence entered is " + strLength + " characters long.");
        keyboard.close();
    }

    public static int getStringLength(String a){
        int len = 0;
        len = a.length();
        return len;
    }
}
