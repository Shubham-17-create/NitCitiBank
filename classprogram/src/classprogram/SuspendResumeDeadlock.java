package classprogram;
 public class SuspendResumeDeadlock {
    public static void main(String[] args) throws InterruptedException {
    
           final Thread thread1=new Thread("Thread-1"){
                  public void run() {
                        System.out.println(Thread.currentThread().getName()+" has started.");
                        synchronized (String.class) {
                               System.out.println(Thread.currentThread().getName()+" "
                                             + " has obtained lock on String.class "
                                             + " & suspended...");
                                      
                               Thread.currentThread().suspend();
                               
                               System.out.println(Thread.currentThread().getName()+" "
                                             + " has released lock on String.class");
                        }
                        System.out.println(Thread.currentThread().getName()+" has ENDED.");
                  }
 
           };
           thread1.start();
           
           Thread.sleep(2000); //This delay ensures Thread-2 after Thread-1
           
           Thread thread2=new Thread("Thread-2"){
                  public void run() {
                        System.out.println(Thread.currentThread().getName()+" has started.");
             
                        thread1.resume();
                        
           //             System.out.println(Thread.currentThread().getName()+
           //                           " is trying to obtain lock on String.class");  
                        synchronized (String.class) {
                               System.out.println(Thread.currentThread().getName()+
                                             " has obtained lock on String.class");
                               System.out.println(Thread.currentThread().getName()+
                                             " has released lock on String.class");
                        }
                        System.out.println(Thread.currentThread().getName()+" has ENDED.");
                  }
 
           };
           thread2.start();   
    }
    
}