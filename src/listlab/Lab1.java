/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package listlab;

/**
 *
 * @author Dallas
 */
import java.util.*;
public class Lab1 {
    public static void main(String[] args) {
        List hobbyItems = new ArrayList();
        
        hobbyItems.add("Gaming Console");
        hobbyItems.add("Personal Computer");
        hobbyItems.add("Golf Clubs");
        hobbyItems.add("Hockey Stick");
        hobbyItems.add("Airsoft Rifle");
        hobbyItems.add("Paintball Gun");
        
        String output;
        for(int i=0;i<hobbyItems.size();i++){
            output = (String)hobbyItems.get(i);
            System.out.println(output);
        }
    }    
}
