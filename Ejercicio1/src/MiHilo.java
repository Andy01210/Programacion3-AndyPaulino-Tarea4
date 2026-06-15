public class MiHilo extends Thread{
    private String Archivo;

    public MiHilo(String N){
        Archivo = N;
    }
    @Override
    public void run(){
        for(int i = 0; i<= 100; i+=10 ){
            System.out.println("Descargando "+Archivo+ ": "+i+"%" );
            try{
                    Thread.sleep(1000);
            }catch(Exception e){
                e.getMessage();

            }
        }
        System.out.println("Descarga del "+Archivo +" Finalizada");

    }



}