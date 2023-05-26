package activities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;


public class Activity1 {
    static ArrayList<String> list;

    @BeforeAll
    public static void setup(){
        list  = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }

    @Test
    public void insertTest(){
        assertEquals(2, list.size());
        list.add("Gama");
        assertEquals(3,list.size());
        assertEquals("alpha", list.get(0));
        assertEquals("beta", list.get(1));
        assertEquals("Gama", list.get(2));
    }

    @Test
    public void replaceTest(){
        assertEquals(2, list.size());
        list.add("Delta");
        assertEquals(3, list.size());
        list.set(2, "abc");
        assertEquals("alpha", list.get(0));
        assertEquals("beta", list.get(1));
        assertEquals("abc", list.get(2));
    }
}
