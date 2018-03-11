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
public class ContainerHistory {
    private List<Double> containerHistory;
    
    public ContainerHistory(){
        this.containerHistory = new ArrayList<Double>();
    }
    
    public void add(double situation){
        this.containerHistory.add(situation);
    }
    
    public void reset(){
        this.containerHistory.clear();
    }
    
    public String toString(){
        return this.containerHistory.toString();
    }
    
    public double maxValue(){
        if(this.containerHistory.size() == 0){
            return 0;
        }else{
            double value = this.containerHistory.get(0);
            for(Double d : this.containerHistory){
                if( d >  value){ value = d;}
            }
            
            return value;
        }
    }
    
    public double minValue(){
        if(this.containerHistory.size() == 0){
            return 0;
        }else{
            double value = this.containerHistory.get(0);
            for(Double d : this.containerHistory){
                if( d <  value){ value = d;}
            }
            
            return value;
        }
    }
    
    public double average(){
        double sum = 0.0;
        for(Double d : this.containerHistory){
            sum += d;
        }
        return sum / this.containerHistory.size();
        
    }
    
    public double greatestFluctuation(){
        if(this.containerHistory.size() <= 1){
            return 0.0;
        }else{
            double fluc = Math.abs(this.containerHistory.get(0) - this.containerHistory.get(1));
            for(int i = 1; i < this.containerHistory.size(); i++){
                double value = Math.abs(this.containerHistory.get(i) - this.containerHistory.get(i-1));
                if(fluc < value){
                    fluc = value;
                } 
            }
            return fluc;
        }  
    }
    
    public double variance(){
        double average = average();
        double sum = 0.0;
        for(Double d : this.containerHistory){
            double value = d - average;
            sum += Math.pow(value, 2);
        }
       
        return sum / (this.containerHistory.size() - 1);
    }
}
