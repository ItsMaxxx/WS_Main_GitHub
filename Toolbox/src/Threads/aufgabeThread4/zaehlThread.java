package aufgabeThread4;

public class zaehlThread extends Thread {
    public static double timeInSekunden = 0;
    public boolean end = false;

    @Override
    public void run(){
        while(true){
            System.out.println("beliebiger Text");
            timeInSekunden += 0.25;
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


            if(end){
                System.out.println("beendet");
            }
        }

    }
}
