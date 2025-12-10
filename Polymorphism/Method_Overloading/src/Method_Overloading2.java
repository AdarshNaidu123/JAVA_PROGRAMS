class bank{
    public void bank1(String Name,String Address){
        System.out.println(Name+"  "+Address);
    }
    public void bank1(String Name,String Address,long Account_no){
        System.out.println(Name+"  "+Address+"  "+Account_no);
    }
}
public class Method_Overloading2 {
    public static void main(String[] args) {
        bank obj=new bank();
        obj.bank1("Axis","Banglore");
        obj.bank1("Hdfc","banglore",1234567890);
    }
}
