package IntroductionToProblemSolving;

import java.util.Scanner;

public class SummationGame {
    public static void sumOfNaturalnumber(int N){
        int sum = 0;
        for(int i = 1; i<= N ; i++)
            sum +=i;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sumOfNaturalnumber(number);
        
    }
}
