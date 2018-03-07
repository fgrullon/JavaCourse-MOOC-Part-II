/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Grullon
 */
public class Analysis {
    private File file;
    
    public Analysis(File file){
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        int counter = 0;
        
        while(reader.hasNextLine()){
            reader.nextLine();
            counter++;
        }
        return counter;
    }
    
    public int characters() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        String line = "";
        int counter = 0;
        while(reader.hasNextLine()){
            line = reader.nextLine();
            for(int i = 0; i <= line.length(); i++){
                counter++;
            }
        }
        return counter;
    }
    
}
