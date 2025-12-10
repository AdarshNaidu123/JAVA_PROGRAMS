class car{
    String fuelType;
    int No_of_Seats;
    car(String fuelType,int No_of_Seats){
        this.fuelType=fuelType;
        this.No_of_Seats=No_of_Seats;
    }
    public void carDetails(){
        System.out.println(fuelType+" "+No_of_Seats);
    }
}
class bmw_m5 extends car{
    int price;
    String color;
    String model;
    bmw_m5( int price, String color, String model,String fuelType,int No_of_Seats){
        super(fuelType,No_of_Seats);
        this.price=price;
        this.color=color;
        this.model=model;

    }
    public void bmw_m5Details(){
        System.out.println("color="+color+"\nprice="+price+"\nmodel="+model+"\nfuelType="+fuelType+"\nNo_of_Seats="+No_of_Seats);
    }
}

class bmw_m4 extends car{
    int price1;
    String color1;
    String model1;
    bmw_m4(int price1, String color1, String model1,String fuelType,int No_of_Seats){
       super(fuelType,No_of_Seats);
        this.price1=price1;
        this.color1=color1;
        this.model1=model1;
    }
    public void bmw_m4Details(){
        System.out.println(price1+"\n"+color1+"\n"+model1+"\n"+fuelType+"\n"+No_of_Seats);

    }
}

public class hierarichal1 {
    public static void main(String[] args) {

        bmw_m5 obj=new bmw_m5(20000000,"black","m5Competition","petrol",4);
        obj.bmw_m5Details();
    }
}
