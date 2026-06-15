 import java.util.Scanner;
 public class Main{
   

    public static void main(){
        Scanner leer = new Scanner(System.in);
        int op = 0;
        Registro registro = new Registro();
        do { 
            System.out.println("================================");
            System.out.println("Sistema de Registro de Actividades");
            System.out.println("================================");
            System.out.println("1.Agregar Actividard \n2.Mostrar Registro \n3.Salir");
            op = leer.nextInt();
            switch(op){
                case 1:
                    registro.AgregarActividad();
                    break;
                case 2:
                    registro.MostrarActividad();
                    break;
                case 3:
                    System.out.println("Gracias por usar este sistema");
                    break;
                default:
                    System.out.println("Opcion invalidad. Intente de nuevo");
                    break;
            }
            
        } while (op != 3);
    }
}