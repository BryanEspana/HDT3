import java.util.ArrayList;

/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

public class GnomeSort{
    
    LectorDatos lw = new LectorDatos();
    ArrayList<Integer> arrayint = lw.llamarArray();
    /***
	 * This method is used to show the sorting gnome algorithm
	 */
    public void gnome(){
        String numerosEnStr = lw.leerArchivo("datos.txt");
        System.out.println("Los datos del archivo txt: " + numerosEnStr);
        GnomeSort testing = new GnomeSort();
        int[] array = lw.llamarArrayListaNormal(numerosEnStr);
        testing.gnomo(array);                  
        System.out.println(arrayint);
        GnomeSort objeto = new GnomeSort();
          //Imprime el array como se creo previamente
        System.out.println("Arreglo original: ");
          for(int i = 0; i < array.length; i++){
              System.out.println(array[i]);
          }
          System.out.println("");
  
          objeto.gnomo(array);
      }
      
    /***
	 * This method is the sort algorithm for gnome
	 */
      public void gnomo (int[] array){
          //MEDIR TIEMPO
          long TInicio, TFin, tiempo;
          TInicio = System.currentTimeMillis(); 
  
            for (int i = 1; i < array.length;){
                  if(array[i-1] <=array[i]){
                      i++;
                  }else{
                      int temp;
                      temp = array[i-1];
                      array[i-1] = array[i];
                      array[i] = temp;
                      i--;
                  }
                  if(i==0){
                      i=1;
                  }
            }
            System.out.println("Arreglo Ordenado: ");
            for(int i = 0; i < array.length; i++){
                System.out.println(array[i]);
            }
            System.out.println("");
  
            TFin = System.currentTimeMillis(); 
            tiempo = TFin - TInicio; 
            System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");
    }

}