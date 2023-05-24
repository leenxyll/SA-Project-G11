public class Address{
    private String country;
    private String province;
    private String district;
    private String subDistrict;
    private String postCode;
    Address(String cntry, String pv, String dis, String subDis, String pCode){
        this.country = cntry;
        this.province = pv;
        this.district = dis;
        this.subDistrict = subDis;
        this.postCode = pCode;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String cntry){
        this.country = cntry;
    }
    public String toString(){
        return "Country : " + country + " Province : " + province + " District : " + district + " SubDistrict : " + subDistrict + " PostCode : " + postCode;
    }
}