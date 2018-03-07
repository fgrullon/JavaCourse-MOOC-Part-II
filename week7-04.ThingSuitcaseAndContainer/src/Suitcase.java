
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
public class Suitcase {
    private ArrayList<Thing> things;
    private final int maxWeight;
    
    public Suitcase(int maxWeight){
        things = new ArrayList<Thing>();
        this.maxWeight = maxWeight;
    }
    
    public void addThing(Thing thing){

        if((this.totalWeight() + thing.getWeight() <= this.maxWeight)){
            things.add(thing);
        }
                
    }
    
    public String toString(){
        if(things.size() == 1){
            return this.things.size()+" thing ("+this.totalWeight()+" kg)";
        }else if(things.size() >= 1){
             return this.things.size()+" things ("+this.totalWeight()+" kg)";
        }else{
            return "empty (0 kg)";
        }
       
    }
    
    public int totalWeight(){
        int weight = 0;
        for(Thing t : this.things){
            weight += t.getWeight();
        }
        
        return weight;
    }
    
    public void printThings(){
        for(Thing t : this.things){
            System.out.println(t);
        }
    }
    
    public Thing heaviestThing(){
        int index = 0;
        int size = 0;
       
        
            for(Thing t : this.things){
                if(t.getWeight() > size){
                   size = t.getWeight(); 
                   index = this.things.indexOf(t);
                }
           }
        
       if(this.things.size() > 0){
        return this.things.get(index);
       }else{
           return null;
       }
    }
    
    
}
