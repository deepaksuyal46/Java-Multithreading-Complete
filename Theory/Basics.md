Thread -> A thread is a light weight process under execution within a process ,in JAVA every application has atleast one thread called the main thread.

Multithreading -> It is a java feature that allows multiple threads to execute concurrently within a single process.It is used to increase the performance of application.

Process -> A process is an executing instance of a program.
          A process:
         .Has its own memory space
         .Contains one or more threads
         .Is managed by the Operating System
         .Threads always run inside a process.

Relationship Between Multithreading and Operating System
          . Multithreading is implemented using both Java and the Operating System.
           .Java provides the programming model and APIs
           .Operating System (OS) handles actual execution
           .Role of Operating System-> The OS is responsible for:
                    1.Creating and managing processes and threads
                    2.Scheduling threads on CPU
                    3.Allocating CPU time
                    4.Performing context switching
                    5.Managing thread states
            .Even if Java creates threads, the OS decides which thread runs and when.
           