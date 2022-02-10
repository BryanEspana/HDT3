import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class LectorDatos {
    public static void main(String[] args){
        //Iniciar conteo de medidor de tiempo
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis(); 

        //Crear Archivo
        System.out.println("hola");
        //Metodo para generar numeros
        
        //Terminar conteo de medidor de tiempo
        TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");
    }
}
