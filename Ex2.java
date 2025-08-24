package Lec5_Loop;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter an integer from 2 to 9: ");
        int n = sc.nextInt();
        if (n >= 2 && n <= 9) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        } else {
            System.out.println("Invalid input! Please enter between 2 and 9.");
        }

        System.out.println("\n");
    }
}
