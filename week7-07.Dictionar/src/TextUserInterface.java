
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
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void add(){
        System.out.print("In Finnish: ");
        String finnish = reader.nextLine();
        System.out.print("Translation: ");
        String translation = reader.nextLine();
        
        if(!finnish.isEmpty() && !translation.isEmpty()){
            this.dictionary.add(finnish, translation);
        }
    }
    
    public void translate(){
        System.out.print("Give a word: ");
        String word = reader.nextLine();
        if(!word.isEmpty()){
            System.out.println("Translation: "+this.dictionary.translate(word));
        }
        

    }
    
    public void start(){
        System.out.println("Statements:");
        System.out.println("add - adds a word pair to the dictionary");
        System.out.println("translate - asks a word and prints its translation");
        System.out.println("quit - quit the text user interface");
        System.out.println("");
        while(true){
            System.out.print("Statement: ");
            String command = reader.nextLine().trim();
            
            if(command.equalsIgnoreCase("quit")){
                System.out.println("Cheers!");
                break;
            }else if(command.equalsIgnoreCase("add")){
                add();
            }else if(command.equalsIgnoreCase("translate")){
                translate();
            }else{
                System.out.println("Unknown statement");
            }
        
        }
    }
    
    
    
}
