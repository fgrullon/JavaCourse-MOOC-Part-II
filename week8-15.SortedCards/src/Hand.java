
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> hand;

    public Hand(){
        hand = new ArrayList<Card>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        for(Card card : this.hand){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(this.hand);
    }

    @Override
    public int compareTo(Hand h) {
        int a = 0;
        for(Card c : this.hand){
            a += c.getValue();
        }
        
        int b = 0;
        for(Card c : h.hand){
            b += c.getValue();
        }
        
        return a - b;

    }
    
    public void sortAgainstSuit(){
        Collections.sort(this.hand, new SortAgainstSuitAndValue());
    }
}
