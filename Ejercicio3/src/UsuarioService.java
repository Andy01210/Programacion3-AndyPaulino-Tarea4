public class UsuarioService {
    public static void ValidarEdad(int edad) throws EdadInvalidaException{
        if(edad < 18){
            throw new EdadInvalidaException("Error: Debe ser mayor de edad."); 
        } else{System.out.println("Edad validad correctamente");}
    }
}
