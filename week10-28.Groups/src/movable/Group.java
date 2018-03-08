/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grullon
 */
public class Group implements Movable{
    private List<Movable> group;
    
    public Group(){
        this.group = new ArrayList<Movable>();
    }
    
    public String toString(){
        String group = "";
        for(Movable m : this.group){
            group += m.toString()+"\n";
        }
        
        return group;
    }
    
    public void addToGroup(Movable movable){
        this.group.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable m : this.group){
            m.move(dx, dy);
        }
    }
    
}
