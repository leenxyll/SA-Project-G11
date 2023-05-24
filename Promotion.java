import java.time.*;
import java.util.ArrayList;
import java.util.List;
public class Promotion{
    private int promotion_id;
    private String promotion_name;
    private String promotion_description;
    private String promotion_type;
    private LocalDateTime promotion_startDate;
    private LocalDateTime promotion_endDate;
    private int promotion_view;
 
    private static List<Promotion> pmts = new ArrayList<Promotion>();

    Promotion(){
        getPromotion();
    }

     public Promotion(int promotion_id, String promotion_name ,String promotion_description,String promotion_type,LocalDateTime promotion_startDate,LocalDateTime promotion_endDate,int promotion_view){

        this.promotion_id = promotion_id;
        this.promotion_name = promotion_name;
        this.promotion_description = promotion_description;
        this.promotion_type = promotion_type;
        this.promotion_startDate = promotion_startDate;
        this.promotion_endDate = promotion_endDate;
        this.promotion_view = promotion_view;
       
    }

    private static void getPromotion(){
       pmts.add(new Promotion(0, "a", "aa","Fashion", LocalDateTime.of(2022, 03,11, 12, 2, 2),LocalDateTime.of(2022, 03,21, 12, 2, 2), 0));
       pmts.add(new Promotion(1, "b", "bb", "Fashion",LocalDateTime.of(2022, 03,13, 12, 2, 2),LocalDateTime.of(2022, 03,21, 12, 2, 2), 0));
       pmts.add(new Promotion(2, "c", "cc", "Fashion",LocalDateTime.of(2022, 06,10, 12, 2, 2),LocalDateTime.of(2022, 06,22, 12, 2, 2), 0));
       pmts.add(new Promotion(3, "d", "dd", "Tech",LocalDateTime.of(2022, 04,23, 12, 2, 2),LocalDateTime.of(2022, 04,29, 12, 2, 2), 0));
       pmts.add(new Promotion(4, "e", "ee","Tech", LocalDateTime.of(2022, 07,03, 12, 2, 2),LocalDateTime.of(2022, 07,06, 12, 2, 2), 0));
    }

    public void display(){
        System.out.println("== Promotion ==");
        for(Promotion apmts : pmts){
                System.out.println(apmts);
        } 
    }
    
    public Promotion findPromotion(int promotion_id){
        for(Promotion apmts: pmts){
            if(promotion_id == apmts.promotion_id){
                apmts.promotion_view++;
                return apmts;
            } 
                
        }
        return null;
    }

    public void delete_promotion_datetime(){
         LocalDateTime currenttime = LocalDateTime.now();
      
        for(Promotion apmts : pmts){
            if(currenttime.isAfter(apmts.promotion_endDate)){
                apmts.delete_promotion(apmts.promotion_id);
            }
        }
    }

    public void delete_promotion(int promotion_id){
        pmts.remove(promotion_id);
        System.out.println("Removing Promotion id :"+ promotion_id);
    }

     public int getPromotion_id() {
        return this.promotion_id;
    }

    public void setPromotion_id(int promotion_id) {
        this.promotion_id = promotion_id;
    }

    public String getPromotion_name() {
        return this.promotion_name;
    }

    public void setPromotion_name(String promotion_name) {
        this.promotion_name = promotion_name;
    }

    public String getPromotion_description() {
        return this.promotion_description;
    }

    public void setPromotion_description(String promotion_description) {
        this.promotion_description = promotion_description;
    }

    public String getPromotion_type() {
        return this.promotion_type;
    }

    public void setPromotion_type(String promotion_type) {
        this.promotion_type = promotion_type;
    }

    public LocalDateTime getPromotion_startDate() {
        return this.promotion_startDate;
    }

    public void setPromotion_startDate(LocalDateTime promotion_startDate) {
        this.promotion_startDate = promotion_startDate;
    }

    public LocalDateTime getPromotion_endDate() {
        return this.promotion_endDate;
    }

    public void setPromotion_endDate(LocalDateTime promotion_endDate) {
        this.promotion_endDate = promotion_endDate;
    }

    public int getPromotion_view() {
        return this.promotion_view;
    }

    public void setPromotion_view(int promotion_view) {
        this.promotion_view = promotion_view;
    }
    



    
 

}