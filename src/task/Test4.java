package task;

import java.util.Scanner;

public class Test4 extends Shape{
    @Override
    public double getPerimeter() {



        Scanner scanner = new Scanner(System.in);
        System.out.print("num1 : ");
        double num1 = scanner.nextDouble();
        System.out.print("num2 : ");
        double num2 = scanner.nextDouble();

        System.out.println("num3 : 2");

        double res =  2 * (num1 + num2);

        System.out.print("summa : ");


        return res;
    }
}
