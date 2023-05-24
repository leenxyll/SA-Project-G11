import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Coupon {
    private int coupon_id;
    private String coupon_name;
    private String coupon_description;
    private String coupon_type;
    private LocalDateTime coupon_startDate;
    private LocalDateTime coupon_endDate;
    private int coupon_taked;
    public int product_ordered;

    private static List<Coupon> cpns = new ArrayList<Coupon>();

    Coupon() {
        getCoupon();
    }

    private Coupon(int coupon_id, String coupon_name, String coupon_description, String coupon_type,
            LocalDateTime coupon_startDate, LocalDateTime coupon_endDate, int coupon_taked) {
        this.coupon_id = coupon_id;
        this.coupon_name = coupon_name;
        this.coupon_description = coupon_description;
        this.coupon_type = coupon_type;
        this.coupon_startDate = coupon_startDate;
        this.coupon_endDate = coupon_endDate;
        this.coupon_taked = coupon_taked;
    }

    public void display() {
        LocalDateTime currenttime = LocalDateTime.now();

        System.out.println("== COUPON ==");
        for (Coupon aCpns : cpns) {
            if (aCpns.coupon_taked != 0 && currenttime.isAfter(aCpns.coupon_endDate)) {

                System.out.println(aCpns);
            }
        }
    }

    public Coupon findCoupon(int couponId) {
        LocalDateTime currenttime = LocalDateTime.now();
        for (Coupon aCpns : cpns) {
            if (couponId == aCpns.getCoupon_id() && aCpns.coupon_taked != 0
                    && currenttime.isAfter(aCpns.coupon_endDate))
                return aCpns;
        }
        return null;
    }

    private static void getCoupon() {
        cpns.add(new Coupon(1, "van jj", "jj laijai", "Fashion", LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2024, 03, 21, 12, 2, 2), 10));
        cpns.add(new Coupon(2, "a", "aa", "Fashion", LocalDateTime.of(2022, 06, 11, 12, 2, 2),
                LocalDateTime.of(2024, 06, 21, 12, 2, 2), 5));
        cpns.add(new Coupon(3, "b", "bbi", "Food", LocalDateTime.of(2022, 04, 11, 12, 2, 2),
                LocalDateTime.of(2024, 04, 21, 12, 2, 2), 7));
        cpns.add(new Coupon(4, "c", "cc", "Food", LocalDateTime.of(2022, 07, 11, 12, 2, 2),
                LocalDateTime.of(2024, 07, 21, 12, 2, 21), 7));
        cpns.add(new Coupon(5, "d", "dd", "Fashion", LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2024, 03, 21, 12, 2, 2), 0));
    }

    public Coupon add_coupon(int coupon_id) {
        for (Coupon aCpns : cpns) {
            if (aCpns.coupon_id == coupon_id && aCpns.coupon_taked != 0) {
                aCpns.coupon_taked--;
                return aCpns;
            }
        }
        return null;
    }

    public void delete_coupon_datetime() {

        LocalDateTime currenttime = LocalDateTime.now();

        for (Coupon acpns : cpns ){
            if (currenttime.isAfter(acpns.coupon_endDate)) {
                acpns.delete_coupon(acpns.coupon_id);
            }
        }
    }

    public void delete_coupon(int coupon_id) {
        cpns.remove(coupon_id);
        System.out.println("Removing Coupon id :" + coupon_id);
    }

    public int getCoupon_id() {
        return this.coupon_id;
    }

    public void setCoupon_id(int coupon_id) {
        this.coupon_id = coupon_id;
    }

    public String getCoupon_name() {
        return this.coupon_name;
    }

    public void setCoupon_name(String coupon_name) {
        this.coupon_name = coupon_name;
    }

    public String getCoupon_description() {
        return this.coupon_description;
    }

    public void setCoupon_description(String coupon_description) {
        this.coupon_description = coupon_description;
    }

    public String getCoupon_type() {
        return this.coupon_type;
    }

    public void setCoupon_type(String coupon_type) {
        this.coupon_type = coupon_type;
    }

    public LocalDateTime getCoupon_startDate() {
        return this.coupon_startDate;
    }

    public void setCoupon_startDate(LocalDateTime coupon_startDate) {
        this.coupon_startDate = coupon_startDate;
    }

    public LocalDateTime getCoupon_endDate() {
        return this.coupon_endDate;
    }

    public void setCoupon_endDate(LocalDateTime coupon_endDate) {
        this.coupon_endDate = coupon_endDate;
    }

    public int getCoupon_taked() {
        return this.coupon_taked;
    }

    public void setCoupon_taked(int coupon_taked) {
        this.coupon_taked = coupon_taked;
    }

    public int getProduct_ordered() {
        return this.product_ordered;
    }

    public void setProduct_ordered(int product_ordered) {
        this.product_ordered = product_ordered;
    }

    @Override
    public String toString() {
        return coupon_id + " : " + coupon_name + "\t( " + coupon_description + " ) " + "\tStart : " + coupon_startDate
                + "\tEnd : " + coupon_endDate + "\t qty : " + coupon_taked;
    }

}
