class Counter{
    private int count=0;
   synchronized void inc(){
        count+=1;
    }
    int getCount(){
        return count;
    }
}
class ThreadS extends Thread{
  Counter counter;
  ThreadS(Counter counter){
      this.counter=counter;
  }
    @Override
    public void run(){
      for(int i=0;i<1000;i++){
          counter.inc();
      }
    }
}
public class Synchronization {
    public static void main(String[] args) {
        Counter c=new Counter();//c is shared resource
        ThreadS t1=new ThreadS(c);
        ThreadS t2=new ThreadS(c);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch (Exception e){

        }
        System.out.println(c.getCount());
    }
}

