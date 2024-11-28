package labr;

public class main { public static void main(String[] args) {
    Online_shop shop = new Online_shop();
    
    Thread t1 = new Thread(() -> shop.run(3));  
    Thread t2 = new Thread(() -> shop.run(5));  
    Thread t3 = new Thread(() -> shop.run(4));  
    
    t1.start();
    t2.start();
    t3.start();
    
    try {
        t1.join();
        t2.join();
        t3.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
}

}
