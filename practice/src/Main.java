import java.util.* ;
public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Input chocolate number:");
        int m= sc.nextInt();
        System.out.println("Input chocolate Price: ");
        int c= sc.nextInt();
        int n=m/c;
        int z=n;
        while(z<3)
        {
            int b=z/3;
            b=b+z;
            int v=z%3;
            z=v+b;

        }
        System.out.println(z);
    }
}
//By Sudip