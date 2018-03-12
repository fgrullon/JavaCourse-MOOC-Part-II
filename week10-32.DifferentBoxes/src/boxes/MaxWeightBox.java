/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grullon
 */
public class MaxWeightBox extends Box{
    private int maxWeightBox;
    private List<Thing> things;
    
    public MaxWeightBox(int maxWeightBox){
        this.maxWeightBox = maxWeightBox;
        this.things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(getThingsWeight() + thing.getWeight() <= this.maxWeightBox){
            this.things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.things.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
    
    public int getThingsWeight(){
        int weight = 0;
        for(Thing t : this.things){
           weight+= t.getWeight();
        }
        
        return weight;
    }
    
}
