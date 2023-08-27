package lab_ques;
import java.util.Scanner;
// import java.lang.Math;

public class ques2 {
    public static void main(String[] args){

        System.out.println("press 1 for circle");
        System.out.println("press 2 for square");
        System.out.println("press 3 for rectangle");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        // System.out.println("Enter the number for area calculation");
        switch(x){
            case 1: 
                System.out.println("Enter the value of radius");
                int radius = scanner.nextInt();
                double pi = 3.14;
                double area1 = pi*radius*radius;
                System.out.println("area of circle is "+area1);
                break;

                case 2:
                    System.out.println("Enter the side of sqaure");
                    int side = scanner.nextInt();
                    int area2 = side*side;
                    System.out.println("area of square is "+area2);
                    break;
                
                case 3:
                    System.out.println("Enter the lenght of rectangle");
                    int lenght = scanner.nextInt();

                    System.out.println("Enter the lenght of rectangle");
                    int breadth = scanner.nextInt();

                    int area3 = lenght*breadth;
                    System.out.println("area of rectangle is "+area3);

        scanner.close();
        }
    }
}
