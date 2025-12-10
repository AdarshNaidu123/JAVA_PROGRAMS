class person2{
    String name1;int age1;
    person2(String name, int age){
        name1=name;
        age1=age;
    }
    public void details1(){
        System.out.println(name1 +"\n"+age1);

    }
}
public class Methods_Constructors1 {
    public static void main(String[] args) {
        person2 p=new person2("Adarsh",18);
       p.details1();
    }
}
