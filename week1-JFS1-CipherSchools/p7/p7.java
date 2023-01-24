import java.util.*;
 public class p7{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Tell me your speed: ");
    int speed = sc.nextInt();
    System.out.println("is today your bday: true or false!");
    boolean bday = sc.nextBoolean();
    if ( bday == true) {
        speed = speed - 5;
        System.out.println("Your waived off speed is:  "+ speed);
    }
    else {
        System.out.println("No waived off your speed is: "+speed);
    }

    if ( speed > 80) {
        System.out.println("High ticket!");
    }
    else if (speed <= 80 && speed >= 60) {
        System.out.println("Medium ticket!");
    }
    else {
        System.out.println("No ticket");
    }
    }
 }