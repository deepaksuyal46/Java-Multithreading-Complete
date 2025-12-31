class MyThread extends Thread{
    @Override
    public void run(){
        Thread t=Thread.currentThread();
        t.setName("Thread x");
        t.setPriority(MAX_PRIORITY);
          try {
    for(int i=0;i<10;i++){
      
            System.out.println(i+1);
            Thread.sleep(1000);// 1 sec
    }
        } catch (InterruptedException e) {

        }
    
    }
}
public class Methods_Of_Thread {
    public static void main(String[] args) {
        MyThread t=new MyThread();
        t.start();
        System.out.println(t);
        System.out.println("Name of Thread: "+t.getName());
         System.out.println("Priority of Thread: "+t.getPriority());
    }
}
