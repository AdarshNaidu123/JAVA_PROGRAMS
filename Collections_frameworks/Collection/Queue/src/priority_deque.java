import java.util.*;
public class priority_deque {
    public static void main(String[] args) {
    PriorityQueue<String> name=new PriorityQueue<>();
        name.offer("Anas");
        name.offer("Adarsh");
        name.offer("Akash");
        name.offer("Balaji");
        name.offer("deepak");
        name.offer("Yeswanth");


        System.out.println(name);

        name.poll();
        System.out.println(name);

        name.poll();
        System.out.println(name);

        System.out.println( name.peek());

        name.remove("Balaji");
        System.out.println(name);

        name.clear();
        System.out.println(name);


    }
}
