public class Main {
    public static void main(String[] args) {
       
        Account A = new Account("AA", "12345", new User(111, "AA", "Ditt", "0999999999", new Address("Thailand", "Bangkok", "Latkrabang", "Latkrabang", "10520")));
        Account jj = new Account("mm", "12345", new User(112, "MM", "Fish", "0999999999", new Address("Thailand", "Bangkok", "Latkrabang", "Latkrabang", "10520")));
        Account B = new Account("BB", "12345", new User(112, "BB", "Fish", "0999999999", new Address("Thailand", "Bangkok", "Latkrabang", "Latkrabang", "10520")));
        
        
        // Apply to taker
        A.RegisterToTaker(123456789);
        jj.RegisterToTaker(789456123);
        B.RegisterToTaker(321654987);
        
        
        // View All coupons
        A.showCoupons();

        // Collect coupon
        A.collectCoupon(4);

        // View My coupon
        A.showMycoupon();
        
        A.useCoupon(4);
        A.showMycoupon();

        // View All Products
        A.showProducts();

        // Buy products
        A.buyProduct(1, 3, 2);

        
        

    }
}
