/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Collection;

/**
 *
 * @author Grullon
 */
public class Barn {
    private BulkTank tank;
    private MilkingRobot milkingRobot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        if(tank == null){
            return null;
        }else{
            return tank;
        }
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        this.milkingRobot = milkingRobot;
        this.milkingRobot.setBulkTank(this.tank);
    }
    
    public void takeCareOf(Cow cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }else{
          this.milkingRobot.milk(cow);
        }    
    }
    
    public void takeCareOf(Collection<Cow> cow){
        if(this.milkingRobot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }else{
            for(Cow c : cow){
                this.milkingRobot.milk(c);
            }
        }  
    }
    
    public String toString(){
        return tank.toString();
    }
    
}
