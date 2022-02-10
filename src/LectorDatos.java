import java.io.*;
import javax.swing.JOptionPane;
public class LectorDatos {
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
    public static void main(String[] args){
        //Iniciar conteo de medidor de tiempo
        long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis(); 

        //Crear Archivo
        LectorDatos lw=new LectorDatos();
        lw.Escribir("C:\\Users\\HP\\Desktop\\Universidad\\Segundo año\\Algoritmos y estructura datos\\HDT3\\datos.txt");
        //Metodo para generar numeros
        
        //Terminar conteo de medidor de tiempo
        TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");
    }
}
