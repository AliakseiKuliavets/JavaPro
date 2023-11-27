package lesson.lesson27;

public class DaemonThreadExample {
    public static void main(String[] args) {
        System.out.println("Main Start");
        UserTread userTread = new UserTread();
        userTread.setName("[User Tread]");

        DaemonTread daemonTread = new DaemonTread();
        daemonTread.setName("[Daemon Thread]");
        daemonTread.setDaemon(true);

        userTread.start();
        daemonTread.start();
        System.out.println("Main End");
    }
}

class UserTread extends Thread {
    @Override
    public void run() {
        System.out.println("Name " + Thread.currentThread().getName());
        System.out.println("Is Daemon: " + isDaemon());
        for (char c = 'A'; c < 'X'; c++) {
            try {
                sleep(600);
                System.out.println("CHAR: " + c);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonTread extends Thread {
    @Override
    public void run() {
        System.out.println("Name " + Thread.currentThread().getName());
        System.out.println("Is Daemon: " + isDaemon());
        for (int i = 0; i < 300; i++) {
            try {
                sleep(100);
                System.out.println("Number: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
