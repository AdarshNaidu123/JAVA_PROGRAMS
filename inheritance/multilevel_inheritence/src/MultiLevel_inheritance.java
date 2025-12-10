class A{
    public void demo1(){
        System.out.println("grand parent");
    }
}
class B extends A{
    public void demo2(){
        System.out.println("parent");
    }
}
class C extends B{
    public void demo3(){
        System.out.println("child");
    }
}
public class MultiLevel_inheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.demo1();
        obj.demo2();
        obj.demo3();
    }
}
