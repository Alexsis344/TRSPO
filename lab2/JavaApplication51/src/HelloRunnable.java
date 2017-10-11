import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloRunnable implements Runnable {
    String name;
    HelloRunnable(String name){
        this.name=name;
    }

    public void run() {
        while(true){
                System.out.println("Я работаю"+name);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}}
