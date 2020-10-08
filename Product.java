package io.turntabl;

public class Product {
    private String pid;
    private double cPrice;

    public Product (String pid,double cPrice){
        this.pid=pid;
        this.cPrice=cPrice;
    }

    public Product() {

    }

    public String getPid() {
        return pid;
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setcPrice(double cPrice) {
        this.cPrice = cPrice;
    }


}
