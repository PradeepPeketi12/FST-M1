package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colors = new HashMap<>();
        colors.put(1, "Blue");
        colors.put(2, "Green");
        colors.put(3, "White");
        colors.put(4, "Grey");
        colors.put(5, "Black");
        colors.remove(3);
        System.out.println(colors);
        System.out.println("Green color existence : "+colors.containsValue("Green"));
        System.out.println("size : "+colors.size());
    }
}
