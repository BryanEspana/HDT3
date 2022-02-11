import java.util.Scanner;
public class vista {
    Scanner intscanner = new Scanner(System.in);
    public int menu1(){
        System.out.println("Escoja el tipo de algoritmo de ordenamiento para ordenar sus datos");
        System.out.println("1.Gnome Sort\n2.Merge Sort\n3.Selection Sort\n4.Radix Sort\n5.Quick Sort\n");
        int opcion = intscanner.nextInt();
        return opcion; 
    }

    public int menu2(){
        System.out.println("Escoja cuantos datos quiere analizar");
        System.out.println("1) 10\n2) 50\n3) 100\n4) 500\n5) 700\n6) 1000\n7) 1500\n8) 2000\n9) 2500\n10) 3000\n");
        int opcion = intscanner.nextInt();
        return opcion; 
    }
    
}
