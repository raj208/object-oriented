import java.util.Scanner;

public class tut7 {
    static int sum (int num1, int num2){
        int sum = num1+num2;
        return sum;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = scanner.nextInt();

        System.out.println("enter second element");
        int num2 = scanner.nextInt();
        scanner.close();

        int ans = sum(num1,num2);
        System.out.println("sum of two number is "+ans);
    }
}
