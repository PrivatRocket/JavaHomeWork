package hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){
        int value1;
        Scanner in = new Scanner(System.in);

        System.out.print("Введіть число: ");
        value1 = in.nextInt();


            if (1 <= value1 && value1 <= 14) {
                System.out.print("[0 -14]");
            } else if (15 <= value1 && value1 <= 35) {
                System.out.print("[15 - 35]");
            } else if (36 <= value1 && value1 <= 50) {
                System.out.print("[36 - 50]");
            } else if (51 <= value1 && value1 <= 100){
                System.out.print("[51 - 100]");
        } else {
                System.out.print("Не в діапазоні");
            }
        }
    }
