interface A{
    void add(int a,int b);
}
/*class B implements A{
    public void add(int a,int b){
        System.out.println(a+b);
    }
}*/
public class Anonymous {
    public static void main(String[] args) {
        A obj=new A()
        {
             public void add(int a,int b){
            System.out.println(a+b);
        }
        };
        obj.add(4,1);
    }
}
