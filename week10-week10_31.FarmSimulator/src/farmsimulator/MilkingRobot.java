/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author Grullon
 */
public class MilkingRobot {
    private BulkTank bulktank;
    
    
    public BulkTank getBulkTank(){
        if(this.bulktank == null){
            return null;
        }else{
            return this.bulktank;
        }   
    }
    
    public void setBulkTank(BulkTank tank){
        this.bulktank = tank;
    }
    
    public void milk(Milkable milkable){
        if(this.bulktank == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }else{
          double amount=  milkable.milk();
          this.bulktank.addToTank(amount);
        }
        
    }
}
