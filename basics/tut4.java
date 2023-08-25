import java.util.Scanner;

public class tut4 {
    public static void main(String[] args){
        Scanner sccanner = new Scanner(System.in);

        System.out.print("Enter the first number");
        int num1 = sccanner.nextInt();

        System.out.print("Enter second number");
        int num2 = sccanner.nextInt();

        sccanner.close();

        int num3 = num1+num2;

        System.out.println("Sum of two number is "+num3);
    }
}


// import java.util.Scanner;

// public class AddTwoNumbersWithInput {
//     public static void main(String[] args) {
//         // Create a Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for input
//         System.out.print("Enter the first number: ");
//         int num1 = scanner.nextInt(); // Read the first number from user

//         System.out.print("Enter the second number: ");
//         int num2 = scanner.nextInt(); // Read the second number from user

//         // Close the scanner after reading input
//         scanner.close();

//         // Add the numbers
//         int sum = num1 + num2;

//         // Print the result
//         System.out.println("Sum: " + sum);
//     }
// }
