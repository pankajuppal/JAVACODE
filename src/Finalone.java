import java.util.Scanner;

public class Finalone {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Pricipal Amount:");
            int Principal = scanner.nextInt();
            System.out.print("Enter the interest rate:");
            byte rate = scanner.nextByte();
            System.out.println("Interest to pay is : " + (Principal*rate)/100);
            System.out.println("Final Changes");
        }
    }

