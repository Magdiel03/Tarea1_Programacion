/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea.pkg1.programacion;
import java.util.*;
/**
 *
 * @author Magdiel
 */
public class Ejercicio3 {
//AQUI SE EMPLEA EL METODO O ALGORITMO  DE FISHER YATES  
  public static void generar_vecino(int[] arreglo) {
    Random r = new Random();
    for (int i = arreglo.length - 1; i > 0; i--) {
    // Un entero, elegido por una función Random en el rango 0-k (nótese que k se va reduciendo).    
      int entero_random = r.nextInt(i); 
   // Un entero, que ha de contener un valor para intercambiar valores entre 2 posiciones.   
      int intercambio = arreglo[entero_random]; 
      arreglo[entero_random] = arreglo[i];
      arreglo[i] = intercambio;
    }
  }
 
  public static void main(String[] args) {
 // AQUI ESTA EL CODIOGO PARA GENERAR LA MATRIZ POR TECLADO QUE INDIQUE LA POSICION DE LAS REINAS 
        
        int valor = 0;
        int[] matrizreina = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};

    // MUESTRA LA MATRIZ CON LAS REINAS ORIGINALES PARA LAS CUALES SE BUSCARAN EL VECINO     
    int [] reinas = matrizreina; 
    System.out.println("Reinas Original: " + Arrays.toString(reinas));
    //SE PIDE POR PANTALLAS LOS VECINOS QUE QUIERE GENERAR 
    int n;
    System.out.println ("Por favor introduzca la cantidad de vecinos a generar:");
    Scanner lector = new Scanner(System.in);
    n = lector.nextInt();
  
for(int i=0; i< n; i++) {
    generar_vecino(reinas);
 // FINALMENTE SE MUESTRAN TODOS LOS VECINOS GENERADOS 
    System.out.println("Vecino:  " + Arrays.toString(reinas));
}
  }
}