//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class outer {

    class inner{
         public void innermethod(){
            System.out.println("inner class");
        }
    }

    void details(){
        inner obj=new inner();
        obj.innermethod();
    }
}

public class Innerclass {
    public static void main(String[] args) {
outer obj=new outer();
obj.details();
    }
}