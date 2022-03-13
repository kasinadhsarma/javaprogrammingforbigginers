public class two_timer {
    public static void main(String[] args) {
        timer t = new timer();
        timer3s t3s = new timer3s();
        t.start();
        t3s.start();
    }
}

class timer extends Thread {
    synchronized public void run() {
        while (true) {
            System.out.println("A");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class timer3s extends Thread {
    synchronized public void run() {
        while (true) {
            System.out.println("B");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
