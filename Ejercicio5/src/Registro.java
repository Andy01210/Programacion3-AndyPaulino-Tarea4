
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class Registro {
    Scanner leer = new Scanner(System.in);
    public void AgregarActividad(){
        try{
        System.out.println("Ingrese la actividad que desea ingresar");  
        FileWriter fw = new FileWriter("Actividades.txt", true);
        BufferedWriter write = new BufferedWriter(fw);
        write.write(leer.nextLine());
        write.write("\n");
        write.close();
        }catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }


    }
    public void MostrarActividad(){
        try {
            File archivo = new File("Actividades.txt");
            if(archivo.exists()== true){
                 FileReader reader = new FileReader("Actividades.txt");
            BufferedReader Read = new BufferedReader(reader);
            String linea;
            while((linea = Read.readLine())!= null){
                System.out.println(linea);
            }
            Read.close();
            }else{
                System.out.println("Intente de nuevo. El archivo no existe");
            }
          
            
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }

    }
    
}
