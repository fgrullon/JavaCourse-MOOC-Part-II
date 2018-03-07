/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Main {
      public static void main(String[] args) {
        Box box1 = new Box(10);

        box1.add( new Book("Fedor Dostojevski", "Crime and Punishment", 2) ) ;
        box1.add( new Book("Robert Martin", "Clean Code", 1) );
        box1.add( new Book("Kent Beck", "Test Driven Development", 3.7) );
        
        Box box2 = new Box(10);
        box2.add( new CD("Pink Floyd", "Dark Side of the Moon", 1973) );
        box2.add( new CD("Wigwam", "Nuclear Nightclub", 1975) );
        box2.add( new CD("Rendezvous Park", "Closer to Being Here", 2012) );
        
        Box box3 = new Box(20);

        box3.add( new Book("Fedor Dostojevski", "Crime and Punishment", 6) ) ;
        box3.add( new Book("Robert Martin", "Clean Code", 7) );
        box3.add( new Book("Kent Beck", "Test Driven Development", 3.7) );
        
        
        Box big = new Box(30);
        
        big.add(box1);
        big.add(box2);
        big.add(box3);

        System.out.println(  big);
    }
    
}
