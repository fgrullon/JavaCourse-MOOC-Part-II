
import java.util.ArrayList;
import java.util.HashMap;
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
public class AirPort {
    private HashMap<String, Airplane>planes;
    private Scanner reader;
    private ArrayList<Flight> f;
    
    public AirPort(Scanner reader){
        planes = new HashMap<String, Airplane>();
        f = new ArrayList<Flight>();
        this.reader = reader;
    }
    
    public void addFlight(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        
            Airplane plane = planes.get(id);
            System.out.print("Give departure airport code: ");
            String departureAir = reader.nextLine();
            System.out.print("Give destination airport code: ");
            String destinationAir = reader.nextLine();
            Flight flight = new Flight(destinationAir, departureAir, plane);
                if(!id.isEmpty() && !departureAir.isEmpty() && !destinationAir.isEmpty()){
                        this.f.add(flight);
      
                    
                }
        
           
    }
    
    public void addPlane(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.nextLine());
        Airplane plane = new Airplane(id, capacity);
        this.planes.put(id, plane);
    }
    
    public void statementAirport(){

        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
        System.out.print("> ");
    }
    
    public void statementFlight(){

        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
        System.out.print("> ");
    }
    
    public void printPlanes(){
            
                for(Airplane a : this.planes.values()){
                    System.out.println(a);
                }
              
            
    }
    
    public void printFlights(){
        
            for(Flight d: this.f){
                    System.out.println(d);
                }
        
        
    }
    
    public void printPlaneInfo(){
        System.out.print("Give plane ID: ");
        String id = reader.nextLine();
        System.out.println(this.planes.get(id));
        
    }
    
    public void flightService(){
        
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        
        while(true){
            statementFlight();
            String command = reader.nextLine();
            
            if(command.equalsIgnoreCase("1")){
                printPlanes();
            }else if(command.equalsIgnoreCase("2")){
                printFlights();
            }else if(command.equalsIgnoreCase("3")){
                printPlaneInfo();
            }else if(command.equalsIgnoreCase("x")){
                break;
            }
        }
    }
    
    public void airportService(){
        
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        while(true){
            statementAirport();
            String command = reader.nextLine();
            
            if(command.equalsIgnoreCase("1")){
                addPlane();
            }else if(command.equalsIgnoreCase("2")){
                addFlight();
            }else if(command.equalsIgnoreCase("x")){
                break;
            }
        }
        System.out.println("");
        flightService();
       
    
    }
}
