class java3 extends Thread{
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
class java4 extends Thread{
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
public class MultiThreading_Time {
    public static void main(String[] args)  {
        java3 obj3=new java3();
        java4 obj4=new java4();
        obj3.start();
        obj4.start();
    }

}
