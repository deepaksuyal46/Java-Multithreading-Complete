class Thread1 extends Thread{
    @Override
    public void run(){
      System.out.println("Thread of MyThread class is created by extending Thread class");
    }
}
public class Creating_Thread_Using_Thread_class {
     public static void main(String[] args) {
Thread1 t=new Thread1();
t.start();//creates a thread and invokes run()

    }
}