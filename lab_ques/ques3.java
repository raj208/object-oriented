package lab_ques;
import java.util.Scanner;

class Box{
    private double lenght;
    private double breadth;
    private double height;

    public Box(double lenght, double breadth, double height)
    {
        this.lenght = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    public double volume()
    {
        return lenght*breadth*height;
    }
}

public class ques3 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght");
        double l = scanner.nextDouble();

        System.out.println("Enter breadth");
        double b = scanner.nextDouble();

        System.out.println("Enter height");
        double h = scanner.nextDouble();

        Box box = new Box(l,b,h);

        System.out.println("Volume of box "+ box.volume());
        scanner.close();


    }

}
