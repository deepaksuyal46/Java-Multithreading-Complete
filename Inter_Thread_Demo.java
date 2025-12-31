class Q{
    int num;
    boolean valueSet =false;

    synchronized void produce(){
        while(valueSet){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        num+=1;
        System.out.println("Produced:"+num);
        valueSet=true;
        notify();
    }
    synchronized void consume(){
        while(!valueSet){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        num-=1;
        System.out.println("Consumed:"+num);
        valueSet=false;
        notify();
    }
}
class Producer implements Runnable{
    Q q;
    Producer(Q q){
        this.q=q;
        new Thread(this).start();
    }
    public void run(){
        for(int i=0;i<1000;i++){
            q.produce();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
class Consumer implements Runnable{
    Q q;
    Consumer(Q q){
        this.q=q;
        new Thread(this).start();
    }
    public void run(){
        for(int i=0;i<1000;i++){
            q.consume();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
public class Inter_Thread_Demo {
      public static void main(String[] args) throws InterruptedException {
       Q q=new Q();
     new  Producer(q);
     new Consumer(q);
    }
}