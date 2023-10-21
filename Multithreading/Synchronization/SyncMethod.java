
class Table {
    // synchronized public void printTable(int num) {   //syncronized method
    //     for(int i=1; i<=10; i++) {
    //         System.out.println(num + " * " + i + " = " + (num*i));
    //         try{
    //             Thread.sleep(400);
    //         } catch (InterruptedException e) {
    //             System.out.println(e);
    //         }
    //     }
    // }

    // public void printTable(int num) {
    //     synchronized(this) {    //syncronized block
    //         for(int i=1; i<=10; i++) {
    //             System.out.println(num + " * " + i + " = " + (num*i));
    //             try{
    //                 Thread.sleep(400);
    //             } catch (InterruptedException e) {
    //                 System.out.println(e);
    //             }
    //         }
    //     }
    //     //code
    //     //code
    // }

    synchronized static void printTable(int num) {   //syncronized method
        for(int i=1; i<=10; i++) {
            System.out.println(num + " * " + i + " = " + (num*i));
            try{
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}

class CT1 extends Thread {
    // Table t;

    // CT1(Table t) {
    //     this.t = t;
    // }

    @Override
    public void run() {
        // t.printTable(10);
        Table.printTable(10);
    }
}

class CT2 extends Thread {
    // Table t;

    // CT2(Table t) {
    //     this.t = t;
    // }

    @Override
    public void run() {
        // t.printTable(2);
        Table.printTable(2);
    }
}

public class SyncMethod {
    public static void main(String[] args) {
        
        CT1 t1 = new CT1();
        CT2 t2 = new CT2();

        t1.start();
        t2.start();
    }
}
