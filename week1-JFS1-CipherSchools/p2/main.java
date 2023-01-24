import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pay: ");
        int pay= sc.nextInt();
        int gpay;
        if (pay >= 5000) {
            gpay= pay+((pay*10)/100)+((pay*20)/100);
        }
        else {
            gpay= pay+((pay*20)/100)+((pay*30)/100);
        }
        System.out.println("Gross pay: "+ gpay);
    }
}
