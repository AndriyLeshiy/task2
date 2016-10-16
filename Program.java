

import java.util.*;
import java.util.regex.*;


public class Program {
    public static void main(String[] args) {
        MyMap m = new MyMap();

        m.put("yes", "23");
        m.put("b", "travel");
        m.put("yesterday", "34");
        m.put("5", "234");
        m.put(":yesss", ":fg, try: 30, key:'some value'");
        m.put("yesterday1", "34");
        m.put("yesteryear", "2014");

        MyMapTest test = new MyMapTest();
        test.init();
        try{
            test.test();
        }
        catch (AssertionError e){
            System.out.println("Testing error");
            return;
        }

        System.out.println("Кількість ключів які починаються на yes = " + m.count());
    }
}
