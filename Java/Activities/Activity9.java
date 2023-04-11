package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("John");
        myList.add("Kane");
        myList.add("Roy");
        myList.add("Brook");
        myList.add("David");
        for (String name: myList
             ) {
            System.out.println(name);
        }
        System.out.println("3rd element is : "+myList.get(2));
        System.out.println(myList.contains("Brook"));
        System.out.println(myList.size());
        myList.remove(3);
        System.out.println(myList.size());
    }
}
