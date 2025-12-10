class vehicle{
    String color;
    vehicle(String color){
        this.color=color;
    }
    public void vehicleDetails(){
        System.out.println(color);
    }
}

class car extends vehicle{
    String regNo;
    long price;
    car(String regNo,long price,String color){
        super(color);
        this.regNo=regNo;
        this.price=price;
    }
    public void carDetails(){
        System.out.println(regNo+" "+price+" "+color);
    }
}

class bike extends car{
    String name;
    bike(String name,String regNo,long price,String color){
        super(regNo,price,color); // ← corrected
        this.name=name;
    }
    public void bikeDetails(){
        System.out.println(name+" "+regNo+" "+price+" "+color);
    }
}

public class multilevel1 {
    public static void main(String[] args) {
        bike obj=new bike("bmws1000rr","Apo2AA1234",123456789,"black");
        obj.vehicleDetails();
        obj.carDetails();
        obj.bikeDetails();
    }
}
