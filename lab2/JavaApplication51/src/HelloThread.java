import java.util.Scanner;

public class HelloThread {
      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
                      while(true){
                          String name=sc.nextLine();
        (new Thread(new HelloRunnable(name))).start();
  
           }}}
