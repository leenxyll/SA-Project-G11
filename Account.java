public class Account {
    private String userName;
    private String password;
    private User user;
    private Taker taker;
    private Boolean takerBool = false;
    private Boolean loginBool = true;
    // public final ArrayList<Taker> takers = new ArrayList<Taker>();

    Account(String userName, String pw, User user) {
        this.userName = userName;
        this.password = pw;
        this.user = user;
        System.out.println("---Register successfully---");
    }

    public void setUserName(String username) {
        this.userName = username;

    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        if (!takerBool) {
            return "UserName : " + userName + "\nPassword : " + password + "\n" + user;
        } else {
            return "UserName : " + userName + "\nPassword : " + password + "\n" + taker;
        }
    }

    public void RegisterToTaker(int idCard) {
        if (!takerBool) {
            this.taker = new Taker(this.user, idCard);
            // this.taker.addtoList();
            takerBool = true;
            // takers.add(this.taker);
            System.out.println("---Register to taker successfully---");
        } else {
            System.out.println("---This account is Taker---");
        }
    }

    public void LogOut() {
        if (loginBool) {
            this.loginBool = false;
            System.out.println("---Logout successfully---");
        } else {
            System.out.println("---Not logged in---");
        }
    }

    public void LogIn(String UsrName, String PW) {
        if (UsrName.equals(this.userName) && PW.equals(this.password)) {
            this.loginBool = true;
            System.out.println("---Login successfully---");
        } else {
            System.out.println("---User or password incorrect \n Please try again---");
        }
    }

    public void showCoupons() {
        this.user.viewCoupon();
    }

    public void showMycoupon() {
        this.user.viewMycoupon();
    }

    public void collectCoupon(int couponId) {
        this.user.collectCoupon(couponId);
    }

    public void useCoupon(int couponId) {
        this.user.useCoupon(couponId);
    }

    public void showMyorder() {
        this.user.ViewMyorder();
    }

        public void showProducts() {
        this.user.viewProduct();
    }

    public void buyProduct(int order_id, int product_id, int qty) {
        this.user.buyProduct(order_id, product_id, qty);
    }

    // public void chooseTaker(){
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
    // this.taker = aTaker;
    // }
    // }

    // }

    // private static Taker findTakerById(int takerId){
    // for(Taker aTaker : takers){
    // if(aTaker.getUserId() == takerId){
    // this.taker = aTaker;
    // }
    // }
    // }

}
