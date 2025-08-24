package Lec5_Loop;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a non-negative integer: ");
        int f = sc.nextInt();
        long factorial = 1;
        for (int i = f; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println("The factorial of " + f + " is: " + factorial);

        System.out.println("\n");
    }
}
