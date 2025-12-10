
class shapes{
    public int area(int s){
        int a=s*s;
        return a;
    }
    public int area(int l,int b){
        int c=l*b;
        return c;
    }
    public double area(double r){
        double d=3.14*r*r;
        return d;
    }

}
public class Method_Overloading1 {
    public static void main(String[] args) {
        shapes obj=new shapes();

        System.out.println(obj.area(5));
        System.out.println(obj.area(4,6));
        System.out.println(obj.area(4.1));

    }
}
