/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/

import java.lang.Integer;

import javax.sound.sampled.SourceDataLine;

public class redixSort{

    public void radix(int[] arreglo){
        int x, i, j;
        for(x=Integer.SIZE-1;x>0;x--){ 
            int auxiliar[] = new int[arreglo.length];
            j=0; //contador
            for(i=0;i<arreglo.length;i++){
                boolean mover = arreglo[i]<<x>=0; //Si x es mayor a 0 devuleve un true/false que se le asigna al arreglo

                /*
                if (x>y){
                    mayor = x;
                }else{
                    mayor = y;
                }

                - Operador Ternario ?
                resultado = (condicion)? valor1: valor2;
                mayor = (x>y)? x:y
                */

                if(x==0 ? ! mover:mover){
                    auxiliar[j] = arreglo[i];
                    j++;
                }else{
                    arreglo[i-j]= arreglo[i];
                }
            }
            for(i=j; i<auxiliar.length;i++){ //copiando lo que se tiene en el arreglo auxiliar
                auxiliar[i]= arreglo[i-j];
            }
            arreglo = auxiliar;
        }
        System.out.println("El arreglo ordenado con radix es");
        mostrarArreglo(arreglo);
    }

    public void mostrarArreglo(int [] arreglo){
        int k;
        for(k=0;k<arreglo.length;k++){
            System.out.println("["+arreglo[k]+"]");
        }
        System.out.println();
    }
}