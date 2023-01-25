interface olaCustomer{
    void bookcab();
    void findARide();
    void RentCAb();
    void RateDriver();
    void ScheduleCab();
    void CancelCAb();
    void addMoney();
    void raiseTicket();
    void signup();
    void signin();
}

interface olaDriver {
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMycommission();
    void raiseMoney();
    void callCust();
    void setupYourVehicle();
    void customerFeedback();

}

interface olaOwner() {
    void getDriverrecords();
    void getReportDriver();
    void getReportRegion();
    void getTotalRevene();
    void getCustomerFeedback();
    void addDriver();
    void removeDriver();
    void changeDriver();

}

public class p9 implements olaCustomer,olaDriver,olaOwner {
    public static void main(String[] args) {
        olaCustomer cust = new p9();
        cust.
    }
}