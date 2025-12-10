class java3 implements Runnable{
    public void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java Devolopers");
            try {
                Thread.sleep(10000);
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
class java4 implements Runnable{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("React Devolopers");
            try{
                Thread.sleep(1500);}
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class interface1 {
    public static void main(String[] args)  {
        java3 obj3=new java3();
        java4 obj4=new java4();
        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);
        t3.start();
        t4.start();
    }

}
