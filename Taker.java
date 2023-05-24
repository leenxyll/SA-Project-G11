public class Taker extends User {
    private int idCard;

    public Taker(User user, int idCard) {
        super(user.getUserId(), user.getfName(), user.getlName(), user.getTel(), user.getAddress());

        this.idCard = idCard;
        user.addtoList(this);
        // takers.add(this);
    }

    // public void addtoList(){
    // takers.add(this);
    // }

    private int getIdCard() {
        return idCard;
    }

    public void display() {
        System.out.println("UserID : " + this.getUserId() + "\tName : " + this.getfName() + "\t" + this.getlName());
    }

    @Override
    public String toString() {
        return "userID: " + getUserId() + "\nfirst name: " + getfName() + "\nlast name: " + getlName() +
                "\ntel: " + getTel() + "\naddress: " + getAddress() + "\naccount: " +
                "\ncreation date: " + getCreationDate() + "\nId card : " + getIdCard();
    }
}
/*
 * public class Taker extends User {
 * private int idCard;
 * 
 * public Taker(int userId, String fName, String lName, String tel, Address
 * address, Account account, int idCard) {
 * super(userId, fName, lName, tel, address, account);
 * this.idCard = idCard;
 * }
 * 
 * public Taker(User user, int idCard) {
 * super(user.getUserId(), user.getfName(), user.getlName(), user.getTel(),
 * user.getAddress(), user.getAccount());
 * this.idCard = idCard;
 * }
 * 
 * public int getIdCard() {
 * return idCard;
 * }
 * 
 * public void setIdCard(int idCard) {
 * this.idCard = idCard;
 * }
 * 
 * @Override
 * public String toString() {
 * return "userID: " + getUserId() + "\nfirst name: " + getfName() +
 * "\nlast name: " + getlName() +
 * "\ntel: " + getTel() + "\naddress: " + getAddress() + "\naccount: " +
 * getAccount() +
 * "\ncreation date: " + getCreationDate() + "\nId card : " + getIdCard();
 * }
 * }
 */

// ----------------------------------------------------------------
// public class Taker extends User {
// private int idCard;
// Taker(int userId, String fName, String lName, String tel, Address address,
// Account acc, int idCard) {
// super(userId, fName, lName, tel, address, acc);
// this.idCard = idCard;
// //TODO Auto-generated constructor stub
// }

// Taker(User user, int idCard){
// super(userId, fName, lName, tel, address, acc);
// this.idCard = idCard;
// }

// }
