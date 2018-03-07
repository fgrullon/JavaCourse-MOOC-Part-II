
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
public class Contact {
    private String name;
    private ArrayList<String> numbers;
    private String street;
    private String city;
    
    public Contact(String name){
        this.name = name;
        this.numbers = new ArrayList<String>();
        
    }   
    
    public Contact(String name, String number){
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.numbers.add(number);
    }
    
    public Contact(String name, String street, String city){
        this.name = name;
        this.numbers = new ArrayList<String>();
        this.street = street;
        this.city = city;
    }
        

    
    public String getName(){
        return this.name;
    }
    
    public ArrayList<String> getnumbers(){
        return this.numbers;
    }
    
    
    public void setNumber(String number){
        this.numbers.add(number);
    }
    
    public String getAddres(){
        if(this.city == null && this.street == null){
            return "unknown";
        }else {
            return this.street+" "+this.city;
        }

    }
    
    public void setAddress(String street, String city){
        this.street = street;
        this.city = city;
    }
    
}
