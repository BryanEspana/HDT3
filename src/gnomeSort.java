/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

public class gnomeSort{
    public void gnome(){
          //Array creado
          int[] array = {5,8,2,3,4,1};
          Gnome objeto = new Gnome();
          //Imprime el array como se creo previamente
          System.out.println("Arreglo original: ");
          for(int i = 0; i < array.length; i++){
              System.out.println(array[i]);
          }
          System.out.println("");
  
          objeto.gnomo(array);
      }
      //Se crea un metodo para ordenar los datos
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