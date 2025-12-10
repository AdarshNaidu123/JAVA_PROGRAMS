class C{
    C(){
        System.out.println("hello");
    }
    C(int a){
        System.out.println(a);
    }
    C(int a ,int b){
        System.out.println(a+b);
    }

}
public class constructors {
    public static void main(String[] args) {
        C obj = new C();
        C obj1 = new C(2);
        C obj2 = new C(3,5);
    }
}
