
import java.io.File;
import java.io.FileNotFoundException;
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
public class Printer {
    private File file;
 
    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException{
        Scanner reader = new Scanner(file, "UTF-8");
        String line = "";
            
        
            while(reader.hasNextLine()){   
                line = reader.nextLine();
                if(line.contains(word)){
                    System.out.println(line);
                }
            }

        

    }
}


