
public class controlador {
    public void program(){
        vista vista = new vista();
        LectorDatos lw = new LectorDatos();
        GnomeSort gnomeSort = new GnomeSort();
        int opcion = vista.menu1();        
        switch(opcion){
            //Gnome Sort
            case 1:
                opcion = vista.menu2();
                switch(opcion){
                    case 1:
                        System.out.println("Gnome con 10 datos");
                        lw.Escribir("datos.txt",10);
                        gnomeSort.gnome();
                        break;
                    case 2:
                        System.out.println("Gnome con 50 datos");
                        lw.Escribir("datos.txt",50);
                        gnomeSort.gnome();
                        break;                      
                    case 3:
                        System.out.println("Gnome con 100 datos");
                        lw.Escribir("datos.txt",100);
                        gnomeSort.gnome();
                        break;
                    case 4:
                        System.out.println("Gnome con 500 datos");
                        lw.Escribir("datos.txt",500);
                        gnomeSort.gnome();
                        break;     
                    case 5:
                        System.out.println("Gnome con 700 datos");
                        lw.Escribir("datos.txt",700);
                        gnomeSort.gnome();
                        break;        
                    case 6:
                        System.out.println("Gnome con 1000 datos");
                        lw.Escribir("datos.txt",1000);
                        gnomeSort.gnome();
                        break;       
                    case 7:
                        System.out.println("Gnome con 1500 datos");
                        lw.Escribir("datos.txt",1500);
                        gnomeSort.gnome();
                        break;    
                    case 8:
                        System.out.println("Gnome con 2000 datos");
                        lw.Escribir("datos.txt",2000);
                        gnomeSort.gnome();
                        break; 
                    case 9:
                        System.out.println("Gnome con 2500 datos");
                        lw.Escribir("datos.txt",2500);
                        gnomeSort.gnome();
                        break; 
                    case 10:
                        System.out.println("Gnome con 3000 datos");
                        lw.Escribir("datos.txt",3000);
                        gnomeSort.gnome();
                        break; 
                        default:
                        System.out.println("Error. Solo se pueden numeros del 1 al 10");
                        break;    
                }break;
            //Merge Sort
            case 2:
            opcion = vista.menu2();
            switch(opcion){
                case 1:
                    System.out.println("10m");
                    break;
                case 2:
                    System.out.println("50m");
                    break;                      
                case 3:
                    System.out.println("100m");
                    break;
                case 4:
                    System.out.println("500m");
                    break;     
                case 5:
                    System.out.println("700m");
                    break;        
                case 6:
                    System.out.println("1000m");
                    break;       
                case 7:
                    System.out.println("1500m");
                    break;    
                case 8:
                    System.out.println("2000m");
                    break; 
                case 9:
                    System.out.println("2500m");
                    break; 
                case 10:
                    System.out.println("3000m");
                    break; 
                    default:
                    System.out.println("Error. Solo se pueden numeros del 1 al 10");
                    break;
            }break;
            //Selection Sort
            case 3:
            opcion = vista.menu2();
            switch(opcion){
                case 1:
                    System.out.println("10s");
                    break;
                case 2:
                    System.out.println("50s");
                    break;                      
                case 3:
                    System.out.println("100s");
                    break;
                case 4:
                    System.out.println("500s");
                    break;     
                case 5:
                    System.out.println("700s");
                    break;        
                case 6:
                    System.out.println("1000s");
                    break;       
                case 7:
                    System.out.println("1500s");
                    break;    
                case 8:
                    System.out.println("2000s");
                    break; 
                case 9:
                    System.out.println("2500s");
                    break; 
                case 10:
                    System.out.println("3000s");
                    break; 
                    default:
                    System.out.println("Error. Solo se pueden numeros del 1 al 10");
                    break;
            }break;
            //Radix Sort
            case 4:
            opcion = vista.menu2();
            switch(opcion){
                case 1:
                    System.out.println("10r");
                    break;
                case 2:
                    System.out.println("50r");
                    break;                      
                case 3:
                    System.out.println("100r");
                    break;
                case 4:
                    System.out.println("500r");
                    break;     
                case 5:
                    System.out.println("700r");
                    break;        
                case 6:
                    System.out.println("1000r");
                    break;       
                case 7:
                    System.out.println("1500r");
                    break;    
                case 8:
                    System.out.println("2000r");
                    break; 
                case 9:
                    System.out.println("2500r");
                    break; 
                case 10:
                    System.out.println("3000r");
                    break; 
                    default:
                    System.out.println("Error. Solo se pueden numeros del 1 al 10");
                    break;
            }break;
            //Quick Sort
            case 5:
            opcion = vista.menu2();
            switch(opcion){
                case 1:
                    System.out.println("10q");
                    break;
                case 2:
                    System.out.println("50q");
                    break;                      
                case 3:
                    System.out.println("100q");
                    break;
                case 4:
                    System.out.println("500q");
                    break;     
                case 5:
                    System.out.println("700q");
                    break;        
                case 6:
                    System.out.println("1000q");
                    break;       
                case 7:
                    System.out.println("1500q");
                    break;    
                case 8:
                    System.out.println("2000q");
                    break; 
                case 9:
                    System.out.println("2500q");
                    break; 
                case 10:
                    System.out.println("3000q");
                    break; 
                    default:
                    System.out.println("Error. Solo se pueden numeros del 1 al 10");
                    break;
            }break;
            default:
            System.out.println("Error. Solo se pueden numeros del 1 al 5");
            break;
                

        }
    }
}
