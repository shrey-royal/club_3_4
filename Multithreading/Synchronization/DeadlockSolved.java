public class DeadlockSolved {
    public static void main(String[] args) {
        final String yw = "DM Silk";
        final String jw = "KitKat";

        Thread yash = new Thread() {
            public void run() {
                synchronized(yw) {
                    System.out.println("Yash locked DM Silk");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    synchronized(jw) {
                        System.out.println("Yash locked KitKat");
                    }
                }
            }
        };

        Thread jay = new Thread() {
            public void run() {
                synchronized(yw) {
                    System.out.println("Jay locked DM Silk");
                    try {
                        Thread.sleep(100);
                    } catch(Exception e) {
                        System.out.println(e);
                    }
                    synchronized(jw) {
                        System.out.println("Jay locked KitKat");
                    }
                }
            }
        };

        yash.start();
        jay.start();
    }
}
