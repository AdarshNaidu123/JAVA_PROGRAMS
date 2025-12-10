class multi extends Thread{
    public void run(){
        System.out.println("thread1");
    }
}
class multi1 extends Thread{
    public void run(){
        System.out.println("Thread2");
    }
}
public class thread {
    public static void main(String[] args) {
     Thread obj=new multi();
        Thread obj1=new multi1();
        obj.start();
        obj1.start();


    }
}
