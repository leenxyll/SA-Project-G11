import java.time.*;
import java.util.ArrayList;
import java.util.Scanner;

class Order {
    private int order_id;
    private double total_price;
    private LocalDate order_Date;

    private Product order_product;
    private int qty;
    private User user;
    private Taker taker;
    private OrderStatus status;

    Order(int order_id/* , double price */, LocalDate date, /* User user, */ OrderStatus status) {
        this.order_id = order_id;
        this.total_price = 0;
        this.order_Date = date;
        // this.order_product = new ArrayList<>();
        // this.user = user;
        this.status = status;
    }

    public void add_Product(Product product, int qty) {
        this.qty = qty;
        this.total_price = product.getProduct_disPrice() * qty;
        order_product = product;
    }

    public void show_order_owner(int order_id) {
        if (this.order_id == order_id) {
            System.out.println(this.user.toString());
        } else {
            System.out.println("---Order not found!---");
        }
    }

    public void order_edit(int order_id, Product newProducts) {
        if (this.order_id == order_id) {
            this.order_product = newProducts;
            System.out.println("---Order is updated successfully!---");
        } else {
            System.out.println("---Order not found!---");
        }
    }

    public void status_edit(int order_id, OrderStatus status) {
        if (this.order_id == order_id && !status.equals(OrderStatus.cancel)) {
            this.status = status;
            System.out.println("---Order " + this.order_id + " status is " + this.status + "---");
        } else if (this.order_id == order_id && status.equals(OrderStatus.cancel)) {
            this.status = status;
            this.order_product = null;
            this.user = null;
            System.out.println("---Order " + this.order_id + "is canceled!---");
        } else {
            System.out.println("---Order is not found!---");
        }
    }


    public void chooseTaker(Taker taker) {
        // ArrayList<Taker> takers = this.user.getAllTakers();
        // System.out.println("== TAKER ==");
        // int i = 1;
        // for(Taker aTaker : takers){
        // System.out.print(i + " : " ); aTaker.display();
        // i++;
        // // aTaker.display();
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Please enter UserId the taker you select : ");
        // int takerId = sc.nextInt();
        // for(Taker aTaker : takers){
        // if(aTaker.getUserId() == takerId){
        this.taker = taker;
        // }
        // }
    }

    // public void chooseTaker(){
    // sh
    // }

    @Override
    public String toString() {
        return "\n=== ORDER No." + order_id + " ===\nDate : " + order_Date + "\n" + order_product + "\nQTY : " + qty
                + "\tTotalAmount : " + total_price + "\nTaker : ";
    }
}