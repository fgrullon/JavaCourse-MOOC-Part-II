/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grullon
 */
public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing> box;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.box = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if(this.getVolume() + thing.getVolume() <= this.maximumCapacity){
            this.box.add(thing);
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public int getVolume() {
        int volume = 0;
        for(Thing t : box){
            volume += t.getVolume();
        }
        return volume;
    }
    
    public String toString(){
        return "  things in the box: "+this.getVolume()+" dm^3";
    }
}
