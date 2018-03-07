/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Grullon
 */
public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary {
    private Map<String, Set<String>> dictionary;
    
    public PersonalMultipleEntryDictionary(){
        this.dictionary = new HashMap<String, Set<String>>();    
    }

    @Override
    public void add(String word, String entry) {
        
        if(!exist(word)){
            this.dictionary.put(word, new HashSet<String>());
        }

        this.dictionary.get(word).add(entry);
    }

    @Override
    public Set<String> translate(String word) {
        Set<String> translations = new HashSet<String>();
        if(exist(word)){
            for(String s : this.dictionary.get(word)){
                translations.add(s);
            }
        }else{
            return null;
        }
       
        return translations;
    }

    @Override
    public void remove(String word) {
        if(exist(word)){
            this.dictionary.remove(word);
        }

    }
    
    public boolean exist(String word){
        return this.dictionary.containsKey(word);
    }
    
}
