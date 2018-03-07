
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class ShoppingBasket {
    private Map<String, Purchase> basket;
    
    public ShoppingBasket(){
        basket = new HashMap<String, Purchase>();
    }
    
    public void add(String product, int price){
        if(!this.basket.containsKey(product)){
            this.basket.put(product, new Purchase(product, 1, price));
        }else{
            increaseAmount(product);
        }
        
    }
    
    public int price(){
        int price = 0;
        for(Purchase p : this.basket.values()){
            price += p.price();
        }
        return price;
    }
    
    public void print(){
        for(Purchase p: this.basket.values()){
            System.out.println(p.toString());
        }
    }
    
    public void increaseAmount(String product){
        this.basket.get(product).increaseAmount();
        
        
    }
    
}
