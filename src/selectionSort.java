

import java.util.Arrays;
public class SelectionSort{

    void selectionSort(int array[]) {
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
      }
    
}