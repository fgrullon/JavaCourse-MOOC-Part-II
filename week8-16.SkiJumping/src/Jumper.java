
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
public class Jumper {
    private String name;
    private int points;
    private ArrayList<Integer> record;
    
    public Jumper(String name){
        this.name = name;
        this.points = 0;
        this.record = new ArrayList<Integer>();
    }
    
    public Jumper(String name, int points, ArrayList<Integer> record){
        this.name = name;
        this.points = points;
        this.record = record;
    }
    
    public String toString(){
        return this.name+" ("+this.points+" points)";
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setRecord(int distance){
        this.record.add(distance);
    }
    
    public String getRecord(){
        String r = "";
        for(int i : this.record){
            r += " "+i+" m,";
        }
       
        r = r.substring(0, r.length() - 1);
        return r;
    }
    
    public ArrayList record(){
        return this.record;
    }
    
    public int getPoints(){
        return this.points;
    }
}
