import java.util.Scanner;
public class Demo5 {
    public static void main(String[] args)
    {
        Scanner os=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=os.nextLine();
        System.out.println("enter another string:");
        String str1=os.nextLine();
        System.out.println("the length:"+str.length());
        System.out.println("the charat:"+str.charAt(2));
        System.out.println("the uppercase:"+str.toUpperCase());
        System.out.println("the lowercase:"+str.toLowerCase());
        System.out.println("the equals:"+str.equals(str1));
    }
    
}
