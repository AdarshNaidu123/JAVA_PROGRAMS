abstract class anees{
    abstract void person(String name,int age);
}
class anas extends anees{
    void person(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class abstraction1 {
   public static void main(String[] args) {
        anas obj=new anas();
        obj.person("Adarsh",22);
    }
}