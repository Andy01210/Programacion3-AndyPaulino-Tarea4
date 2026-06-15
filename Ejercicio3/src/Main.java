import java.util.Scanner;
public class Main{

    public static void main(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        try {
            int edad = leer.nextInt();
            leer.nextLine();
            UsuarioService.ValidarEdad(edad);
            
        } catch (EdadInvalidaException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("proceso finalizado");
        }



    }
}