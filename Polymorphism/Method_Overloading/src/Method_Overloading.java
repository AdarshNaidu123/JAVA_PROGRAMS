class java{
    public void add(int a,int b){
        System.out.println(a+b);
    }
    public void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        java obj=new java();
        obj.add(2,4);
    }
}
