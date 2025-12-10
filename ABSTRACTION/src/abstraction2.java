abstract class demo{
    abstract void display();
}

class demo1 extends demo{
    @Override
    void display() {
        System.out.println("abstract method");
    }
}
public class abstraction2 {
   public static void main(String[] args) {
        demo1 obj=new demo1();
        obj.display();
    }
}