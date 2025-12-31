When the result of  First thread's task is used by other threads,called Inter Thread Communication.
It is done using wait(),notify() and notifyAll() methods.
These methods belong to the Object class.
When wait() is invoked on a thread the other threads will go to block state untill notified using notify() /notifyAll() methods.
If there is only one thread in block state we can use notify()/notifyAll() methods but if there are multiple threads in block state we use notifyAll().
These 3 methods need to be used in the synchronized context only else it will throw IllegalMonitorStateException.