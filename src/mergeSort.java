/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

public class mergeSort{


    
    public void sort(Integer[] v, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        Integer[] lef = new Integer[mid];
        Integer[] rgh = new Integer[n - mid];
        for (int i = 0; i < mid; i++) {
            lef[i] = v[i];
        }
        for (int i = mid; i < n; i++) {
            rgh[i - mid] = v[i];
        }
        sort(lef, mid);
        sort(rgh, n - mid);
        merge(v, lef, rgh, mid, n - mid);
    }
    private Integer[] merge(Integer[] v, Integer[] lef, Integer[] rgh, int l, int r) {
        int i = 0,c = 0, p = 0;
        while (i < l &&c < r) {
            if (lef[i] <= rgh[c]) {
                v[p++] = lef[i++];
            }
            else {
                v[p++] = rgh[c++];
            }
        }
        while (i < l) {
            v[p++] = lef[i++];
        }
        while (c < r) {
            v[p++] = rgh[c++];
        }
        return v;
    }
}