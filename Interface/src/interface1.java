interface A{
    void greet();
        }
        class B implements A{
    public void greet(){
        System.out.println("interface concept");
    }

        }
public class interface1 {
    public static void main(String[] args) {
        B obj=new B();
        obj.greet();
    }
}
