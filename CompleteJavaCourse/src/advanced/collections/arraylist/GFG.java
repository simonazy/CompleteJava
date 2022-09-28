package advanced.collections.arraylist;

public class GFG {

    public static void main(String[] args) {
        Pair<String, String> p1 = new Pair<String, String>("GFG", "geekforgeeks.org");
        Pair<String, String> p2 = new Pair<String, String>("Code", null);
        Pair<String, String> p3 = new Pair<String, String>("GFG", "www.geeksforgeeks.org");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.equals(p3));
    }
}
