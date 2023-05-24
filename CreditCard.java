import java.time.*;
class CreditCard extends Payment{
    private int card_number;
    private String card_name;
    private String card_cvv;
    private String card_type;

    CreditCard(int card_number,String card_name, String card_cvv,String card_type,
                int payment_id,LocalDate payment_date,double payment_amount){
        super(payment_id,payment_date,payment_amount);
        this.card_number = card_number;
        this.card_name = card_name;
        this.card_cvv = card_cvv;
        this.card_type = card_type;
    }


	public int get_card_number(){
        return card_number;
    }

    public void set_card_number(int card_number){
        this.card_number = card_number;
    }

    public String get_card_name(){
        return card_name;
    }

    public void set_card_name(String card_name){
        this.card_name = card_name;
    }

    public String get_card_cvv(){
        return card_cvv;
    }

    public void set_card_cvv(String card_cvv){
        this.card_cvv = card_cvv;
    }

    public String get_card_type(){
        return card_type;
    }

    public void set_card_type(String card_type){
        this.card_type = card_type;
    }
}