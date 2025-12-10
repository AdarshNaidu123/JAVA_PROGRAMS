public class Predefined_methods_string {
    public static void main(String[] args) {
        String str="java full stack  ";
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(2));
        System.out.println(str.contains("java"));
        System.out.println(str.equals("java full stack"));
        System.out.println(str.trim());
        System.out.println(str.substring(5,9));
        System.out.println(str.startsWith("java"));
        System.out.println(str.endsWith("python"));
        System.out.println(str.replace('v','V'));
        System.out.println(str.compareTo("java full stack"));
    }
}
