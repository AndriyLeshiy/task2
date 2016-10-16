import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class MyMapTest {
    private MyMap testMap;
    @Before
    public void init(){testMap = new MyMap();}
    @After
    public void delete(){testMap = null;}

    @Test
    public void test(){
        testMap.put("yes", "23");
        testMap.put("b", "travel");
        testMap.put("yesterday", "34");
        testMap.put("5", "234");
        testMap.put(":yesss", ":fg, try: 30, key:'some value'");
        assertEquals(2,testMap.count());

        testMap = new MyMap();
        testMap.put("yes", "23");
        testMap.put("b", "travel");
        testMap.put("yesterday", "34");
        testMap.put("5", "234");
        testMap.put(":yesss", ":fg, try: 30, key:'some value'");
        testMap.put("yesterday1", "34");
        testMap.put("yesteryear", "2014");
        assertEquals(4,testMap.count());

        testMap = new MyMap();
        testMap.put("yes", "23");
        testMap.put("b", "travel");
        testMap.put("yesterday", "34");
        testMap.put("5", "234");
        testMap.put(":yesss", ":fg, try: 30, key:'some value'");
        testMap.put("yesteryear", "2014");
        assertEquals(3,testMap.count());
    }
}
