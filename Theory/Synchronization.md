When two oe more threads access the same resource then there is a chance of getting concurrency problem.
Synchronization is used to avoid concurrency problem.
'synchronized' keyword is used for synchronization.
'synchronized' keyword can be used for a method or block of statements only.
When 'synchronized' keyword is used a thread can only access the method if and only if no thread is accessing it.
In terms of Operating System this is known as Mutual Exclusion.
In a synchronized context (method/ block) only one thread will be running which degrades the performance of application.