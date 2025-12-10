class dog1{
    String name;String breed;
    dog1(  String name,String breed){
        this.name=name;
        this.breed=breed;
    }
    public void dog1Details(){
        System.out.println(name+" "+breed);
    }
}

class babydog extends dog1 {
    String color;

    babydog(String color,String name,String breed) {
        super(name,breed);
        this.color = color;
    }
    public void babyDetails(){
        System.out.println(name+"\n"+color+"\n"+breed);
    }
}
public class Single_Inheritance1 {
    public static void main(String[] args) {
        dog1 d=new dog1("snoopy","husky");
        babydog obj=new babydog("black and white","snoopy","husky");
        d.dog1Details();
        obj.babyDetails();
    }
}
