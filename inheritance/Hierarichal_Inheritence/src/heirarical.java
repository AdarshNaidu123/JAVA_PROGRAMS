class A{
    public void demo1(){
        System.out.println("parent");
    }
}
class B extends A{
    public void demo2(){
        System.out.println("child1");
    }
}
class C extends A{
    public void demo3(){
        System.out.println("child2");
    }
}
public class heirarical {
    public static void main(String[] args) {
        C obj=new C();
        obj.demo1();
        obj.demo3();

    }
}
