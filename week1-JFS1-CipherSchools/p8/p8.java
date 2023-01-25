import java.nio.channels.NetworkChannel;

public class p8 {
    public static void main(String[] args) {
        Amazon customer = new Amazon();
        float pay = customer.transaction(1000);
        System.out.println("Total payable amount: " + pay);
    }
}

class Amazon {
    float transaction(float amt) {
        gpay gpayobj =  new gpay();
        gpayobj.setTxnch(0.07f);
        float ttl = amt + (amt * gpayobj.getTxnch());
        return ttl;
    }
} 
class gpay{
    private float Txn=0.05f;
    public void setTxnch(float newch) {
        if (newch<=0.05f){
            System.out.println("Invalid");
            return;
        }
        Txn = newch;
    }
    public float getTxnch() {
        return Txn;
    }
}