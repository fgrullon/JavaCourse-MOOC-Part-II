/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Grullon
 */
public class ProductContainerRecorder extends ProductContainer{
    private ContainerHistory containerHistory;
    
    
    public ProductContainerRecorder(String name, double capacity, double initialVolume) {
        super(name, capacity);
        this.containerHistory = new ContainerHistory();
        this.containerHistory.add(initialVolume);
        super.addToTheContainer(initialVolume);
        
    }
    
    public String history(){
        return this.containerHistory.toString();
    } 
    
    @Override
    public void addToTheContainer(double amount){ 
        super.addToTheContainer(amount);
        this.containerHistory.add(super.getVolume());
    }
    
    @Override
    public double takeFromTheContainer(double amount){
        
        amount = super.takeFromTheContainer(amount);
        this.containerHistory.add(super.getVolume());
        return amount;
    }
    
    public void printAnalysis(){
        
        System.out.println("Product: "+super.getName());
        System.out.println("History: "+this.containerHistory.toString());
        System.out.println("Greatest product amount: "+this.containerHistory.maxValue());
        System.out.println("Smallest product amount: "+this.containerHistory.minValue());
        System.out.println("Average: "+this.containerHistory.average());
        System.out.println("Greatest change: "+this.containerHistory.greatestFluctuation());
        System.out.println("Variance: "+this.containerHistory.variance());
        
    }
    
    
}
