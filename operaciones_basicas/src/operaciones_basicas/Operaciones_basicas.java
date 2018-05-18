/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones_basicas;

import java.util.Scanner;

 
public class Operaciones_basicas {

  /*  public void dividir (){
        try{
            res (num1/num2);
        }
        catch(excepcion e){
            System.out.println(e.getMessage());
        }
        System.out.println("Termino Programa");
    }
    
    public void resultado(float num1 , float num2) throws excepcion{
        if (num2==0){
            throw new excepcion();
        }
        else{
            System.out.println("La division de "+num1 +" / "+num2+" es : "+res );
        }
    }*/
    
    
  //Aqui comienza el codigo   
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner dato = new Scanner (System.in);
        
      int opcion;
         
      float num1,num2, res;
     
      
        System.out.println("*****MENU*****");
        System.out.println("1: SUMA");
        System.out.println("2: RESTA");
        System.out.println("3: MULTIPLICACION");
        System.out.println("4: DIVISION ");
        System.out.println("5: RAIZ CUADRADA");
        System.out.println("6: SALIR");
        
        opcion= dato.nextInt();
        
        switch (opcion)
        {
            case 1://suma
                System.out.println("Dame el primer numero: ");
                num1 = dato.nextFloat();
                System.out.println("Dame el segundo numero: ");
                num2 = dato.nextFloat();
                res= num1+num2;
                System.out.println("La suma de "+num1 +" + "+num2+" es : "+res );
                break;
            case 2://Resta
                System.out.println("Dame el primer numero: ");
                num1 = dato.nextFloat();
                System.out.println("Dame el segundo numero: ");
                num2 = dato.nextFloat();
                res= num1-num2;
                System.out.println("La resta de "+num1 +" - "+num2+" es : "+res );
                break;
            case 3://Multiplicacion
                System.out.println("Dame el primer numero: ");
                num1 = dato.nextFloat();
                System.out.println("Dame el segundo numero: ");
                num2 = dato.nextFloat();
                res= num1*num2;
                System.out.println("La multiplicacion de "+num1 +" x "+num2+" es : "+res );
                break;
            case 4://division
                System.out.println("Dame el primer numero: ");
                num1 = dato.nextFloat();
                System.out.println("Dame el segundo numero: ");
                num2 = dato.nextFloat();
                res= num1/num2;
                System.out.println("La division de "+num1 +" / "+num2+" es : "+res );
                break;
            case 5://raiz cuadrada
                System.out.println("Dame el numero: ");
                num1 = dato.nextFloat();
               res= num1*num1;
                System.out.println("La raiz cuadrada de "+num1 +" es : "+res );
                break;
            case 6://salir
                System.out.println("Termino programa");
                break;
                default:
                    System.out.println("Opcion invalida");
                    break;
        }
        
        
    }
    
}
