class outer3{
    static class inner3{
        public void demo(){
            System.out.println("static inner class");
        }
    }
}
public class static_class {
    public static void main(String[] args) {
        outer3.inner3 obj=new outer3.inner3();
        obj.demo();
    }
}
