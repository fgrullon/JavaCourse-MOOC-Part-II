
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
public class SortPlayerByhHighestPoints implements Comparator<Jumper> {
 
    public int compare(Jumper j1, Jumper j2) {
        return j2.getPoints() - j1.getPoints();
    }
}
