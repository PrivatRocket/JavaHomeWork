package hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        int operand1;
        int operand2;
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть значення 1: ");
        operand1 = in.nextInt();
        System.out.print("Введіть значення 2: ");
        operand2 = in.nextInt();
        System.out.print("Введіть знак арифметичної опеації: ");
        String sign = in.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println((operand1 - operand2));
                break;
            case "*" :
                System.out.println(operand1 * operand2);
                break;
            case "/" :
                if (operand2 != 0) {
                System.out.println(operand1 / operand2);
                break;
            }else{
                    System.out.println("На нуль ділити не можна");
            }
            default:
                System.out.println(" ");
        }

    }
}
