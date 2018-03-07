/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Grullon
 */
public class AverageSensor implements Sensor{
    private List<Sensor> averageSensor;
    private List<Integer> measures;
    
    public AverageSensor(){
        this.averageSensor = new ArrayList<Sensor>();
        this.measures =  new ArrayList<Integer>();

    
    }

    public void addSensor(Sensor additional){
        this.averageSensor.add(additional);
    }
    
    @Override
    public boolean isOn() {
        for(Sensor sensor : this.averageSensor){
            if(!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for(Sensor sensor : this.averageSensor){
            if(!sensor.isOn()){
                sensor.on();
            }    
        }
    }

    @Override
    public void off() {
        for(Sensor sensor : this.averageSensor){
            if(sensor.isOn()){
                sensor.off();
            } 
        }
    }

    @Override
    public int measure() {
        if(!this.isOn()){
            throw new IllegalStateException();
        }
        
        int average = 0;
       
        for(Sensor sensor : this.averageSensor){
            average += sensor.measure();
        }
        
        average = average / this.averageSensor.size();
        this.measures.add(average);
        return average;
    }
    
    public List<Integer> readings(){
        
        return this.measures;
    }
}
