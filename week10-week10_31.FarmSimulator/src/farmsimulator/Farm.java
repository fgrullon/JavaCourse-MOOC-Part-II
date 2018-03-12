/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grullon
 */
public class Farm implements Alive{
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    

    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    
    @Override
    public void liveHour() {
        for(Cow cow : this.cows){
            cow.liveHour();
        }
    }
    
    public void manageCows(){
        this.barn.takeCareOf(this.cows);
    }
    
    public String getOwner(){
        return this.owner;
    }
    
    public String getCows(){
        if(this.cows.size() == 0){
            return "No cows."; 
        }else{
            String cows = "Animals: \n";
            for(Cow cow : this.cows){
                cows += "        "+cow+"\n";
            }
            
            return cows;
        }
    }
    
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.barn.installMilkingRobot(milkingRobot);
    }
    
    @Override
    public String toString(){
        return "Farm owner: "+this.owner+"\nBarn bulk tank: "+this.barn.toString()+"\n"+getCows();
    }
    
}
