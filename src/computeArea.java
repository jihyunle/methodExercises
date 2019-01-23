import java.util.ArrayList;
import java.util.Scanner;

// Take two integer inputs from the user, compute its area.
public class computeArea {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> sides = new ArrayList<>();
        int numSides = 2;

        for(int i=0; i<numSides; i++){
            System.out.println("Please enter the length of the side: ");
            int side = input.nextInt();
            sides.add(side);
        }

        double area = computeArea((double)sides.get(0),sides.get(1));
        System.out.println("The area based on the dimensions you entered is " + area);

        input.close();

    }

    public static double computeArea(double a, int b){
        double area = 0.0;
        area = a*b;
        return area;
    }
}
