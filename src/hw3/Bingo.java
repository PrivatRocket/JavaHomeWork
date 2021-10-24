package hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        int max_attempt = 25;
        int attempt = 0;
        Random random = new Random();
        int x = random.nextInt(101);
        Scanner scanner = new Scanner(System.in);

        while (attempt < max_attempt) {
            attempt++;
            System.out.println("Для виходу введіть: 00");
            System.out.println("Відгадайте число: ");
            int value = scanner.nextInt();
            System.out.println("Спроба:" + attempt);

            if (value == 00) {
                break;
            }
            if (value != x) {
                if (x > value) {
                    System.out.println("Загадане число більше, спробуй ще\n");
                    continue;
                } else {
                    System.out.println("Загадане число менше, спробуй ще");
                    continue;
                }
            }

            System.out.println("Вітаю Ви вгадали з " + attempt + " спроби");
            break;
        }
        System.out.println("Кінець гри");
    }
}




