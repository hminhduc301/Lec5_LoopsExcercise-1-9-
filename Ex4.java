package Lec5_Loop;
import java.util.Scanner;
public class Ex1_ {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter height h: ");
        int h = sc.nextInt();
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("\n");
    }
}
