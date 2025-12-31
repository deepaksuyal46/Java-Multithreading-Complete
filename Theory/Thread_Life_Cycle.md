The Thread Life Cycle describes the different states a thread passes through from creation to termination.
 
 1.NEW:
       .Thread object is created but not started(object of user defined thread class is created).
       .Memory is allocated, Not eligible for CPU and run() not executed.

 2.RUNNABLE:
            .When we invoke start() method 
            .Thread is ready to run or running.    
            .Thread is eligible for CPU
            .JVM scheduler decides execution

 3.BLOCKED:
           .Whenever thread goes with input output operation(I/O) or sleep(),wait() is invoked.
           After I/O it comes back to runnable state.

 4.TERMINATED:
              .when run() method completes or exception occurs.
              .when stop()is invoked on a thread.
                                  


                                          ┌──────────┐
                                          │   NEW    │
                                          └──────────┘
                                              │ start()
                                              ▼
                                          ┌──────────┐
                           ───────────────│ RUNNABLE │
                           |              └──────────┘             
                           |                  │  I/O , sleep() , wait()     
                           |                  ▼                     │
                           |               ┌──────────┐              
                           |               │ BLOCKED  │
                           |               └──────────┘
                     stop()|                  │ After I/O ,after sleep(),notify(),notifyAll()
                           |                  ▼
                           |               ───────────
                           |               │ RUNNABLE │
                           |               ───────────
                           |                  │ run() ends / stop()
                           |                  ▼
                           |             ───────────────
                            ───────────▶│ TERMINATED   │
                                         ───────────────

