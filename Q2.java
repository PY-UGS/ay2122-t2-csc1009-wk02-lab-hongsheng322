import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {   

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        float float1 = input.nextFloat();
        float float2 = input.nextFloat();
        float float3 = input.nextFloat();
        input.close();
        Q2 average = new Q2();
        System.out.print("The average of " + float1 +  " " + float2 +  " " + float3 + " is " +
        average.getAverage(float1,float2,float3));
   
    }

    public float getAverage(float a, float b, float c)
    {
        return (a+b+c)/3;
    }
}
