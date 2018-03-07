/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class Flight {
    private String dest;
    private String orig;
    private Airplane plane;
    
    public Flight(String dest, String orig, Airplane plane){
        this.dest = dest;
        this.orig = orig;
        this.plane = plane;
    }
    
    public String toString(){
        return this.plane+" ("+this.orig+"-"+this.dest+")";
    }
    

}
