package io.turntabl;

public class Stocks extends Product {
    private String exchange;
    private String tinker;
    private ProductPricingService productPricingService;


    public Stocks(String pid, double cPrice) {
        super(pid, cPrice);
    }

    public Stocks(String pid, double cPrice, String exchange, String tinker) {
        super(pid, cPrice);
        this.exchange = exchange;
        this.tinker = tinker;
        setcPrice(productPricingService.price(this.exchange,this.tinker));
    }

    public Stocks() {
        super();
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getTinker() {
        return tinker;
    }

    public void setTinker(String tinker) {
        this.tinker = tinker;
    }

    public ProductPricingService getProductPricingService() {
        return productPricingService;
    }


}


