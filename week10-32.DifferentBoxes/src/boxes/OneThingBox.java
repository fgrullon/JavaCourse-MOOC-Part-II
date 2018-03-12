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
public class OneThingBox extends Box{
    private List<Thing> thing;
    
    public OneThingBox(){
        this.thing = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(this.thing.isEmpty()){
            this.thing.add(thing);   
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(this.thing.contains(thing)){
            return true;
        }else{
            return false;
        }
    }
    
}
