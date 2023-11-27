package lesson.lesson27;

import java.util.concurrent.ArrayBlockingQueue;

public class ABQ {
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);

        Thread producer = new Thread(() -> {
            String[] words = {"Some", "Nik", "Ivan", "Bogdan", "Vasyly", "Mikhail", "Ruslan", "Batyr"};
            for (int i = 0; i < words.length && !Thread.interrupted(); ) {
                try {
                    Thread.sleep(1500);
                    queue.put(words[i]);
                    System.out.println("Producer added to queue: " + words[i]);
                    System.out.println("Queue size: -> " + queue.size());
                    i++;
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread consumer = new Thread(() -> {
            StringBuilder stringBuilder = new StringBuilder();
            while (!Thread.interrupted()) {
                try {
                    stringBuilder.setLength(0);
                    Thread.sleep(2800);
                    stringBuilder.append(queue.take());
                    System.out.println("Consumer: " + stringBuilder.reverse());
                    System.out.println("Queue size: -> " + queue.size());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();
    }
}
