public class Example {
    private int counter = 0;

    public void increment() {
        counter++;
        System.out.println("Counter wynosi+: " + counter);
    }

    public void decrement() {
        counter--;
        System.out.println("Counter wynosi-: " + counter);
    }

    public synchronized void incrementSync() {
        counter++;
        System.out.println("Counter wynosi+: " + counter);
    }

    public synchronized void decrementSync() {
        counter--;
        System.out.println("Counter wynosi-: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Example example = new Example();

        System.out.println("Bez synchronizacji");

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.decrement();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Wartość counter: " + example.counter);

        System.out.println("----------------");
        System.out.println("Z synchronizacją");
        System.out.println("----------------");

        thread1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.incrementSync();
            }
        });

        thread2 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                example.decrementSync();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Wartość counter: " + example.counter);
    }
}