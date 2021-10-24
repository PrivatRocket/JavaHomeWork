package hw3;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int array[] = new int[10];
        System.out.println("Введіть елементи масиву:");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        System.out.println ("Елементи масиву: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print (array[i]);
        }
        System.out.println ("Сума елементів масиву: ");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum +array[i];
        }
        System.out.println (sum);
        System.out.println ("Кількість позитивних елементів масиву: ");
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
                if(array[i] >= 0)
                    counter += 1;
            }
            System.out.println(counter);

        System.out.println("Сортування бульбашкою");
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        for(int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }

    }
}
