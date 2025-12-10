class parent {
    public void demo1() {
        System.out.println("hello parent");
    }
}
    class child extends parent{
        public void demo2(){
            System.out.println("hello parent and child");
        }
    }

public class Single_Inheritance {
    public static void main(String[] args) {
        child obj=new child();
        obj.demo1();
        obj.demo2();
    }

}
