/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Calculator {
    private Reader reader;
    private int times;
    
    public Calculator(){
        reader = new Reader();
        times = 0;
    }
    
    public void start(){
        while(true){
            System.out.print("command: ");
            String command = reader.readString();
            if(command.equals("end")){
                break;
            }
            
            if(command.equals("sum")){
                sum();
            }else if(command.equals("difference")){
                difference();
            }else if(command.equals("product")){
                product();
            }
            
        }
        statistics();
    }
    
    private void sum(){
        this.times++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int result = value1 + value2;
        
        System.out.println("sum of the values "+result);
    }
    
    private void product(){
        this.times++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        
        int result = value1 * value2;
        
        System.out.println("product of the values "+result);
    }
    
    private void difference(){
        this.times++;
        System.out.print("value1: ");
        int value1 = reader.readInteger();
        System.out.print("value2: ");
        int value2 = reader.readInteger();
        int result = value1 - value2;
          

        
        System.out.println("difference of the values "+result);
    }
    
    private void statistics(){
        System.out.println("Calculations done "+times);
    }
}
