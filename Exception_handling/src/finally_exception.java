public class finally_exception {
    public static void main(String[] args) {
        try {
            String name = null;
            System.out.println(name.length());
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("if everything works good go forward other wize there is an exception");
        }
    }
}
