/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j.hausuebung3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexa
 */
public class Main {
    
   static List<Weapon> weapons = new ArrayList<>();
   
public  static void main(String[] args){
    
    try (BufferedReader br = new BufferedReader(new FileReader("weaopons.csv"))) {
    String line;
    while ((line = br.readLine()) != null) {
       String[] values = line.split(";");
       Weapon w = new Weapon();
       w.name = values[0];
        w.combatType = CombatType.valueOf(values[1]);
         w.typeDamage = DamageType.valueOf(values[2]);
         w.speed = Integer.parseInt(values[3]);
         w.strength = Integer.parseInt(values[4]);
         w.value = Integer.parseInt(values[5]);
          weapons.add(w);
         
         
         
    }
}       catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    weapons.sort((w1, w2) -> Integer.compare(w1.getDamage(), w2.getDamage()));
    
    weapons.sort((w1, w2) -> {
        
    }
    );
}



    
                   
}
     
                   

    

