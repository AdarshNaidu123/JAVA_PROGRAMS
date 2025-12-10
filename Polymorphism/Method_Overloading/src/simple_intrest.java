class intrest{
    public int simple(int p,int r){
        return (p*r)/100;
    }
    public int simple(int p,int r,int t){
        return (p*r*t)/100;
    }
}
public class simple_intrest {
    public static void main(String[] args) {
        intrest obj=new intrest();
        int a=obj.simple(100000,8);
        int b=obj.simple(100000,8,2);
        System.out.println("princple intrest for 1 year="+a);
        System.out.println("princple intrest with time="+b);
    }
}
