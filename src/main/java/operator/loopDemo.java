package operator;

import java.util.Scanner;

public class loopDemo {
    public static void main(String[] args) {
        // loop will be executed until condition satisfied - i will keep executing
        // un-certain = while and do.while loop
        // certain = for loop
        // anything which can achieved using while loop, can be achieved using for as well

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = sc.nextInt();

        while(num > 0){
            System.out.println("You entered " + num);
            System.out.println("Enter your number");
            num = sc.nextInt();

        }
        System.out.println("Thanks for using number loop");

    }
}
