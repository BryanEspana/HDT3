import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class LectorDatos{
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
}