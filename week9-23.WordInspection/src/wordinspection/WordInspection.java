/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Grullon
 */
public class WordInspection {
    private File file;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        int counter = 0;
        
        while(reader.hasNextLine()){
            counter++;
            reader.nextLine();
        }
        return counter;
    }
    
    public List<String> wordsContainingZ() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> list = new ArrayList<String>();
        String word = "";
        
        while(reader.hasNextLine()){
                word = reader.nextLine();
                if(word.contains("z")){
                    list.add(word);
                }
            
        }
        
        return list;
    
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> list = new ArrayList<String>();
        char end = 'l';

        
        while(reader.hasNextLine()){
                String word = reader.nextLine();
                char letter =  word.charAt(word.length() - 1); 
                if(letter == end){
                    list.add(word);
                }
            
        }
        
        return list;
    }
    
    public List<String> palindromes() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while(reader.hasNextLine()){
                String word = reader.nextLine();
                String reverseWord = "";
                for(int i = word.length() - 1; i >= 0; i--){
                    reverseWord += word.charAt(i);
                }
                
                if(word.equals(reverseWord)){
                    list.add(word);
                }
        }
        
        return list;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner reader = new Scanner(this.file, "UTF-8");
        List<String> list = new ArrayList<String>();
        
        while(reader.hasNextLine()){
                String word = reader.nextLine();
                if(word.contains("a") && 
                        word.contains("e") && 
                        word.contains("i") && 
                        word.contains("o") && 
                        word.contains("u") && 
                        word.contains("y") && 
                        word.contains("ä") && 
                        word.contains("ö")){
                    list.add(word);
                }
            
        }
        
        return list;
    }
}
