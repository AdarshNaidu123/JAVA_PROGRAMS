class outer2{
    void demo1(){
          class inner2{
            void demo2(){

                System.out.println("method_local_inner_class");
            }
        }
        inner2 obj=new inner2();
        obj.demo2();
    }
}

public class MethodLocal_Innerclass {
    public static void main(String[] args) {
outer2 obj1=new outer2();
obj1.demo1();
    }
}
