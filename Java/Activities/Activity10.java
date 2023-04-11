package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add("John");
        hs.add("Kane");
        hs.add("Roy");
        hs.add("Brook");
        hs.add("David");
        System.out.println("Size of hash set : "+hs.size());
        System.out.println(hs.remove("Roy"));
        System.out.println(hs.remove("Butler"));
        System.out.println(hs.contains("David"));
        System.out.println(hs);
    }
}
