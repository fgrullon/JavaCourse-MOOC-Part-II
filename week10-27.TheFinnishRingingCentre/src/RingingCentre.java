
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class RingingCentre {
    private Map<Bird, ArrayList<String>> observations;
    
    public RingingCentre(){
        this.observations = new HashMap<Bird, ArrayList<String>>();
    }
    
    
    public void observe(Bird bird, String place){ 
        Bird bird1 = null;
        for(Bird b : this.observations.keySet()){
            if(b.hashCode() == bird.hashCode()){
                bird1 = b;
            }
        }
                
        if(bird1 == null){
            this.observations.put(bird, new ArrayList<String>());
            this.observations.get(bird).add(place);
        }else{
            this.observations.get(bird1).add(place);
        }
        
    }

    
    public void observations(Bird bird){
        boolean found = false;
        for(Bird b : this.observations.keySet()){
            if(b.equals(bird)){
                found = true;
                System.out.println(b+" observations: "+this.observations.get(b).size());
                for(String place : this.observations.get(b)){
                    System.out.println(place);
                }
            }  
        }
        
        if(!found){
            System.out.println(bird+" observations: 0");
        }
        
    }
    

    

    

}
