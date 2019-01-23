/*The letter grade is determined as follows:
A = 90–100%
B = 80–89%
C = 70–79%
D = 60–69%
F = 0–59%
Write a program that will print the letter grade based on the percentage entered.*/

import java.util.Scanner;

public class getLetterGrade {
    public static void main(String[]args){
        System.out.println("Enter the percent grade: ");
        Scanner input = new Scanner(System.in);
        double percentGrade = input.nextDouble();
        char letterGrade = convertPercentToLetterGrade(percentGrade);
        System.out.println(percentGrade + "%" + " is a letter grade " + letterGrade);

    }

    public static char convertPercentToLetterGrade(double percentGrade){
        char letterGrade ='n';
        if(percentGrade>89){
            letterGrade = 'A';
        }else if (percentGrade>79){
            letterGrade = 'B';
        }else if (percentGrade>69){
            letterGrade = 'C';
        }else if (percentGrade>59){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }
//        switch(percentGrade){
//            case percentGrade>89;
//                break;
//            case 2:
//                letterGrade = 'B';
//                break;
//            case 3:
//                letterGrade = 'C';
//                break;
//            case 4:
//                letterGrade = 'D';
//                break;
//            case 5:
//                letterGrade = 'F';
//                break;
//
//        }
        return letterGrade;
    }
}
