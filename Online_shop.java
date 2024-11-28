package labr;

public class Online_shop extends Thread {
    int total_items = 10;

    synchronized void run(int items) {
        if (items <= total_items) {
            System.out.println(Thread.currentThread().getName() + " - Items bought: " + items);
            total_items -= items;
            System.out.println("Remaining items: " + total_items);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Unable to buy. Not enough items.");
        }
    }
}
