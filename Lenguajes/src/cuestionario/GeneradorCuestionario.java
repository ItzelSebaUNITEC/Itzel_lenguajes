/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuestionario;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author T-102
 */
public class GeneradorCuestionario {
    
    
    public ArrayList<Pregunta> generar(){
        //primero generamos el arreglo que contrebdra las preguntas
 ArrayList<Pregunta> pregunta=new ArrayList<Pregunta>();
 
 Opcion op11=new Opcion("Moscu",false);
 Opcion op21=new Opcion ("Kiev",false);
 Opcion op31=new Opcion ("Helsinki",true);
 Opcion op41=new Opcion ("Turin",false);
 
 
 
 
 
 ArrayList<Opcion> opciones1=new ArrayList<Opcion>();
 opciones1.add(op11);
 opciones1.add(op21);
 opciones1.add(op31);
 opciones1.add(op41);
 
 Pregunta p1=new Pregunta("Capital de Filandia",opciones1);
 pregunta.add(p1);
 
 return pregunta;
}
    
    
}
