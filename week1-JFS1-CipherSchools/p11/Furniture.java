public class Furniture {

    int width;
    int height;

    void display(String item) {
        System.out.println(item+" Width "+ width+ " Height "+ height);
    }
    public static void main(String[] args) {
        chair neel = new chair();
        neel.foo();
        table swish = new table();
        swish.foo();
        alm natraj = new alm();
        natraj.foo();
    }
}

class chair extends Furniture{
    void foo() {
        width = 10;height=20; display("chair");
    }
}
class table extends Furniture{
void foo() {
    width = 50;height=26; display("table");
}
}
class alm extends Furniture{
void foo() {
    width = 30;height=70; display("alm");
}
}