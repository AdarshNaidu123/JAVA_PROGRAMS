import java.util.*;
public class stack {
    public static void main(String[] args) {
        Stack<Integer> number=new Stack<>();
        number.push(3);
        number.push(5);
        number.push(7);
        number.push(9);
        number.push(1);
        number.push(2);
        number.push(4);
        number.push(9);
        number.push(1);
        number.push(2);
        number.push(4);
        number.push(9);
        number.push(1);
        number.push(2);
        number.push(4);
        System.out.println(number);

        number.pop();
        System.out.println(number);

        number.pop();
        System.out.println(number);

        System.out.println(number.isEmpty());

        number.peek();
        System.out.println(number);

        System.out.println(number.size());

        System.out.println(number.capacity());


    }
}
