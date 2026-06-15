public class Main {

    public static void main(String[] args) {
        Mihilo hilo1 = new Mihilo("Juan");
        Mihilo hilo2 = new Mihilo("Ana");
        Mihilo hilo3 = new Mihilo("Pedro");
        Mihilo hilo4 = new Mihilo("Carlos");

        System.out.println("Hilo 1 " +hilo1.getState());
        System.out.println("Hilo 2 " +hilo2.getState());
        System.out.println("Hilo 3 " +hilo3.getState());
        System.out.println("Hilo 4 " +hilo4.getState());
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        try {
            hilo1.join();
            hilo2.join();
            hilo3.join();
            hilo4.join();
        } catch (Exception e) {
        }
        System.out.println("Hilo 1 " +hilo1.getState());
        System.out.println("Hilo 2 " +hilo2.getState());
        System.out.println("Hilo 3 " +hilo3.getState());
         System.out.println("Hilo 4 " +hilo4.getState());
       
    }
    
}
