
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Reader {
    private Scanner reader;
    
    public Reader(){
        reader = new Scanner(System.in);
    }
    
    public String readString(){
        
        String command = reader.nextLine().trim();
        
        return command;
    }
    
    public int readInteger(){
        int value = Integer.parseInt(reader.nextLine().trim());
    
        return value;
    }
}
