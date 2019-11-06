package Lab_1;
import java.util.Scanner;

public class TaxProgram {
    public static void main(String args[]) {
        double income, fedTax, provTax;
        int dependents;

        System.out.print("Please enter your taxable income: ");
        income = new Scanner(System.in).nextDouble();

        System.out.print("Please enter your number of dependents: ");
        dependents = new Scanner(System.in).nextInt();

        fedTax = 0.0;
        provTax = 0.0;
        double TotalTax= 0.0;
        double LowBracket=0;
        double MiddleBracket=0;
        double HighBracket=0;

        double FedLowBracket=0;
        double FedMidBracket=0;
        double FedHighBracket=0;

        if (income < 29590) {
            LowBracket = .17 * income;
            FedLowBracket=LowBracket*.425;
            FedLowBracket=FedLowBracket-((dependents*328)+160.50);
            TotalTax=FedLowBracket+LowBracket;
             System.out.println(String.format("%,1.2f" ,FedLowBracket);

        }

        if (income > 29590 && income < 59179) {
            income = income - 29590;
            MiddleBracket = .26 * income;
            MiddleBracket=MiddleBracket+3400;
            FedMidBracket=MiddleBracket*.425;
            FedMidBracket=FedMidBracket-((dependents*328)+160.5);


        }
        if (income>59179){
            income=income-59180;
            HighBracket=income*.29;
            HighBracket=HighBracket+11095;
            FedHighBracket=HighBracket*.425;
            FedHighBracket=FedHighBracket-((dependents*328)+160.5);



        }



        //System.out.println("Federal tax is" + income);
    }
}




