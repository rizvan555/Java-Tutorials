public class Topic_Comparison {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b); // true
        System.out.println(a != b); // false
        System.out.println(a > b); // false
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // true
        System.out.println(a == b && a > b); // false
        System.out.println(a == b || a > b); // true
        System.out.println(!(a == b)); // false
        System.out.println(!(a != b)); // true
    }
}
