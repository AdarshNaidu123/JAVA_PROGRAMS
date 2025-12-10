class parent{
    public void mobile(){
        System.out.println("Samsung");
    }
}
class child extends parent{
    public void mobile(){
        System.out.println("vivo");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        child obj=new child();
        obj.mobile();
    }
}
