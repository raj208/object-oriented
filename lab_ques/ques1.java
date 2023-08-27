package lab_ques;
import java.lang.Math;

public class ques1 {
    public static void main(String[] args)
    {
        int max = 6;
        int min = 0;
        for(int i=0; i<6; i++)
        {
            int dice = (int)(Math.random()*max)+min;
            System.out.println(dice);
        }
    }
}


// int rand = (int)(Math.random() * range) + min;