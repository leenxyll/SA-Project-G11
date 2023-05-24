import java.time.*;
import java.util.ArrayList;
import java.util.List;

class Product {
    private int product_id;
    private String product_name;
    private double product_price;
    private String detail_product;
    private String product_type;
    private int product_disPrice;
    private LocalDateTime product_startDate;
    private LocalDateTime product_endDate;
    private int product_ordered;

    private static List<Product> pdts = new ArrayList<Product>();

    Product() {
        getproduct();
    }

    private Product(int product_id, String product_name, double product_price, String detail_product,
            String product_type, int product_disPrice, LocalDateTime product_startDate, LocalDateTime product_endDate,
            int product_ordered) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_price = product_price; // ราคาเต็ม
        this.detail_product = detail_product;
        this.product_disPrice = product_disPrice; // ราคาลด
        this.product_startDate = product_startDate;
        this.product_endDate = product_endDate;
        this.product_ordered = product_ordered;
    }

    private static void getproduct() {
        pdts.add(new Product(0, "a", 1500, "aa", "Fashion", 999, LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2022, 03, 21, 12, 2, 2), 0));
        pdts.add(new Product(1, "b", 1500, "bb", "Fashion", 999, LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2022, 03, 21, 12, 2, 2), 0));
        pdts.add(new Product(2, "c", 1500, "cc", "Tech", 999, LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2022, 03, 21, 12, 2, 2), 0));
        pdts.add(new Product(3, "d", 1500, "dd", "Home", 999, LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2022, 03, 21, 12, 2, 2), 0));
        pdts.add(new Product(4, "e", 1500, "ee", "Fashion", 999, LocalDateTime.of(2022, 03, 11, 12, 2, 2),
                LocalDateTime.of(2022, 03, 21, 12, 2, 2), 0));
    }

    public void display() {
        LocalDateTime currenttime = LocalDateTime.now();
        System.out.println("== PRODUCT ==");
        for (Product apdts : pdts) {
            if (currenttime.isAfter(apdts.product_endDate))
                System.out.println(apdts);
        }
    }

    public Product findProduct(int product_id) {
        LocalDateTime currenttime = LocalDateTime.now();
        for (Product aProduct : pdts) {
            if (product_id == aProduct.getProduct_id() && currenttime.isAfter(aProduct.product_endDate))
                return aProduct;
        }
        return null;
    }

    public Product add_Product(int product_id) {
        LocalDateTime currenttime = LocalDateTime.now();
        for (Product apdts : pdts) {
            if (apdts.product_id == product_id && currenttime.isAfter(apdts.product_endDate)) {
                apdts.product_ordered++;
                return apdts;
            }
        }
        return null;
    }

    public void delete_product_datetime() {

        LocalDateTime a = LocalDateTime.now();

        for (Product apdts : pdts) {
            if (a.isAfter(apdts.product_endDate)) {
                apdts.delete_product(apdts.product_id);
            }
        }
    }

    public void delete_product(int product_id) {
        pdts.remove(product_id);
        System.out.println("Removing Product id :" + product_id);
    }

    public int getProduct_id() {
        return this.product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public double getProduct_price() {
        return this.product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getDetail_product() {
        return this.detail_product;
    }

    public void setDetail_product(String detail_product) {
        this.detail_product = detail_product;
    }

    public String getProduct_type() {
        return this.product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public int getProduct_disPrice() {
        return this.product_disPrice;
    }

    public void setProduct_disPrice(int product_disPrice) {
        this.product_disPrice = product_disPrice;
    }

    public LocalDateTime getProduct_startDate() {
        return this.product_startDate;
    }

    public void setProduct_startDate(LocalDateTime product_startDate) {
        this.product_startDate = product_startDate;
    }

    public LocalDateTime getProduct_endDate() {
        return this.product_endDate;
    }

    public void setProduct_endDate(LocalDateTime product_endDate) {
        this.product_endDate = product_endDate;
    }

    public int getProduct_ordered() {
        return this.product_ordered;
    }

    public void setProduct_ordered(int product_ordered) {
        this.product_ordered = product_ordered;
    }

    @Override
    public String toString() {
        return product_id + " : " + product_name + "\t ( " + detail_product + " ) " + "\tPrice : " + product_price
                + "\tDiscount : " + product_disPrice + "\tStart : " + product_startDate + "\tEnd : " + product_endDate;
    }
}