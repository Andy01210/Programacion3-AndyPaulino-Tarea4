import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op =0;
        int resultado = 0;
        int num1 = 0;
        int num2 = 0;
        do{
            System.out.println("=========================================");
            System.out.println("Bienvenido al sistema Calculadora Segura");
            System.out.println("=========================================");
            try{
            System.out.println("1. Sumar\n"+"2. Restar\n"+"3. Multiplicar\n"+"4. Dividir\n"+ "5.Salir");
            op = leer.nextInt();
            if(op == 5){
                System.out.println("Gracias por usar esta calculadora");
                break;
            }
            System.out.println("ingrese el primer numero");
            num1 = leer.nextInt();
            System.out.println("Digite el segundo numero a operar");
            num2 = leer.nextInt();
            switch(op){
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de su operacion es: "+ resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de su operacion es: "+ resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de su operacion es: "+ resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de su operacion es: "+ resultado);
                    break;
                default:
                    System.out.println("Opcion invalidad");
                    break;
            }
            }catch(InputMismatchException a){
                leer.nextLine();
                System.out.println("Error: Debe ingresar numeros");
            }catch(ArithmeticException e){
                leer.nextLine();
                System.out.println("Error: No se puede dividir entre 0");
            }catch(Exception i){
                System.out.println(i.getMessage());
            }finally{
                System.out.println("Proceso finalizado");
            }  
        }while(op != 5);
        
    }
    
}

