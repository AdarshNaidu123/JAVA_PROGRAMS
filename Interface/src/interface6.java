interface A2{
   void details(String name);
}
interface B2 extends A2{

    void details1(int Age);
}
class C2 implements B2{
    public void details(String name){
        System.out.println(name);
    }
    public void details1(int age){
        System.out.println(age);
    }

}
public class interface6 {
    public static void main(String[] args) {
        C2 obj=new C2();
        obj.details("AdarshNaidu");
        obj.details1(22);
    }
}
