
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Grullon
 */
public class SortPlayerByLowestPoints implements Comparator<Jumper> {

    public int compare(Jumper j1, Jumper j2) {
        return j1.getPoints() - j2.getPoints();
    }
    
}
