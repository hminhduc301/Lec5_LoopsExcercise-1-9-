package Lec5_Loops;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 10: ");
        int n;
        do{
            n = scanner.nextInt();
            if(n < 1 || n > 10){
                System.out.print("Invalid number, please try again: ");
            }
        }while(n<1||n>10); 
        System.out.println("You entered the number: "+n);
    }
}
