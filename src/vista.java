/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

import java.util.Scanner;
public class vista {
    Scanner intscanner = new Scanner(System.in);
    /***
	 * This method is the sort menu
	 */
    public int menu1(){
        System.out.println("Escoja el tipo de algoritmo de ordenamiento para ordenar sus datos");
        System.out.println("1.Gnome Sort\n2.Merge Sort\n3.Selection Sort\n4.Radix Sort\n5.Quick Sort\n6.Salir\n");        
        int opcion = intscanner.nextInt();
        return opcion; 
    }
    /***
	 * This method is the menu for data
	 */
    public int menu2(){
        System.out.println("Escoja cuantos datos quiere analizar");
        System.out.println("1) 10\n2) 50\n3) 100\n4) 500\n5) 700\n6) 1000\n7) 1500\n8) 2000\n9) 2500\n10) 3000\n");
        int opcion = intscanner.nextInt();
        return opcion; 
    }
    
}
