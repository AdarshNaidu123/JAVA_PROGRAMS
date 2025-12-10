 class dog {
     String name = "snoopy";
     int age = 2;
     String color = "brown";
 }
 class cat{
    String name="blacky";
    String color="black";
    int age=2;

 }
public class Objects {
    public static void main(String[] args) {
        dog obj=new dog();
        dog ob2=new dog();
        System.out.println(obj.name+" "+obj.age+" "+ob2.color);
         cat obj1=new cat();
        System.out.println(obj1.name+" "+obj1.color+" "+obj1.age);
    }
}
