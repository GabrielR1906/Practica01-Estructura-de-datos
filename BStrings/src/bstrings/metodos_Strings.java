/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bstrings;
import java.util.Scanner;
/**
 *
 * @author SALA H
 */
public class metodos_Strings {
    Scanner entrada;
    String cadena = "";
    
    public metodos_Strings(){
        this.entrada = new Scanner(System.in);
        String cadena = "";
    }
    public int menu(){
        int opcion;
        System.out.println("Imprimir caracter por caracter      [1]");
        System.out.println("Contar veces que se repite caracter [2]");
        System.out.println("Es palindromo?                      [3]");
        System.out.println("Contar vocales y consonantes        [4]");
        System.out.println("Salir                               [0]");
        opcion = entrada.nextInt();
        return opcion;
    }
    
    public void caracterxcaracter(){
        entrada.nextLine();
        System.out.println("Ingrese cadenas: ");
        cadena = entrada.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i) + "\n");
        }
    }
    
    public void veces(){
        int contador = 0;
        char caracter;
        entrada.nextLine();
        System.out.println("Ingrese cadena: ");
        cadena = entrada.nextLine();
        System.out.println("Ingrese caracter a revisar");
        caracter = entrada.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == caracter){
                contador = contador + 1;
            }
        }
        System.out.println("La laetra se repite " + contador + " veces\n");
    }
    
    public String eliminaEspacios(String cad){
        return cad.replace(" ", "");
    }
    
    public void palindromo(){
        int j;
        boolean sies = true;
        String cad = "";
        entrada.nextLine();
        System.out.println("Digite una cadena de caracteres: ");
        cadena = entrada.nextLine();
        cad = eliminaEspacios(cadena);
        j = cad.length()-1;
        for (int i = 0; i < cad.length()/2; i++) {
            if(cad.charAt(i) != cad.charAt(j)){
                sies = false;
                System.out.println("No es palindromo");
                break;
            }
            j--;
        }
        if(sies == true){
            System.out.println("Si es palindromo");
        }
    }
    
}
