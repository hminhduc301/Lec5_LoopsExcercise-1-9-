package Lec5_Loop;
import java.util.Scanner;
import java.util.Random;
public class Ex7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
       Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("Enter your guess (1-100): ");
            guess = sc.nextInt();
            if (guess > secret) {
                System.out.println("Your guess is higher than the secret number!");
            } else if (guess < secret) {
                System.out.println("Your guess is lower than the secret number!");
            } else {
                System.out.println("Congratulations! You guessed correctly!");
            }
        } while (guess != secret);
    }
}
