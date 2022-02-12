/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/
import java.util.ArrayList;

public class SelectionSort{
  LectorDatos lw = new LectorDatos();
  ArrayList<Integer> arrayint = lw.llamarArray();
  /***
	 * This method is the sort algorithm for selection
	 */
  public void selection(){
    //leer datos de archivo 
    String numerosEnStr = lw.leerArchivo("datos.txt");
    System.out.println("Los datos del archivo txt: " + numerosEnStr);
    SelectionSort testing = new SelectionSort();
    int[] array = lw.llamarArrayListaNormal(numerosEnStr);
    testing.selections(array);                  
    System.out.println(arrayint);
    SelectionSort objeto = new SelectionSort();
    //Imprime el array como se creo previamente
    System.out.println("Arreglo original: ");
    for(int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }
    System.out.println("");
    objeto.selections(array);
  }

  /***
	 * This method is used to show the sorting selection algorithm
	 */
  public void selections(int array[]) {
    //INICIO- Medir Tiempo
      long TInicio, TFin, tiempo;
      TInicio = System.currentTimeMillis();
      int size = array.length;
      for (int step = 0; step < size - 1; step++) {
        int min_idx = step;
        for (int i = step + 1; i < size; i++) {
          // Selecciona el elemento mas pequeno en el loop
          if (array[i] < array[min_idx]) {
            min_idx = i;
          }
        }
        // coloca el valor minimo en la posicion correcta
        int temp = array[step];
        array[step] = array[min_idx];
        array[min_idx] = temp;
      }
      //Imprime el Array Ordenado 
      System.out.println("Arreglo Ordenado: ");
      for(int i = 0; i < array.length; i++){
          System.out.println(array[i]);
      }
      System.out.println("");
      //FIN - Medir Tiempo
      TFin = System.currentTimeMillis(); 
      tiempo = TFin - TInicio; 
      System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");
    }
    
}