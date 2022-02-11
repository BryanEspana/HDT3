/*
* Universidad del Valle de Guatemala
* @author Bryan Espana 21550 | Javier Prado - 21486 | Angel Perez - 21298
* Algoritmos y estructura de datos
* Seccion 10 
*/
import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class LectorDatos {
    ArrayList<String> array = new ArrayList();
    public void Escribir(String nombre){
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        try{
            f = new File(nombre);
            w =new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            int min = 1;
            int max = 10;
            int i;
            String texto = "";
            for(i = min; i <=max; i++) {
                int getRandomValue = (int) (Math.random()*(max-min)) + min;
                texto += String.valueOf(getRandomValue+" ");
            }

            wr.write(texto);
            wr.close();
            bw.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error "+ e);
        }
    }
    public String leerArchivo(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader("datos.txt"));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine())!=null){
                temp = temp + bfRead; // guardado el texto del archivo
            }
            texto = temp;
            array.add(texto);
            System.out.println("Datos del array "+array);

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se a podido encontrar el archvio\nIntente de nuevo "+ e);
        }
        return texto;
    }
    /*public static void main(String[] args){
        
        //Para la implementacion de radix Sort
        radixSort ordenar = new radixSort();
        int vector1[] = {1,2,45,65,89,13};

        System.out.println("arreglo original");
        ordenar.mostrarArreglo(vector1);
        ordenar.radix(vector1);

        //para la implementacion de selection Sort
        int[] data = { 20, 12, 10, 15, 2 };
        SelectionSort ss = new SelectionSort();
        ss.selectionSort(data);
        System.out.println("Arreglo de ordenamiento de seleccion: ");
        System.out.println(Arrays.toString(data));
    
        //Iniciar conteo de medidor de tiempo
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis(); 


        //Crear Archivo
        LectorDatos lw=new LectorDatos();
        lw.Escribir("C:\\Users\\Bryan\\OneDrive - Universidad del Valle de Guatemala\\Documentos\\UVG\\SEMESTRE III\\Algoritmos y Estructura de Datos\\Hoja de trabajo 3\\HDT3\\src\\datos.txt");
        //Metodo para generar numeros
        
        //Terminar conteo de medidor de tiempo
        TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecucion en milisegundos: " + tiempo+"ms");
    }*/
}


