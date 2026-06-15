public class Mihilo extends Thread{
    private String Corredor;
    private static boolean Ganador = false;

    public Mihilo(String n){
        Corredor = n;
    }

    @Override
    public void run(){
        for(int i = 0; i < 11; i++){
            System.out.println(Corredor + " Avanza al metro "+ i);
            try {
                Thread.sleep(1000);
                
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
           
            
        }
         if(Ganador == false){
                Ganador = true;
                System.out.println(Corredor +" Llego primero a la meta");

            }
    }
}