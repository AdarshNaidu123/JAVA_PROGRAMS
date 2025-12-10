class device{
    public void parent_mobile(String name,String rom,String ram,String color,String processor){
        System.out.println(name+" "+rom+" "+ram+" "+color+" "+processor);
    }
}
class child_device extends device{
    public void parent_mobile(String model,String name,String rom,String ram,String color){
        System.out.println(model+" "+name+" "+rom+" "+ram+" "+color);
    }
    public void laptop(String name,String rom,String ram,String color,String processor){
        System.out.println(name+" "+rom+" "+ram+" "+color+" "+processor);
    }
}
public class method_overriding1 {
    public static void main(String[] args) {
        child_device obj=new child_device();
        obj.parent_mobile("y50","vivo","128gb","8gb","black");
        obj.laptop("samsungGalaxy Book4","512gb ssd","16gb","grey","i5");
    }
}
