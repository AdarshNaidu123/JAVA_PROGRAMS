interface A1{ //parent 1
    void add(int a,int b);
}
interface B1{//parent 2
    void add(int c,int d);
}
class C1 implements A1,B1{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void sub(int c,int d)
    {
        System.out.println(c-d);
    }
}
public class interface5 {
    public static void main(String[] args) {
        C1 obj=new C1();
        obj.add(3,5);
        obj.sub(4,2);

    }
}
