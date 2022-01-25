package Lab2;
import java.io.IOException;
import java.util.Scanner;
public class Week2q2 {
    public static void main(String[] args)
            throws IOException
    {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double[] nums = new double[3];
        int i;
        double sum=0;
        int count=0;
        double average;
        // Loop to store input values in nums array
        for (i = 0; i < nums.length; i++) {
            nums[i] = input.nextDouble();
        }
        for (i = 0; i < nums.length; i++) {
            sum+=nums[i];
            count+=1;
        }
        average=sum/count;
        System.out.println("The average of "+nums[0] +" " + nums[1]+" " +nums [2]+" is "+average);
    }
}
