import java.util.Scanner;

public class tut5{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of row");
        int row = scanner.nextInt();

        System.out.println("Enter the size of column");
        int col = scanner.nextInt();



        int [][] arr = new int[row][col];
        System.out.println("Enter the value of array");
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                arr[i][j] = scanner.nextInt();
            }
        }


        //displaying array
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
