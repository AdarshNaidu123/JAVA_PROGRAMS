import java.util.Scanner;
class person1{
    person1(String name,int age){
        System.out.println(name+" "+age);
    }
    public void details(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class Methods_Constructors {
    public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details");
  String name=sc.nextLine();
  int age=sc.nextInt();
  person1 p=new person1(name,age);
  p.details(name,age);

    }
}
