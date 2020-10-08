package io.turntabl;
import  java.util.HashMap;

public class MontrealTradeApp implements MontrealTradedProducts {
    HashMap<String,Product> Products=new HashMap<>();
    HashMap<String,Integer> Trade=new HashMap<>();
    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {
        if (this.Products.containsKey(product.getPid())){
            throw new ProductAlreadyRegisteredException("This product already exists");
        }else{
            Products.put(product.getPid(),product);
        }
    }

    @Override
    public void trade(Product product, int quantity) {
        Integer pQuantity=this.Trade.getOrDefault(product.getPid(),0);
        this.Trade.put(product.getPid(), pQuantity+quantity);
    }

    @Override
    public int totalTradeQuantityForDay() {
        int totalQuantity=0;
        for(String key:this.Trade.keySet()){
            totalQuantity+=this.Trade.get(key);
        }
        return totalQuantity;
    }

    @Override
    public double totalValueOfDaysTradedProducts() {
        double Total=0;
        for(String key: this.Trade.keySet()){
            Integer quantity=this.Trade.get(key);
            double cPrice=this.Products.get(key).getcPrice();
            Total+=cPrice*quantity;
        }
        return Total;
    }
}
