/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

import javax.swing.JFrame;

/**
 *
 * @author T-102
 */
public class PobrarConstructores {
    public static void main(String[] args) {
        
        //creamos un objeto de la clase Animal
        Animal algo=new Animal();
        int x=2;
        //algo.setEdad(5);
        
        System.out.println("2");
        System.out.println(algo.getEdad());
        System.out.println(algo.getNombre());
       
        
        Animal otro=new Animal(8);
        otro.setEdad(10);
        System.out.println(otro.getEdad());
        //Vamos a usar un condtructoe de una clase que no hemos diseñado
        JFrame ventana=new JFrame("hola mundo");
        ventana.setSize (300,300);
        ventana.setVisible(true);
                
        
            
        }
        
        
    }
    

