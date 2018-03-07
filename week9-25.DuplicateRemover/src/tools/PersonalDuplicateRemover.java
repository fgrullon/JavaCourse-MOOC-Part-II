/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Grullon
 */
public class PersonalDuplicateRemover implements DuplicateRemover{
    private int amount;
    private Set<String> characters;
    
    public PersonalDuplicateRemover(){
        this.amount = 0;
        this.characters = new HashSet<String>();
        
    }

    @Override
    public void add(String characterString) {
        if(exist(characterString)){
            this.amount++;
        }else{
            this.characters.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.amount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.characters;
    }

    @Override
    public void empty() {
        this.characters.clear();
        this.amount = 0;
    }
    
    public boolean exist(String character){
        return this.characters.contains(character);
    }
    
}
