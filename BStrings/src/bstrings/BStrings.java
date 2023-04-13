/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstrings;

/**
 *
 * @author SALA H
 */
public class BStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodos_Strings obj = new metodos_Strings();
        int opcion;
        
        do{
            opcion = obj.menu();
            
            switch(opcion){
                case 1: obj.caracterxcaracter();
                        break;
                case 2: obj.veces();
                        break;
                case 3: obj.palindromo();
                        break;
                /*case 4: obj.cuenta();
                        break;*/
                default: break;
                
            }
        } while (opcion != 0);
    }
    
}
