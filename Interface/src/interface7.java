interface A3 {
    void Add(int a, int b);
}

interface B3 extends A3 {
    void sub(int a, int b);
}

interface C3 extends A3 {
    void divide(int a, int b);
}

class D3 implements B3 {
    public void Add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void sub(int a, int b) {
        System.out.println("Subtraction: " + (a - b));
    }
}

class E3 implements C3 {
    public void Add(int a, int b) {
        System.out.println("Addition: " + (a + b));
    }

    public void divide(int a, int b) {
        System.out.println("Division: " + (a / b));
    }
}

public class interface7 {
    public static void main(String[] args) {

        System.out.println("Using D3 (Add + Sub):");
        D3 obj1 = new D3();
        obj1.Add(10, 20);
        obj1.sub(20, 5);

        System.out.println("\nUsing E3 (Add + Divide):");
        E3 obj2 = new E3();
        obj2.Add(20, 10);
        obj2.divide(20, 5);
    }
}
