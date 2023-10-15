class CustomThread extends Thread {

    CustomThread(String name) {
        super(name);    //parent class constructor call 
        // Thread.currentThread().setName(name);
    }

    // public void printTable(int n) {
    //     for(int i=1; i<=10; i++) {
    //         System.out.print(Thread.currentThread().getName() + ": ");
    //         System.out.println(n + " * " + i + " = " + (n*i));
    //     }
    // }

    @Override
    public void run() {
        // System.out.print(Thread.currentThread().getName() + " is running...");
        // printTable(9);
        for(int i=1; i<=10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.print(Thread.currentThread().getName() + ": ");
            System.out.println(i);
        }



    }
}


public class UseThreads {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("Thread 1");
        CustomThread t2 = new CustomThread("Thread 2");
        CustomThread t3 = new CustomThread("Thread 3");

        t1.start();
        try {
            t1.join(1500);  //main thread will wait for t1 to complete
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        
        t2.start();
        try {
            t2.join();  //main thread will wait for t1 to complete
        } catch (InterruptedException e) {
            System.err.println(e);
        }
        
        t3.start();
    }
}

//syncronization : only one thread can access the resource at a time