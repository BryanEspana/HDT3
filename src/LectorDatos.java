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
    ArrayList<Integer> array = new ArrayList<Integer>();

    /***
	 * This method is used to rewrite in txt file
     * @param nombre 
     * @param max
	 */
    public void Escribir(String nombre, int max){
        //Leer y escribir en el archivo
        File f;
        FileWriter w;
        BufferedWriter bw;
        PrintWriter wr;
        try{
            f = new File(nombre);
            w =new FileWriter(f);
            bw = new BufferedWriter(w);
            wr = new PrintWriter(bw);
            //datos minimos que saldran en el txt
            int min = 1;
            //datos maximos que saldran en el txt
            max = max;
            int i;
            String texto = "";
            //obtener el valor de cada dato por un for
            for(i = min; i <=max; i++) {
                int getRandomValue = (int) (Math.random()*(max-min)) + min;
                texto += String.valueOf(getRandomValue+" ");
            }

            wr.write(texto);
            wr.close();
            bw.close();
            //En caso de errores
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Ha ocurrido un error "+ e);
        }
    }
    /***
	 * This method is used to read the txt file
     * @param direccion
     * @return texto
	 */
    public String leerArchivo(String direccion){
        String texto = "";
        int numero =0;
        try{
            //Leer el archivo txt
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = "";
            String bfRead;
            while((bfRead = bf.readLine())!=null){
                temp = temp + bfRead; // guardado el texto del archivo
            }
            texto = temp;
            //En caso de errores
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"No se a podido encontrar el archivo\nIntente de nuevo"+e);
        }
        return texto;
    }

    /***
     * Call the array with your data
	 * @return array
	 */
    public ArrayList<Integer> llamarArray(){
        return array;

    }
    /***
     * separates the data and places it in an array
     * @param contenidoDelArchivo
     * @return numerosEnLita
	 */
    public int[] llamarArrayListaNormal(String contenidoDelArchivo){
        String[] numerosSeparados = contenidoDelArchivo.split(" ");

        int[] numerosEnLita = new int[numerosSeparados.length];

        for (int i = 0; i < numerosEnLita.length; i++) {
            int num = Integer.parseInt(numerosSeparados[i]);
            numerosEnLita[i] = num;
        }
        return numerosEnLita;
    }
}


