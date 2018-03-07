
import java.util.ArrayList;
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
public class Tournament {
    private Scanner reader;
    private ArrayList<Jumper> jumpers;
    
    public Tournament(Scanner reader){
        this.reader = reader;
        this.jumpers = new ArrayList<Jumper>();
        
    }
    
    public void begin(){
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        
        while(true){
            System.out.print("  Participant name: ");
            String jumper = reader.nextLine();
            if(jumper.isEmpty()){
                break;
            }else{
                jumpers.add(new Jumper(jumper));
            }
        }
        
        System.out.println("");
        System.out.println("The tournament begins!");
        startTournament();
    }
    
    public void startTournament(){
        Round round = new Round(jumpers, reader);
        round.startRound();
    }
    
    
    
}
