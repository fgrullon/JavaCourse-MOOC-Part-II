
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
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
public class Round {
    private List<Jumper> jumpers;
    private int rounds;
    private Random randint;
    private Scanner reader;
    
    public Round(List<Jumper> jumpers, Scanner reader){
        this.jumpers = jumpers;
        this.randint = new Random();
        this.rounds = 0;
        this.reader = reader;
    }
    
    public void jump(){
        this.rounds += 1;
        ArrayList<Integer> points = new ArrayList<Integer>();
        Collections.sort(this.jumpers, new SortPlayerByLowestPoints());
        System.out.println("Round "+this.rounds);
        System.out.println("");
        System.out.println("Jumping order: ");
        printJumpers();
        System.out.println("");
        System.out.println("Results of round "+this.rounds);
        for(Jumper J : this.jumpers){
            System.out.println("  "+J.getName());
            int distance = jumpDistance();
            J.setRecord(distance);
            System.out.println("    length: "+distance);
            points = judgesPoints();
            int total = J.getPoints() + sumPoint(points) + distance;
            int index = jumpers.indexOf(J);
            jumpers.set(index, new Jumper(J.getName(), total, J.record()));
            System.out.println("    judge votes: " +points);
            
            
        }
          
        
    }
    
    public  void results(){
        System.out.println("Thanks!");
        System.out.println("");
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        Collections.sort(this.jumpers, new SortPlayerByhHighestPoints());
        int counter = 1;
        for(Jumper j: this.jumpers){
            System.out.println(counter+"           "+j.toString());
            System.out.println("            jump lengths:"+j.getRecord());
            counter++;
        }
    }
    
    
    public void printJumpers(){
        int index = 1;
        for(Jumper j : jumpers){
            System.out.println("  "+index+". "+j.toString());
            index++;
        }
    }
    
    public void startRound(){
        
        while(true){
            System.out.println("");
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.nextLine();
            System.out.println("");
            
            if(command.equals("jump")){
                jump();
            }else {
                results();
                break;
            }
            
        }
    }
    

    
    public int sumPoint(ArrayList<Integer> points){
        Collections.sort(points);
        int sum = 0;
        for(int i = 1; i < 4; i++){
            sum += points.get(i);
        }
        
        return sum;
    }
    
    public ArrayList judgesPoints(){
        ArrayList<Integer> judgesPoint = new ArrayList<Integer>();
            for(int i =0; i < 5; i++){
                int newInt = randint.nextInt(20 - 10 + 1) + 10;
                judgesPoint.add(newInt);
              }
        return judgesPoint;
    }
    
    public int jumpDistance(){
        return randint.nextInt(120 - 60 + 1) + 60;
    }


}
