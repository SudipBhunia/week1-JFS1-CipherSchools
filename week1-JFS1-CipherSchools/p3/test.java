import java.util.*;

public class test {
    public static void main(String[] args) {
        Random rn = new Random();
        Scanner sc= new Scanner(System.in);
        int c = rn.nextInt(20);
        System.out.println("Random number: "+c);

        for(int i=1;i<=3;i++) {
        System.out.println("Guess a number: ");
        int num = sc.nextInt();
        if(num>c)
        {
            System.out.println("Guess is too high!!");
        }
        else if(num <c) {
            System.out.println("Guess is too low!!");
        }
        else {
            System.out.println("Guessed itt right!!");
            break;
        }
        }
    }
}
