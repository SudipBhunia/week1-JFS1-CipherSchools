abstract class doctor{
    abstract void treat();
}
class physician extends doctor {
    void treat() {
        System.out.println("I am physician");
    }
}
class surgeon extends doctor {
    void treat() {
        System.out.println("I am surgeon");
    }
}

class dentist extends doctor {
    void treat() {
        System.out.println("I am dentist");
    }
}
public class p12 {
    public static void main(String[] args) {
        int choice = new java.util.Scanner(System.in).nextInt();
        doctor doc = null;
        switch (choice) {
            case 1: 
            doc = new physician();
            break;
            case 2:
            doc = new surgeon();
            break;
            case 3:
            doc = new dentist();
            break;
            default:
            System.out.println("invaalid");
            break;

        }
        if (choice<=0 || choice>3) {
            System.exit(0);

        }
        else {
            doc.treat();
        }
    }
}