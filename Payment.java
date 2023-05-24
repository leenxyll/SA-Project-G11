import java.time.*;
class Payment{
    private int payment_id;
    private LocalDate payment_date;
    private double payment_amount;

    public int getPayment_id() {
        return this.payment_id;
    }

    public void setPayment_id(int payment_id) {
        this.payment_id = payment_id;
    }

    public LocalDate getPayment_date() {
        return this.payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public double getPayment_amount() {
        return this.payment_amount;
    }

    public void setPayment_amount(double payment_amount) {
        this.payment_amount = payment_amount;
    }

    Payment(int payment_id, LocalDate payment_date, double payment_amount){
        this.payment_id = payment_id;
        this.payment_date = payment_date;
        this.payment_amount = payment_amount;
    }

    void addPayment(int payment_id, LocalDate payment_date, double payment_amount){

    }

    void editPayment(int payment_id, LocalDate payment_date, double payment_amount){

    }

    void deletePayment(int payment_id, LocalDate payment_date, double payment_amount){
        
    }

    void searchPayment(int payment_id, LocalDate payment_date, double payment_amount){
        
    }
}