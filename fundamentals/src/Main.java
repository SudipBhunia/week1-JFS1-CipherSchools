import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name: ");
        String name =sc.next();
        System.out.println("What is your age: ");
        int age =sc.nextInt();
        System.out.println("What is your height: ");
        float height=sc.nextFloat();
        String msg= "Hello"+name+"age: "+age+"height: "+height;
        System.out.println(msg);
    }
}