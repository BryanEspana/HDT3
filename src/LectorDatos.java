import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class LectorDatos {
    public void Escribir(String nombre){
        File f;
        FileWriter w;
        BufferedWriter bw;
        ArrayList<String> datos= new ArrayList();
        PrintWriter wr;

        try{
            f = new File(nombre);
            w =new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            int min = 1;
		    int max = 10;
            int i;
            String texto = " ";
		    for(i = min; i <=max; i++) {
			    int getRandomValue = (int) (Math.random()*(max-min)) + min;
			    texto += String.valueOf(getRandomValue+" ");
            }
            wr.write(texto);
            datos.add(texto);
            wr.close();
            bw.close();
            System.out.println(datos);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error "+ e);
        }
    }
    public static void main(String[] args){
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
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");
    }
}
