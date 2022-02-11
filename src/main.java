
public class main {
    public static void main(String[] args) {
        
    
        //Crear Archivo
        LectorDatos lw=new LectorDatos();
        lw.Escribir("datos.txt");
        System.out.prinln(lw.leerArchivo("datos.txt"));
        controlador controlador = new controlador();
        controlador.program();
        //Iniciar conteo de medidor de tiempo
        /*long TInicio, TFin, tiempo;
        TInicio = System.currentTimeMillis(); 
*/

        //Metodo para generar numeros
        
        //Terminar conteo de medidor de tiempo
        /*TFin = System.currentTimeMillis(); 
        tiempo = TFin - TInicio; 
        System.out.println("Tiempo de ejecución en milisegundos: " + tiempo+"ms");*/
    }
}
