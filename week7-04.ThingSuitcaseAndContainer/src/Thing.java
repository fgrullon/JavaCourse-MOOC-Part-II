/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Thing {
    private String thingName;
    private int thingWeight;
    
    public Thing(String thingName, int thingWeight){
        this.thingName = thingName;
        this.thingWeight = thingWeight;
    }
    
    public String getName(){
        return this.thingName;
    }
    
    public int getWeight(){
        return this.thingWeight;
    }
    
    public String toString(){
        return this.thingName+" ("+this.thingWeight+" kg)";
    }
    
}
