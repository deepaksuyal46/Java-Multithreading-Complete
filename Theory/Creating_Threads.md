We can create a thread in JAVA by 2 ways
  1.By creating a class which extends Thread class.
  2.By creating a class which implements Runnable interface.

 1.Using Thread class:
   By creating a class which extends Thread class ,make the object of user defined class/sub class of Thread and then invoke start() method by the user defined class reference.
   start()->It creates a thread and invokes run().

         Thread is in built class of java which is in java.lang package.

         . what Thread class contains? 
         Thread class is completely concreate/no abstract methods

              ***  public class Thread implements Runnable{
                       @override
                         public void run(){};//Empty method 
                           public void start(){
                                        ...
                                        ...
                                        run();
                                        ...
                           }

                 }***

                 Thread class also contains 3 final variables:
                 1.final int MIN_PRIORITY=1
                 2.final int NORM_PRIORITY=5
                 3.final int MAX_PRIORITY=10
                 default priority of any thread is 5.
                 priority of any thread must lie between 1 to 10.
                 if we try to make priority greater than 10 or less than 1 it given an unchecked exception -IllegalArgumentException.

Since Multiple Inheritance is not supported in java so if we have to create thread of that class which class is already extending another class then we can extend the Thread class,then we create thread by implementing Runnable interface

  2.Using Runnable interface
       
        If we want to make thread of any user defined class then it must implement the Runnable interface
        What does Runnable interface contains?
        it only contains an abstract method-> public abstract void run();

        How to invoke start()?
        Since there is no built in start()in Runnable interface (and also we are not extending Thread)
        let ThreadR is a class that implements Runnable interface and tr is an object of ThreadR
        now we make an object of Thread class using the constructor that takes class object in argument.
        Using reference of Thread we can invoke start()