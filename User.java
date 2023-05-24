import java.time.*;
import java.util.ArrayList;
import java.util.Scanner; 
public class User {
    private int userId;
    private String fName;
    private String lName;
    private String tel;
    private Address address;
    // private Account account;
    private LocalDate creationDate;
    private Coupon coupons;
    private ArrayList<Coupon> myCoupon = new ArrayList<Coupon>();
    private Product products;
    private ArrayList<Order> myOrder = new ArrayList<Order>();
    protected static ArrayList<Taker> takers = new ArrayList<Taker>();


    public User(int userId, String fName, String lName, String tel, Address address/*, Account account*/) {
        this.userId = userId;
        this.fName = fName;
        this.lName = lName;
        this.tel = tel;
        this.address = address;
        // this.account = account;
        this.creationDate = LocalDate.now();
    }
    
    public int getUserId() {
        return this.userId;
    }

    public String getfName() {
        return this.fName;
    }
    
    public String getlName() {
        return this.lName;
    }
    
    public String getTel() {
        return this.tel;
    }
    
    public LocalDate getCreationDate() {
        return this.creationDate;
    }
    
    public Address getAddress() {
        return this.address;
    }

    public void viewCoupon(){
        coupons = new Coupon();
        coupons.display();
    }

    public void viewMycoupon(){
        System.out.println("== MyCoupon ==");
        for(Coupon aCoupon : myCoupon) System.out.println(aCoupon);
    }

    public void collectCoupon(int coupon_id){    
        if(coupons.findCoupon(coupon_id) != null){ myCoupon.add(coupons.add_coupon(coupon_id)); }
        else { System.out.println("---Coupon not found---");}
    
        // for(Coupon aCoupon : coupons){
        //     if(coupon_id == aCoupon.getCoupon_id()){ myCoupon.add(aCoupon);}
        //     else { System.out.println("Coupon not found");}
        // }
    }

    
    public  Coupon  findMycoupon(int coupon_id){
        for(Coupon aCoupon : myCoupon){
            if(aCoupon.getCoupon_id() == coupon_id){
                return aCoupon;
            }
        }
        return null;
    }
    
    public void useCoupon(int coupon_id){
        for(Coupon aCoupon : myCoupon){
            if(aCoupon.getCoupon_id() == coupon_id){
                myCoupon.remove(aCoupon);
                System.out.println("---use coupon successfully---");
                break;
            } else { System.out.println("---coupon not found---"); }
        }
        
    }

    public void viewProduct(){
        products = new Product();
        products.display();
    }

    public void buyProduct(int order_id, int product_id, int qty){
        if(products.findProduct(product_id) != null){ 
            Order order = new Order(order_id, LocalDate.of(2023, 4, 2), OrderStatus.unpaid);
            order.add_Product(products.add_Product(product_id), qty);

            System.out.println("== TAKER ==");
            int i = 1;
            for(Taker aTaker : takers){ 
                System.out.print(i + " : " ); aTaker.display(); 
                i++;
                // aTaker.display();
            }
            if(takers.size() != 0){

                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter UserId the taker you select : ");
                int takerId = sc.nextInt();
                for(Taker aTaker : takers){ 
                    if(aTaker.getUserId() == takerId){
                        // this.taker = aTaker;
                        order.chooseTaker(aTaker);
                    }
                }
                myOrder.add(order);
                System.out.println("---Buy product successfully---");
            } else System.out.println("---Can't buy this product---");
        }
    }
    
    public void ViewMyorder(){
        System.out.println(myOrder);
    }

    public void addtoList(Taker tacker){
        takers.add(tacker);
    }


    // public void showAllTakers(){
    //     // int i = 1;
    //     for(Taker aTaker : takers){ 
    //         // System.out.println(/*i + " : " + aTaker.display()*/aTaker); 
    //         aTaker.display();
    //     }
    // }

    // public Account getAccount() {
    //     return this.account;
    // }

    @Override
    public String toString() {
        return "userID : " + getUserId() + "\nfirst name : " + getfName() + "\nlast name : " + getlName() +
         "\ntel : " + getTel() + "\naddress : " + getAddress() + /*"\naccount: " + getAccount() +*/ 
         "\ncreation date : " + getCreationDate();
    }
}

// public class User {
//     private int userId;
//     private String fName;
//     private String lName;
//     private String tel;
//     private Address address;
//     private Account account;
//     private LocalDate creationDate;
//     User(int userId, String fName, String lName, String tel, Address address, Account acc){
//         this.userId = userId;
//         this.fName = fName;
//         this.lName = lName;
//         this.tel = tel;
//         this.address = address;
//         this.account = acc;
//         this.creationDate = LocalDate.now();
//     }
//     public Address getAddress(){
//         return address;
//         // return address.getAddress();
//     }
//     public Account getAccount(){
//         return account;
//     }
//     @Override
//     public String toString(){
//         return "userID : " + userId + "\nfirst name : " + fName + "\nlast name : " + lName +
//          "\ntel : " + tel + "\naddress - " + address + "\naccount - "+ account + 
//          "\ncreationDate : " + creationDate;
//     }
//     // ซื้อ
// }
