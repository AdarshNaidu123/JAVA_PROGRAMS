class java1{
    public void run() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java Devolopers");
            Thread.sleep(2000);
        }
    }
}
class java2{
    public void run() throws Exception{
        for (int i = 0; i < 5; i++) {
            System.out.println("React Devolopers");
            Thread.sleep(2000);
        }
    }
}
public class Thread_Time_management {
    public static void main(String[] args) throws Exception {
        java1 obj1=new java1();
        java2 obj2=new java2();
        obj1.run();
        obj2.run();
    }

}
