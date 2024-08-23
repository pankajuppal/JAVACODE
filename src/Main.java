import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pricipal Amount:");
        int Principal = scanner.nextInt();
        System.out.print("Enter the interest rate:");
        byte rate = scanner.nextByte();
        System.out.println("Interest to pay is : " + (Principal*rate)/100);

        }
    }
