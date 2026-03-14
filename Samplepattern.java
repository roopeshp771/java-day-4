import java.util.Scanner;
public class Samplepattern {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows=obj.nextInt();
        for(int i=1;i<rows;i++)
        {
            for(int j=i;j<rows;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
