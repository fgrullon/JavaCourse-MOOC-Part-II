/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

import java.util.Random;

/**
 *
 * @author Grullon
 */
public class Cow implements Milkable, Alive{
    private double udderCapacity;
    private String name;
    private double available;
    
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Cow(){
        this(NAMES[0 + new Random().nextInt(30)]);
    }
    
    public Cow(String name){
        this.name = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getCapacity(){
        return this.udderCapacity;
    }
    
    public double getAmount(){
        return this.available;
    }
    
    @Override
    public String toString(){
        return this.name+" "+Math.ceil(this.available)+"/"+Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double amount = this.available;
        this.available = 0;
        return amount;
    }

    @Override
    public void liveHour() {
        double now = 0.7 + new Random().nextInt(2);
        if(this.available + now > this.udderCapacity){
            this.available = this.udderCapacity;
        }else{
            this.available += now;
        }
    }
}
