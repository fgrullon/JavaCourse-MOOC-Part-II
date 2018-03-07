
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
public class Changer {
    private ArrayList<Change> changes;
    
    public Changer(){
        changes = new ArrayList<Change>();
    }
    
    public void addChange(Change change){
        this.changes.add(change);
    }
    
    public String change(String  characterString){
        String result = characterString;
        for(Change c : this.changes){
            result = c.change(result);
        }
    
        return result;
    }
}
