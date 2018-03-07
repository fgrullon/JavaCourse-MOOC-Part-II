
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Box implements ToBeStored{
    private ArrayList<ToBeStored> box;
    private double maxWeight;
    
    public Box(double maxWeight){
        this.box = new ArrayList<ToBeStored>();
        this.maxWeight = maxWeight;
    }
    
    public double weight(){
        double weight = 0;
        for(ToBeStored TBS : box){
            weight += TBS.weight();
        }
        
        return weight; 
    }
    
    public void add(ToBeStored item){
        if(this.weight() + item.weight() <= this.maxWeight){
            this.box.add(item);
        }
    }
    
    public String toString(){
        return "Box: "+this.box.size()+" things, total weight "+this.weight()+" kg"; 
    }
    
}
