/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trycatch;

/**
 *
 * @author Yova
 */
public class TryCatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena ="cadena";
        int numero;
        try{
        numero = Integer.parseInt(cadena);
        }catch(NumberFormatException exception){
            System.out.println("No es un numero sino una cadena");
        }
    }
    
}
