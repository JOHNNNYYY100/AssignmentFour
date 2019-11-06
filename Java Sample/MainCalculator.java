package TestingPackage;
import java.util.Scanner;
public class MainCalculator {
    public static void main (String args[]){
        double UserOne, UserTwo, Options, Answer; //variables
        System.out.println("This is a calculator");
        System.out.println("Enter a number");
        UserOne = new Scanner(System.in).nextDouble();
        System.out.println("Enter a number");
        UserTwo = new Scanner (System.in).nextDouble();
        System.out.println("Enter what operation you want to do");
        System.out.println("'1' Addition '2' Subtratction, '3' Multiplication, '4' Division");
        Options = new Scanner (System.in).nextDouble();

        if (Options == 1){
            Answer= UserOne + UserTwo ;
            System.out.println("The addition of "+ UserOne+ "+ " + UserTwo +" is "+ Answer); }

        if (Options ==2){
            Answer=UserOne - UserTwo;
            System.out.println("The addition of "+ UserOne+ "- " + UserTwo +" is "+ Answer); }

        if (Options== 3){
            Answer=UserOne*UserTwo;
            System.out.println("The addition of "+ UserOne+ "* " + UserTwo +" is "+ Answer); }

        if (Options ==4){
            Answer=UserOne/UserTwo;
            System.out.println("The addition of "+ UserOne+ "/ " + UserTwo +" is "+ Answer); }







    }
}
