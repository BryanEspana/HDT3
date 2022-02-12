/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

import java.util.ArrayList;

  /***
	 * This method is the sort algorithm for quickSort
	 */
public class quickSort{
    //Leer los datos
    LectorDatos lw = new LectorDatos();
    ArrayList<Integer> arrayint = lw.llamarArray();

public void quick(){
        //Lee los datos
        String numerosEnStr = lw.leerArchivo("datos.txt");
        System.out.println("Los datos del archivo txt: " + numerosEnStr);
        quickSort testing = new quickSort();
        int[] array = lw.llamarArrayListaNormal(numerosEnStr);
        testing.quickSt(array, 0, array.length-1);                 
        quickSort objeto = new quickSort();
        //Imprime el array como se creo previamente
        System.out.println("Arreglo original: ");
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
                }
                System.out.println("");
                objeto.quickSt(array, 0, array.length-1);
}

    /***
	 * This method is used to show the sorting quickSort algorithm
	 */

public void quickSt(int[] array, int low, int high) {
    //INICIO - Medir Tiempo
    long TInicio, TFin, tiempo;
    TInicio = System.currentTimeMillis();
    
    if (array == null || array.length == 0)
        return;

    if (low >= high)
        return;

    //Elige el pivote
    int middle = low + (high - low) / 2;
    int pivot = array[middle];

    //Hacer pivote izquierdo <pivote y derecho>
    int i = low, j = high;
    while (i <= j) {
        while (array[i] < pivot) {
            i++;
        }

        while (array[j] > pivot) {
            j--;
        }

        if (i <= j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    // Ordenar recursivamente dos subpartes
    if (low < j)
        quickSt(array, low, j);
    
        

    if (high > i)
        quickSt(array, i, high);
        System.out.println("");
        //FIN - Medir Tiempo
}

   

}