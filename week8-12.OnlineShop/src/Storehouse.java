
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Storehouse {
        private Map<String, Integer> products;
        private Map<String, Integer> stock;
        
    public Storehouse(){
        products = new HashMap<String, Integer>();
        stock = new HashMap<String, Integer>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.products.put(product, price);
        this.stock.put(product, stock);
    }
    
    public int price(String product){
        
        if(this.products.containsKey(product)){
            return this.products.get(product);
        }else{
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.stock.containsKey(product)){
            return this.stock.get(product);
        }else{
            return 0;
        }
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }
    
    public boolean take(String product){
        if(this.stock.containsKey(product) ){
            if(this.stock.get(product) > 0){
            int stock = this.stock.get(product) - 1;
            this.stock.put(product, stock);
            

            return true;
        }else{
            return false;
        }
            
        }else{
            return false;
        }
    }
    
}
