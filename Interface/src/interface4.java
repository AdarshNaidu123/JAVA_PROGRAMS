interface method{
    default int demo2(int a,int b){
        return a+b;
    }
    static void demo3(){
        System.out.println("static methods");
    }
}
class method2 implements method{
    public int demo2(int a,int b){
     return a+b;
    }
}

public class interface4{
    public static void main(String[] args) {
        method2 obj=new method2();
        int n=obj.demo2(8,8);
        System.out.println(n);
        method.demo3();

    }
}
