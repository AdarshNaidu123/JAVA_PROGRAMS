interface Bird {
    void bird(String color, int age);
}

interface parrot extends Bird {
    void KF(String color);
}

interface Eagle extends Bird {
    void EG(String color);
}

class BClass implements parrot {
    public void bird(String color, int age) {
        System.out.println("The Parent Bird Color is : " + color);
        System.out.println("The Parent Bird Age is : " + age);
    }

    public void KF(String color) {
        System.out.println("The parrot bird color is : " + color);
    }

    public void EG(String color) {
        System.out.println("The Eagle bird color is : " + color);
    }
}

public class interface8 {
    public static void main(String[] args) {
        BClass obj = new BClass();

        obj.bird("blue", 5);
        obj.KF("green");
        obj.EG("Brown");
    }
}
