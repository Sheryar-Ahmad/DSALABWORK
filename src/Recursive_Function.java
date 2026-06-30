import java.util.Scanner;
 class FactorialCounting{
    public double Factorial(int number){
        int fact=1;
        if (number==1||number ==0){
            return 1;
        }
        else {
            return number * Factorial(number - 1);
        }
    }
}
public class Recursive_Function {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number you want to see its factorial");
        int number=sc.nextInt();

        FactorialCounting f1= new FactorialCounting();

        double Result_Of_Factorial=f1.Factorial(number);
        System.out.println("Factoral of the number is :"+Result_Of_Factorial);
    }
}
