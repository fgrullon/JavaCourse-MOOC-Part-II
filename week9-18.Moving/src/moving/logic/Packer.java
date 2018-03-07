/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.*;

/**
 *
 * @author Grullon
 */
public class Packer {
    private int boxesVolume;
    private ArrayList<Box> boxes;
    
    public Packer(int boxesVolume){
        this.boxesVolume = boxesVolume;
        this.boxes  = new ArrayList<Box>();
                
    }
    
    public List<Box> packThings(List<Thing> things){
        Box box = new Box(this.boxesVolume);
        for(Thing i : things){
            if(!box.addThing(i)){
                boxes.add(box);
                box = new Box(this.boxesVolume);
                box.addThing(i);
            }
        }
        boxes.add(box);
        return this.boxes;
    }
    
    
}
