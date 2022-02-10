
public class main {
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
