/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;

/**
 *
 * @author Guest
 */
public class excepcion extends RuntimeException{
    
    public excepcion(){
        this(" ");
        
    }
    
    public excepcion(String cero){
        super(cero+"No se puede dividir entre cero");
    }
    
}
