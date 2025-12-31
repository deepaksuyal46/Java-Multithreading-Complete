Java provides several methods in the Thread class to control thread execution,manage thread lifecycle and coordinate multiple threads.
These methods help in pausing,resuming,synchronizing and stopping threads safely.

1.start() 
          .It is used to start a new thread(creates a thread).
          .It internally calls the run() method.
          .It can be called only once for a thread otherwise can throw IllegalThreadStateException.

2.run()
          .It contains the code that the thread executes.
          .It is called internally by start().
          .Calling run() directly does not create a new thread.

3.currentThread()
          .It returns the reference of the currently executing thread.
          .It is a static method 

4.sleep(long millisec)
           .When this method is invoked on a thread(Thread.sleep()),the current thread will go to blocked state for a specified time.
           .It is a static method 
           .It can throw checked Exception-InterruptedException,invoke inside try-catch block.

5.setPriority(int priority)    
           .It sets the priority of a thread.
           .Priority affects scheduling.   

6.getPriority()     
            .It returns the priority of a thread.

7.setName(String name)
            .It sets the name of the thread.

8.getName()
            .It returns the name of the thread.   

9.toString()
            .It displays the state of the thread.
            Thread[#22,Thread-0,5,main]
               Thread-0:Name of thread
               5: default priority
               main:thread group(Collection of threads)                     