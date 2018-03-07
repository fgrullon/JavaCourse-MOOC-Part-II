
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public interface PhoneBook {
    void addNumber(String name, String number);
    void searchByName(String name);
    void searchByNumber(String number);
    void addAddress(String name, String street, String city);
    void search(String name);
    void deletePerson(String name);
    void filter(String keyword);
    
    
}
