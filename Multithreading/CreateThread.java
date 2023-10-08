public class CreateThread {
    public static void main(String[] args) {
        // Dev_Bhatt obj = new Dev_Bhatt();    //Thread instantiation
        // obj.start();    //Thread execution

        // Ayush_Patel obj = new Ayush_Patel();    //Runnable instantiation
        // Thread t = new Thread(obj);    //Thread instantiation
        // t.start();    //Thread execution

        Thread t = new Thread();
        System.out.println(t.getState());
        t.start();
        System.out.println(t.getState());
        t.run();
        System.out.println(t.getState());
    }
}

class Dev_Bhatt extends Thread {
    @Override
    public void run() {
        System.out.println("Thread in Dev_Bhatt class is running");
    }
}

class Ayush_Patel implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread in Ayush_Patel class is running");
    }
}

/*
3 ways to create a thread:

1. By extending Thread class
2. By implementing Runnable interface
3. By using Thread pool

Thread class implements Runnable interface


*/