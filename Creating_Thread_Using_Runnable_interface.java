class Thread2 implements Runnable{

    @Override
    public void run() {
       System.out.println("Thread of Thread2 class is created by implementing Runnable interface");
    }
    
}
public class Creating_Thread_Using_Runnable_interface {
    public static void main(String[] args) {
        Thread2 t2=new Thread2();
        Thread t=new Thread(t2);
        t.start();
    }
}
