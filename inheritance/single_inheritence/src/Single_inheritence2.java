class cat{
    String name;
    String breed;
    String color;
    cat(String name,String breed,String color){
        this.name=name;
        this.breed=breed;
        this.color=color;
    }
    public void catDetails(){
        System.out.println(name+""+breed+""+color);
    }
}
class kitten extends cat{
    String sex;
    int age;
    kitten( String sex, int age,String name,String breed,String color){
        super(name,breed,color);
        this.sex=sex;
        this.age=age;
    }
    public void kittenDetails(){
        System.out.println("Name="+name+"\nBreed="+breed+"\nColor="+color+"\nSex="+sex+"\nAge="+age);
    }
}
public class Single_inheritence2 {
    public static void main(String[] args) {
        kitten obj=new kitten("male",2,"blacky","hybrid","black");
        obj.kittenDetails();

    }
}
