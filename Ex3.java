package Lec5_Loop;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter height: ");
        int height = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");
    }
}
