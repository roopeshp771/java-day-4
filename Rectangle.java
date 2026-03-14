import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args)
    {
        Scanner od=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int row=od.nextInt();
        System.out.println("Enter the colums:");
        int colum=od.nextInt();
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=colum;j++)
            {
                if(i==1||i==row||j==1||j==colum)
                {
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
