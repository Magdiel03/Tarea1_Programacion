/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.programacion;
import java.util.Arrays;
/**
 *
 * @author Magdiel
 */
public class Tarea1Programacion
 {
//Test comparar arrays relación de igualdad aprenderaprogramar.com
    public static void main (String [ ] Args) {
        int [ ] miArray1 = {0,3,1,2};
        for (int i=0; i<miArray1.length; i++) {
            System.out.print ("miArray1[" + i +"]= " + miArray1[i]+"; ");}
        System.out.println ("");   
        int [ ] otroArray = {0,2,1,3};
        for (int i=0; i<otroArray.length; i++) {
        System.out.println ("¿Tienen el mismo contenido (relación de igualdad)? ... " + Arrays.equals(miArray1, otroArray) );
        
    } //Cierre del main
} //Cierre de la clase

   