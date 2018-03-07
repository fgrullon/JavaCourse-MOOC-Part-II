
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    private int weight;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList();
        this.weight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){

        if((this.weight + suitcase.totalWeight() <= this.maxWeight)){
                this.suitcases.add(suitcase);
                this.weight += suitcase.totalWeight();
        }
    }
    
    public String toString(){

        if(this.suitcases.size() >= 1){
             return this.suitcases.size()+" suitcases ("+this.weight+" kg)";
        }else{
            return "empty (0 kg)";
        }
    }
    
    public void printThings(){
        for(Suitcase s: suitcases){
            s.printThings();
        }
    }
    
    
}
