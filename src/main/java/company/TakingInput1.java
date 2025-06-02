package company;

import java.util.Scanner;

public class TakingInput1 {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Name");
        String str = sc.next();
        System.out.println("Enter Least Name");
        String strL = sc.next();
        System.out.println("Enter Mobile Number");
        int mobileN = sc.nextInt();

    }
}
