package io.turntabl;

public class Futures extends Product {
    private String exchange;
    private String contractCodel;
    private int month;
    private int year;
    private ProductPricingService productPricingService;

    public Futures(String pid, double cPrice,String exchange,String contractCodel,int month,int year){
        super(pid, cPrice);
        this.exchange=exchange;
        this.contractCodel=contractCodel;
        this.month=month;
        this.year=year;
        setcPrice(productPricingService.price(this.exchange,this.contractCodel,this.month,this.year));

    }

    public Futures(String pid, double cPrice) {
        super(pid, cPrice);
    }

    public Futures() {

    }
}
