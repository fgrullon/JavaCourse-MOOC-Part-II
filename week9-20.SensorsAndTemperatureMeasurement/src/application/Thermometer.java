/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Grullon
 */
public class Thermometer implements Sensor{
    private Random randint;
    private boolean state;
    
    public Thermometer(){
        this.randint = new Random();
        this.state = false;
    }

    @Override
    public boolean isOn() {
        if(this.state){
            return true;
        }else{
            return false;
        } 
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        
        if(this.isOn()){
            return  randint.nextInt(30 + 1 + 30) - 30;
        }else{
            throw new IllegalStateException();
        }

    }
    
}
