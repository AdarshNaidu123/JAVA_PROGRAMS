import java.util.*;
public class linked_list {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList<>();
        animals.add("lion");
        animals.add("tiger");
        animals.add("cheetah");
        animals.add("bear");
        System.out.println(animals);

        animals.add(1,"leapord");
        System.out.println(animals);

        animals.remove(1);
        System.out.println(animals);

        animals.addFirst("elephant");
        System.out.println(animals);

        animals.addLast("elephant");
        System.out.println(animals);

        System.out.println(animals.indexOf("bear"));

        System.out.println(animals.peek());

        System.out.println(animals.poll());

        animals.offer("bear");
        System.out.println(animals);


    }
}
