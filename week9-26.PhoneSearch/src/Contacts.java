
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
public class Contacts implements PhoneBook{
    private Scanner reader;
    private Map<String, Contact> contacts;
    
    public Contacts(Scanner reader){
        this.reader = reader;
        this.contacts = new HashMap<String, Contact>();
    }
    
    public void start(){
        statement();
        action();
    }
    
    public void statement(){
        System.out.println("phone search");
        System.out.println("available operations:");
        System.out.println(" 1 add a number");
        System.out.println(" 2 search for a number");
        System.out.println(" 3 search for a person by phone number");
        System.out.println(" 4 add an address");
        System.out.println(" 5 search for personal information");
        System.out.println(" 6 delete personal information");
        System.out.println(" 7 filtered listing");
        System.out.println(" x quit");

    }
    
    public void action(){
        while(true){
            System.out.println("");
            System.out.print("command: ");
            String command = reader.nextLine();
            if("1".equals(command)){
                System.out.print("Whose number: ");
                String name = reader.nextLine();
                System.out.print("number: ");
                String number = reader.nextLine();
                addNumber(name, number);
            }else if("2".equals(command)){
                System.out.print("Whose number: ");
                String name = reader.nextLine();
                searchByName(name);
            }else if("3".equals(command)){
                System.out.print("number: ");
                String number = reader.nextLine();
                searchByNumber(number);
            }else if("4".equals(command)){
               System.out.print("Whose address: ");
               String name = reader.nextLine();
               System.out.print("street: ");
               String street = reader.nextLine();
               System.out.print("city: ");
               String city = reader.nextLine();
               
                addAddress(name, street, city);
            }else if("5".equals(command)){
                System.out.print("Whose information: ");
                String name = reader.nextLine();
                
                search(name);
            }else if("6".equals(command)){
                System.out.print("Whose information: ");
                String name = reader.nextLine();
                
                deletePerson(name);
            }else if("7".equals(command)){
                System.out.print("keyword (if empty, all listed): ");
                String name = reader.nextLine();
            
                filter(name);
            }else if("x".equals(command)){
                System.out.println("x");
                break;
            }else {
                System.out.println("repeat command");
            }
        }

    }

    @Override
    public void addNumber(String name, String number) {
        
        if(exist(name)){
            this.contacts.get(name).setNumber(number);
        }else{
            this.contacts.put(name, new Contact(name, number));
        }
    }

    @Override
    public void searchByName(String name) {
        if(exist(name)){
           for(String number : this.contacts.get(name).getnumbers()){
               System.out.println(" "+number);
           }
        }else{
            System.out.println("  not found");
        } 
    }

    @Override
    public void searchByNumber(String number) {
        for(Contact contact : this.contacts.values()){
            if(contact.getnumbers().contains(number)){
                System.out.println(" "+contact.getName());
            }else{
                System.out.println("  not found");
                break;
            }
        }

    }

    @Override
    public void addAddress(String name, String street, String city) {

        if(exist(name)){
            this.contacts.get(name).setAddress(street, city);
        }else{
            this.contacts.put(name, new Contact(name, street, city));
        }
        
    }

    @Override
    public void search(String name) {
        
        if(exist(name)){
            Contact contact = this.contacts.get(name);
            System.out.println("  address "+contact.getAddres());
            if(!contact.getnumbers().isEmpty()){ 
                System.out.println("  phone numbers:");
                for(String number : contact.getnumbers()){
                    System.out.println("   "+number);
                }
            }else{
                System.out.println("  phone number not found");
            }

        }else{
            System.out.println("  not found");
        }

    }

    @Override
    public void deletePerson(String name) {
        if(exist(name)){
            this.contacts.remove(name);
        }
    }

    @Override
    public void filter(String keyword) { 
        boolean found = false;
        List<Contact> contacts = new ArrayList<Contact>(this.contacts.values());
        Collections.sort(contacts, new SortList());
        
        for(Contact contact : contacts){
            if(contact.getName().contains(keyword) || contact.getAddres().contains(keyword) ){
                String name = contact.getName();
                System.out.println("");
                System.out.println(" "+name);
                search(name);
                found = true;
            }
        }

        if(!found){
            System.out.println(" keyword not found");
        }
       
    }
    
    public boolean exist(String whose){
        if(this.contacts.containsKey(whose)){
            return true;
        }else{
            return false;
        }
    }



}
