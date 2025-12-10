class car{
    String name="BMW M5 Competion";
    long price=20000000L;
    String color="black";
    int model=2025;
    String RegNo="AP021666";
}
class bike{
    String name="BMW S1000RR";
    int price=2000000;
    String color="white and blue";
}
public class Vehicles {
    public static void main(String[] args) {
        car c=new car();
        bike b=new bike();
        System.out.println(c.name+" "+c.price+" "+c.color+" "+c.model+" "+c.RegNo);
        System.out.println(b.name+" "+b.price+" "+b.color);
    }
}
