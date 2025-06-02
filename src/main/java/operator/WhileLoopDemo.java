package operator;

public class WhileLoopDemo {
    public static void main(String[] args) {

        int sum = 0;
        int number = 1565278;

        while(number !=0){
            sum += (number % 10);
            number /= 10;
        }
        System.out.println(sum);
    }
}
